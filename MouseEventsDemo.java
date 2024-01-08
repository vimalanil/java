import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MouseEventsDemo extends Applet implements MouseListener,MouseMotionListener
{
String msg="";
int mousex,mousey;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
mousex=0;
mousey=10;
msg="Mouse Clicked";
repaint();
}
public void mouseEntered(MouseEvent me)
{
mousex=0;
mousey=10;
msg="Mouse entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
mousex=0;
mousey=10;
msg="mouse excited";
repaint();
}
public void mousePressed(MouseEvent me)
{
mousex=me.getX();
mousey=me.getY();
msg="Mouse Down";
repaint();
}
public void mouseReleased(MouseEvent me)
{
mousex=me.getX();
mousey=me.getY();
msg="Mouse Up";
repaint();
}
public void mouseDragged(MouseEvent me)
{
mousex=me.getX();
mousey=me.getY();
msg="+";
showStatus("dragging  mouse at"+mousex+","+mousey);
repaint();
}
public void mouseMoved(MouseEvent me) 
{
showStatus("Moving mouse at"+me.getX()+","+me.getY());
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,mousex,mousey);
}
}
