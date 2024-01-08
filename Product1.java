import java.util.Scanner;

class Product {
    static void readData(int x, int y) throws IllegalArgumentException {
        try {
            if (x == 0 || y == 0) {
                throw new IllegalArgumentException("Answer is zero");
            } else {
                int product = x * y;
                System.out.println("Product = " + product);
            }
        } catch (IllegalArgumentException c) {
            System.out.println(c.getMessage());
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            readData(x, y);
        } finally {
            scanner.close();
        }
    }
}
