import java.io.DataInputstream;
class MatrixSymmetric
{
static int[][] readMatrix()
{
int a[][]={};
try{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the order of the matrix:");
int n=Integer.parseInt(in.readLine());
a=new int[n][n];
System.out.println("enter the elements:");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
a[i][j]=Integer.parseInt(in.readLine());
}
}
}
catch(Exception e){}
}
static void printMatrix(int [][] a)
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
System.out.println(a[i][j]+" ")
}
System.out.println();
}
}
static void checkSymmetry(int[][] a)
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
for(a[i][j]!=a[j][i])
{
System.out.println("matrix is not symmetric");
return;
}
}
}
System.out.println("matrix is symmetric");
}
public static void main(string args[])
{
int arr[][]=readMatrix();
System.out.println("matrix elements")
printMatrix(arr);
checkSymmetry(arr);
}
}