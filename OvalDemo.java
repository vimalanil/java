import java.awt.*;
import java.applet.*;
public class OvalDemo extends Applet
{
public void paint(Graphics g)
{
g.drawOval(10,10,75,100);
g.setColor(Color.green);
g.fillOval(100,30,100,100);
}
}