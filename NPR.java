import pack.F;
import java.io.DataInputStream;
class NPR
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
F fact=new F();
System.out.println("enter n:");
int n=Integer.parseInt(in.readLine());
System.out.println("enter R:");
int r=Integer.parseInt(in.readLine());
int p=n-r;
int num=fact.factorial(n);
int denom=fact.factorial(p);
int res=num/denom;
System.out.println("permutation of "+n+"and"+r+"and"+res);
int rfact=fact.factorial(r);
int comb=num/(denom*rfact);
System.out.println("combination of "+n+"and"+r+"="+comb);
}
catch(Exception e)
{}
}
}