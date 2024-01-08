import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Larger extends JApplet implements ActionListener
{
JButton b1;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
int a,b;
String result;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
l1=new JLabel("Enter the first number");
t1=new JTextField(20);
l2=new JLabel("Enter the second number");
t2=new JTextField(20);
l3=new JLabel("Answer");
t3=new JTextField(20);
b1=new JButton("Check");
contentPane.add(l1);
contentPane.add(t1);
contentPane.add(l2);
contentPane.add(t2);
contentPane.add(l3);
contentPane.add(t3);
contentPane.add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
if(str.equals("Check"))
{
if(a>b)
result=a+" is larger";
else if(b>a)
result=b+" is larger";
else
result="both are equal";
}
t3.setText(String.valueOf(result));
repaint();
}
}