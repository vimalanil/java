import java.awt.*;
import javax.swing.*;
public class JTextFieldDemo extends JApplet
{
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
JTextField jtf=new JTextField("This is a demo of Text Field");
contentPane.add(jtf);
}
}