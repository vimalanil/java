import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class PosNeg extends JApplet implements ActionListener
{
JButton b1;
JLabel l1,l2;
JTextField t1,t2;
int r;
String z;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
l1=new JLabel("Enter the Number:");
t1=new JTextField(20);
l2=new JLabel("Result:");
t2=new JTextField(20);
b1=new JButton("Check");
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
r=Integer.parseInt(t1.getText());

if(str.equals("Check"))
{
if(r<0)
z="Negetive Number";
else if(r>0)
z="Positive Number";
else
z="Neither positive nor negetive";
}

t2.setText(String.valueOf(z));
repaint();
}
}