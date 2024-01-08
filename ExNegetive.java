import java.io.DataInputStream;
class NegetiveException extends Exception
{
public NegetiveException()
{
super();
}
}
class ExNegetive
{
static void readData(int a) throws NegetiveException
{
try
{
if(a<0)
throw new NegetiveException();
}
catch(NegetiveException ne)
{
System.out.println("entered a negetive number");
System.exit(0);
}
}
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter n:");
int n=Integer.parseInt(in.readLine());
System.out.println("enter n numbers:");
for(int i=0;i<n;i++)
{
int a=Integer.parseInt(in.readLine());
readData(a);
}
}
catch(Exception e){}
}
}