import pack.Operations;
import java.io.DataInputStream;
class Op
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
double result;
Operations a1=new Operations();
int ch;
do
{
System.out.println("enter two numbers");
double a=Double.parseDouble(in.readLine());
double b=Double.parseDouble(in.readLine());
System.out.println("enter your choice  1.add  2 subtract  3.multiply  4.divide  5.modulous  6.exit");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:result=a1.add(a,b);
System.out.println("sum="+result);
break;
case 2:result=a1.subtract(a,b);
System.out.println("difference="+result);
break;
case 3:result=a1.multiply(a,b);
System.out.println("product="+result);
break;
case 4:result=a1.divide(a,b);
System.out.println("divide="+result);
break;
case 5:result=a1.modulous(a,b);
System.out.println("modulous="+result);
break;
case 6:break;
default:System.out.println("invalid option");
break;
}
}while(ch!=6);
}
catch(Exception e){}
}
}