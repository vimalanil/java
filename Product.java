import java.io.DataInputStream;
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
}