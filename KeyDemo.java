import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class KeyDemo extends Applet implements KeyListener
{
String msg="";
int x=10,y=20;
public void init()
{
addKeyListener(this);
requestFocus();
}
public void keyPressed(KeyEvent ke)
{
showStatus("Key Down");
repaint();
}
public void keyReleased(KeyEvent ke)
{
showStatus("KeyUp");
repaint();
}
public void keyTyped(KeyEvent ke)
{
msg+=ke.getKeyChar();
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,x,y);
}
}