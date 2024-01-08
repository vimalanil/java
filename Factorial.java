import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Factorial extends JApplet implements ActionListener
{
JButton b1;
JLabel l1,l2;
JTextField t1,t2;
int num;
long fact;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
l1=new JLabel("Enter the value:");
t1=new JTextField(20);
l2=new JLabel("Factorial");
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
num=Integer.parseInt(t1.getText());
if(str.equals("Result"))
{
fact=1;
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
}
t2.setText(String.valueOf(fact));
repaint();
}
}