import java.awt.*;
import javax.swing.*;
public class JlabelDemo extends JApplet
{
public void init()
{
Container contentPane=getContentPane();
ImageIcon ic=new ImageIcon("GLOBE.GIF");
JLabel j=new JLabel("GLOBE",ic,JLabel.CENTER);
contentPane.add(j);
}
}
