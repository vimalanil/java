import java.io.DataInputStream;
class AgeNotWithinRangeException extends Exception
{
public AgeNotWithinRangeException()
{
super();
}
}
class NameNotValidException extends Exception
{
public NameNotValidException()
{
super();
}
}
class ExStudent
{
static void checkAge(int a) throws AgeNotWithinRangeException
{
try
{
if(a<15||a>21)
throw new AgeNotWithinRangeException();
}
catch(AgeNotWithinRangeException e)
{
System.out.println("the entered age is not within 15 and 21");
System.exit(0);
}
}
static void checkName(String name) throws NameNotValidException
{
try
{
for(int i=0;i<name.length();i++)
if (!Character.isLetter(name.charAt(i)))
throw new NameNotValidException();
}
catch(NameNotValidException e)
{
System.out.println("entered name is not valid:");
System.exit(0);
}
}
static void displayData(int r,String n,int a,String c)
{
System.out.println("rollno="+r);
System.out.println("name="+n);
System.out.println("age="+a);
System.out.println("course="+c);
}
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter rollno:");
int r=Integer.parseInt(in.readLine());
System.out.println("enter name:");
String n=in.readLine();
checkName(n);
System.out.println("enter age:");
int a=Integer.parseInt(in.readLine());
checkAge(a);
System.out.println("enter course:");
String c=in.readLine();
displayData(r,n,a,c);
}
catch(Exception e)
{}
}
}