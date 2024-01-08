import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Reverse extends JApplet implements ActionListener
{
JButton b1;
JLabel l1,l2;
JTextField t1,t2;
int num,rev;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
l1=new JLabel("Enter the integer:");
t1=new JTextField(20);
l2=new JLabel("Reverse of the number:");
t2=new JTextField(20);
b1=new JButton("Reverse");
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
num=Integer.parseInt(t1.getText());
if(str.equals("Reverse"))
{
rev=0;
while (num!=0) 
{
int digit=num % 10;
rev=rev*10+digit;
num=num/10;
}
}
t2.setText(String.valueOf(rev));
repaint();
}
}