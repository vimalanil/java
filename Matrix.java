import pack.Prime;
import java.io.DataInputStream;
class Matrix{
public static void main(String args[])
{
static int[][] readMatrix() {
int a[][] = {};
try {
DataInputStream in = new DataInputStream(System.in);
System.out.println("enter the no of rows of the matrix:");
 int m = Integer.parseInt(in.readLine());
 System.out.println("enter the no of columns of the matrix:");
int n = Integer.parseInt(in.readLine());
a = new int[m][n];
 System.out.println("enter matrix elements:");
for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
a[i][j] = Integer.parseInt(in.readLine());
}
}
int sum = 0;
for (int i = 0; i < a.length; i++) 
{
sum = sum + a[i][i];
}
Prime A = new Prime();
A.PrimeCheck(sum);
} catch (Exception e) {
}
return a;
}
}
}

