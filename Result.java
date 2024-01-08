 import java.io.DataInputStream;
class MarksOutOfBoundsException extends Exception
{
public MarksOutOfBoundsException()
{
super();
}
}
class Result
{
static void checkMarks(int s,int t,int u) throws MarksOutOfBoundsException
{
try
{
if((s<0 || t<0 || u<0)||(s>100 || t>100 || u>100))
{
throw new MarksOutOfBoundsException();
}
}
catch(MarksOutOfBoundsException c)
{
System.out.println("Enterd marks is not valid");
System.exit(0);
}
}
static void displayData(String p,int q,String r,int s,int t,int u)
{
System.out.println("Name:"+p);
System.out.println("Reg no:"+q);
System.out.println("Date:"+r);
System.out.println("Marks:"+"\n"+s+"\n"+t+"\n"+u);
int total=s+t+u;
System.out.println("Total Marks:"+total);
}
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the name:");
String p=in.readLine();
System.out.println("enter the register no:");
int q=Integer.parseInt(in.readLine());
System.out.println("enter the date:");
String r=in.readLine();
System.out.println("enter the three semester marks:");
int s=Integer.parseInt(in.readLine());
int t=Integer.parseInt(in.readLine());
int u=Integer.parseInt(in.readLine());
checkMarks(s,t,u);
displayData(p,q,r,s,t,u);
}
catch(Exception e)
{}
}
}


