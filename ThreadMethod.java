class A extends Thread
{
public void run()
{
for(int i=1;i<5;i++)
{
if(i==3) yield();
System.out.println("thread A:"+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("thread B:"+j);
if(j==3) stop();
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
System.out.println("threas c:"+k);
if(k==1)
try
{
sleep(1000);
}
catch(Exception e)
{}
}
System.out.println("Exit from c");
}
}
class ThreadMethod
{
public static void main(String args[])
{
A ThreadA=new A();
B ThreadB=new B();
C ThreadC=new C();
System.out.println("Start thread A");
ThreadA.start();
System.out.println("Start thread B");
ThreadB.start();
System.out.println("Start thread C");
ThreadC.start();
System.out.println("end of main Thread");
}
}
