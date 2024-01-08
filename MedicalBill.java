import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MedicalBill extends JApplet implements ActionListener,ItemListener
{
String str1;
JButton jb1;
JCheckBox jc1,jc2,jc3;
JLabel jl1,jl2,jl3;
JTextField jtf1,jtf2,jtf3;
int amount,xray=500,bloodtest=1000,uscan=5000;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
jl1=new JLabel("Patient ID:");
jl2=new JLabel("Patient Name:");
jl3=new JLabel("Patient Amount:");
jtf1=new JTextField(20);
jtf2=new JTextField(20);
jtf3=new JTextField(20);
jc1=new JCheckBox("X-ray");
jc2=new JCheckBox("Blood test");
jc3=new JCheckBox("Ultra sound scan");
jb1=new JButton("Bill");
contentPane.add(jl1);
contentPane.add(jtf1);
contentPane.add(jl2);
contentPane.add(jtf2);
contentPane.add(jc1);
contentPane.add(jc2);
contentPane.add(jc3);
contentPane.add(jl3);
contentPane.add(jtf3);
contentPane.add(jb1);
jb1.addActionListener(this);
jc1.addItemListener(this);
jc2.addItemListener(this);
jc3.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
if(jc1.isSelected()==true&&jc2.isSelected()==true&&jc3.isSelected()==true)
amount=xray+bloodtest+uscan;
if(jc1.isSelected()==true&&jc2.isSelected()==true&&jc3.isSelected()==false)
amount=xray+bloodtest;
if(jc1.isSelected()==true&&jc2.isSelected()==false&&jc3.isSelected()==true)
amount=xray+uscan;
if(jc1.isSelected()==false&&jc2.isSelected()==true&&jc3.isSelected()==true)
amount=bloodtest+uscan;
if(jc1.isSelected()==true&&jc2.isSelected()==false&&jc3.isSelected()==false)
amount=xray;
if(jc1.isSelected()==false&&jc2.isSelected()==true&&jc3.isSelected()==false)
amount=bloodtest;
if(jc1.isSelected()==false&&jc2.isSelected()==false&&jc3.isSelected()==true)
amount=uscan;
if(jc1.isSelected()==false&&jc2.isSelected()==false&&jc3.isSelected()==false)
amount=0;
}
public void actionPerformed(ActionEvent ae)
{
str1=ae.getActionCommand();
if(str1.equals("Bill"))
{
jtf3.setText(String.valueOf(amount));
repaint();
}
}
}