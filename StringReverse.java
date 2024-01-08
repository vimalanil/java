import java.io.DataInputStream;
class StringReverse
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the string:");
String s=in.readLine();
for(int j=s.length()-1;j>=0;j--)
{
System.out.print(s.charAt(j));
}
System.out.println(" is the reversed string ");
}
catch(Exception e)
{}
}
}
