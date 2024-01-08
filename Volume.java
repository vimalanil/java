import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Volume extends JApplet implements ActionListener
{
JButton b1;
JLabel l1,l2;
JTextField t1,t2;
double r,z,p=3.14;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
l1=new JLabel("Enter the value:");
t1=new JTextField(20);
l2=new JLabel("Volume:");
t2=new JTextField(20);
b1=new JButton("Result");
contentPane.add(l1);
contentPane.add(t1);
contentPane.add(l2);
contentPane.add(t2);
contentPane.add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
r=Double.parseDouble(t1.getText());
if(str.equals("Result"))
z=(4.0/3.0)*p*r*r*r;
t2.setText(String.valueOf(z));
repaint();
}
}