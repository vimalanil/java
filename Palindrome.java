import java.io.DataInputStream;
class Palindrome
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the string");
String s=in.readLine();
int i,j,flag=0;
int k=s.length()/2;
for(i=0,j=s.length()-1;j>=k;i++,j--)
{
if(s.charAt(i)!=s.charAt(j))
{
flag=1;
break;
}
}
if(flag==1)
System.out.println(s+" is not a palindrome");
else
System.out.println(s+" is a palindrome");
}
catch(Exception e)
{}
}
}