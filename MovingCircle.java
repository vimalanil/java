import java.awt.*;
import java.applet.*;
public class MovingCircle extends Applet
{
public void paint(Graphics g)
{
try
{
for(int i=10;i!=0;i=i+5)
{
g.setColor(Color.black);
g.drawOval(i,10,60,60);
Thread.sleep(1000);
g.setColor(Color.white);
g.drawOval(i,10,60,60);
}
}
catch(Exception e)
{}
}
}
