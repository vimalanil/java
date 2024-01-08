import java.io.DataInputStream;
class IllegalArgumentException extends Exception
{
public IllegalArgumentException()
{
super();
}
}
class MultipleException
{
static void readData(int a,int b)throws IllegalArgumentException
{
try
{
if((a==0)||(b==0))
throw new IllegalArgumentException();
}
catch(IllegalArgumentException e)
{
System.out.println("answer is zero");
System.exit(0);
}
}
static void  product(int x,int y)
{
int z=x*y;
System.out.println("the product="+z);
}
public static voidimport java.io.DataInputStream;
class ProdNeg extends IllegalArgumentException
{
public ProdNeg()
{
super();
}
}
class Product
{
static void readData(int x,int y) throws ProdNeg
{
try
{
if(x==0||y==0)
throw new ProdNeg();
else
{
int product=x*y;
System.out.println("Product="+product);
}
}
catch(ProdNeg c)
{
System.out.println("Answer is zero");
System.exit(0);
}
}
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter two numbers");
int x=Integer.parseInt(in.readLine());
int y=Integer.parseInt(in.readLine());
readData(x,y);
}
catch(Exception e)
{}
}
} main(String args[])
{
try 
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the two numbers:");
int a=Integer.parseInt(in.readLine());
int b=Integer.parseInt(in.readLine());
readData(a,b);
product(a,b);
}
catch(Exception e){}
}
}