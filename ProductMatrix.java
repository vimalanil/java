import java.io.DataInputStream;
class ProductMatrix
{
static int[][] readMatrix()
{
int a[][]={};
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the no of rows of the matrix:");
int m=Integer.parseInt(in.readLine());
System.out.println("enter the no fo columns of the matrix:");
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
catch(Exception e)
{}
return a;
}
static void printMatrix(int [][] a)
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
static int[][] product(int [][] a,int[][] b)
{
int m=a.length;
int n=a[0].length;
int p=b[0].length;
int c[][]=new int[m][p];
for(int i=0;i<m;i++)
{
for(int j=0;j<p;j++)
{
int sum=0;
for(int k=0;k<n;k++)
{
sum=sum+(a[i][k]*b[k][j]);
}
c[i][j]=sum;
}
}
return c;
}
static int[][] scalar(int [][] d)
{
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the value to perform scalar mulplication");
int num=Integer.parseInt(in.readLine());
int m=d.length;
int n=d[0].length;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
d[i][j]=num*d[i][j];
}
}
}
catch(Exception e)
{}
return d;
}
public static void main(String args[])
{
System.out.println("matrix 1");
int a[][]=readMatrix();
System.out.println("matrix 2");
int b[][]=readMatrix();
if(a[0].length!=b.length)
System.out.println("matrix are not eligible for addition");
else
{
int c[][]=product(a,b);
System.out.println("first matrix ");
printMatrix(a);
System.out.println("second matrix");
printMatrix(b);
System.out.println("resultant matrix");
printMatrix(c);
System.out.println("\n"+"Matrix for scalar multiplication"+"\n");
int d[][]=readMatrix();
scalar(d);
printMatrix(d);
}
}
}

