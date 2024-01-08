import java.io.DataInputStream;
class TransposeMatrix
{
static int[][] readmatrix()
{
int a[][]={};
try 
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the no of rows of the matrix:");
int m=Integer.parseInt(in.readLine());
System.out.println("enter the no of columns of the matrix:");
int n=Integer.parseInt(in.readLine());
a=new int[m][n];
System.out.println("enter the matrix elements:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(in.readLine());
}
}
}
catch(Exception e){}
return a;
}
static void printMatrix(int [][] a)
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
static int[][] matrixTranspose(int[][] a)
{
int n=a.length;
int m=a[0].length;
int b[][]=new int[n][m];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
b[i][j]=a[j][i];
}
}
return b;
}
public static void main(String args[])
{
System.out.println("enter the matrix:");
int a[][]=readmatrix();
System.out.println("matrix is :");
printMatrix(a);
int b[][]=matrixTranspose(a);
System.out.println("transpose is:");
printMatrix(b);
}
}