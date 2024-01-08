package pack;
public class Prime
{
public int PrimeCheck(int x)
{
int flag=0;
for(int i=2;i<=Math.sqrt(x);i++)
{
if(x%i==0)
{
System.out.println(Math.sqrt(x)+"is not a prime");
flag=1;
break;
}
}
return(flag);
}
}