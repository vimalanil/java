import java.io.DataInputStream;
class StringBufferDemo
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int ch=0;
do
{
System.out.println("your choices are 1.charAt()  2.setCharAt()  3.append()  4.insert()  5.exit");
System.out.println("enter your choice:");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:System.out.println("enter the string:");
String s1=in.readLine();
System.out.println("enter the position of the character to be printed");
int n=Integer.parseInt(in.readLine());
char c1=s1.charAt(n);
System.out.println(c1);
break;
case 2:System.out.println("enter the string:");
String s2=in.readLine();
System.out.println("enter the string to be appended:");
String s3=in.readLine();
s2.append(s3);
System.out.println(s3);
break;
case 5:break;
default:System.out.println("invalid input");
}
}while(ch!=5);
}catch(Exception e)
{}
}
}
