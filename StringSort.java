import java.io.DataInputStream;
class StringSort {
public static void main(String args[]) {
try {
DataInputStream in = new DataInputStream(System.in);
System.out.println("Enter the number of strings to be sorted:");
int n = Integer.parseInt(in.readLine());
String s[] = new String[n];
System.out.println("Enter the strings:");
for (int i = 0; i < n; i++)
s[i] = in.readLine();
for (int i = 0; i < n - 1; i++) {
for (int j = i + 1; j < n; j++) {
if (s[j].compareToIgnoreCase(s[i]) < 0) {
String t = s[i];
s[i] = s[j];
s[j] = t;
}
}
}
 System.out.println("Sorted strings:");
for (int i = 0; i < n; i++)
System.out.println(s[i]);
} catch (Exception e) {
}
}
}
