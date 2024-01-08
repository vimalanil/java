import java.io.DataInputStream;
class StringCase
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int ch=0;
do
{
System.out.println("your choice 1.extract  2. concatenate  3.replace  4.convert to uppercase  5.convert to lower case  6.trim  7.exit");
System.out.println("enter your choice:");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:System.out.println("enter the string:");
String s1=in.readLine();
System.out.println("enter the starting position of the substring that is to be extracted:");
int n=Integer.parseInt(in.readLine());
String sub1=s1.substring(n);
System.out.println(sub1);
break;
case 2:System.out.println("enter string 1:");
String s2=in.readLine();
System.out.println("enter string 2:");
String s3=in.readLine();
s3=s2.concat(s3);
System.out.println(s3);
break;
case 3:System.out.println("enter the string:");
String s4=in.readLine();
System.out.println("enter the character to be replaced:");
String s5=in.readLine();
char c1=s5.charAt(0);
System.out.println("enter the new character:");
String s6=in.readLine();
char c2=s6.charAt(0);
s4=s4.replace(c1,c2);
System.out.println("the new string is "+s4);
break;
case 4:System.out.println("enter the string :");
String s7=in.readLine();
s7=s7.toUpperCase();
System.out.println(s7);
break;
case 5:System.out.println("enter the string:");
String s8=in.readLine();
s8=s8.toLowerCase();
System.out.println(s8);
break;
case 6:System.out.println("enter the string:");
String s9=in.readLine();
String s10=s9.trim();
System.out.println(s9);
System.out.println(s10);
break;
case 7:break;
default:System.out.println("invalid choice");
break;
}
}while(ch!=7);
}catch(Exception e)
{}
}
}