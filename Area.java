import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Area extends JApplet implements ActionListener
{
JButton b1;
JLabel l1,l2;
JTextField t1,t2;
double r,z,p=3.14;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(null);
l1=new JLabel("Enter the value:");

t1=new JTextField(20);
l2=new JLabel("Area:");
t2=new JTextField(20);
b1=new JButton("Result");
l1.setBounds(30,30,300,10);
contentPane.add(l1);
l1.setBounds(190,30,180,20);
contentPane.add(t1);
l1.setBounds(30,80,300,10);
contentPane.add(l2);
l1.setBounds(190,80,180,20);
contentPane.add(t2);
l1.setBounds(30,120,150,20);
contentPane.add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
r=Double.parseDouble(t1.getText());
if(str.equals("Result"))
z=p*r*r;
t2.setText(String.valueOf(z));
repaint();
}
}