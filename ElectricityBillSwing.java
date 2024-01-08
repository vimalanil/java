import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ElectricityBillSwing extends JApplet implements ActionListener,ItemListener
{
String str;
JButton jb1;
ButtonGroup bg;
JRadioButton jrb1,jrb2;
JLabel jl1,jl2,jl3,jl4,jl5,jl6;
JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6;
int units,creading,preading,amount;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
jl1=new JLabel("Consumer Number:");
jl2=new JLabel("Consumer Name:");
jl3=new JLabel("Current Reading:");
jl4=new JLabel("Previous Reading:");
jl5=new JLabel("Units Consumed:");
jl6=new JLabel("Total Amount:");
jtf1=new JTextField(20);
jtf2=new JTextField(20);
jtf3=new JTextField(20);
jtf4=new JTextField(20);
jtf5=new JTextField(20);
jtf6=new JTextField(20);
bg=new ButtonGroup();
jrb1=new JRadioButton("Domestic");
jrb2=new JRadioButton("Commercial");
bg.add(jrb1);
bg.add(jrb2);
jb1=new JButton("Bills");
contentPane.add(jl1);
contentPane.add(jtf1);
contentPane.add(jl2);
contentPane.add(jtf2);
contentPane.add(jl3);
contentPane.add(jtf3);
contentPane.add(jl4);
contentPane.add(jtf4);
contentPane.add(jrb1);
contentPane.add(jrb2);
contentPane.add(jl5);
contentPane.add(jtf5);
contentPane.add(jl6);
contentPane.add(jtf6);
contentPane.add(jb1);
jb1.addActionListener(this);
jrb1.addItemListener(this);
jrb2.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
creading=Integer.parseInt(jtf3.getText());
preading=Integer.parseInt(jtf4.getText());
units=creading-preading;
if(jrb1.isSelected()==true)
{
if(units<=100)
amount=units*2;
else
amount=100*2+(units-100)*3;
}
if(jrb2.isSelected()==true)
{
if(units<=100)
amount=units*4;
else
amount=100*4+(units-100)*8;
}
}
public void actionPerformed(ActionEvent ae)
{
str=ae.getActionCommand();
if(str.equals("Bills"))
{
jtf5.setText(String.valueOf(units));
jtf6.setText(String.valueOf(amount));
repaint();
}
}
}


