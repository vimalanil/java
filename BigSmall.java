import java.io.DataInputStream;
class BigSmall{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the length of the array:");
int n=Integer.parseInt(in.readLine());
int a[]=new int[n];
System.out.println("enter array elements:");
for(int i=0;i<n;i++)
{
a[i]=Integer.parseInt(in.readLine());
}
int big=a[0];
int small=a[0];
for(int i=1;i<n;i++)
{
if(a[i]>big)
big=a[i];
if(a[i]<small)
small=a[i];
}
System.out.println("big="+big);
System.out.println("small="+small);
}
catch(Exception e){}
}
}