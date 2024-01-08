import java.io.DataInputStream;
class AddMatrix
{
static int[][] readMatrix()
{
int a[][]={};
try{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the no of rows of the matrix:");
int m=Integer.parseInt(in.readLine());
System.out.println("enter the no of columns of the matrix:");
int n=Integer.parseInt(in.readLine());
a=new int[m][n];
System.out.println("enter matrix elements:");
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
static void printMatrix(int [][]a)
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
static int[][] matrixAddition(int [][]a,int [][]b)
{
int m=a.length;
int n=a[0].length;
int c[][]=new int[m][n];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
return c;
}
public static void main(String args[])
{
System.out.println("matrix 1");
int a[][]=readMatrix();
System.out.println("matrix 2");
int b[][]=readMatrix();
if((a.length!=b.length)||(a[0].length!=b[0].length ))
System.out.println("matrix are not eligible for addition");
else
{
int c[][]=matrixAddition(a,b);
System.out.println("first matrix");
printMatrix(a);
System.out.println("second matrix");
printMatrix(b);
System.out.println("resultant matrix:");
printMatrix(c);
}
}
}