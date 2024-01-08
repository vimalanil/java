import pack.Prime;
import java.io.DataInputStream;
class Prime
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in)
int n1=n;
int f1,f2=0;
f1=P.PrimeCheck(n);
if(f1==0)
{
while(n!=0)
{
int r=n%10;
n=n/10;
f2=p.Prime(check(r));
if(f2==1)
break;
}
}
if(f1==1)
System.out.println("number is not prime");
if((f1==0)&&(f2==1))
System.out.println("number is prime but digits are not prime");
if((f1==0)&&(f2==1))
System.out.println("number and digits are prime");
}
catch(Exception e)
{}
}
}
