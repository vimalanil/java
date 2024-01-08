class A extends Thread
{
public void run()
{
char ch='A';
for(int i=1;i<=5;i++)
{
try
{
System.out.println(ch);
ch++;
sleep(1500);
}
catch(Exception c)
{}
}
}
}
class B extends Thread 
{
public void run()
{
char c='a';
for(int j=1;j<=5;j++)
{
try 
{
System.out.println(c);
c++;
sleep(1000);
}
catch(Exception e){}
}
}
}
class ThreadEx
{
public static void main(String args[])
{
A ThreadA=new A();
B ThreadB=new B();
ThreadA.start();
ThreadB.start();
}
}
