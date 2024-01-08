import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class MedicalBillList extends JApplet implements ListSelectionListener,ActionListener
{
String str1;
JButton jb1;
JList jlist1;
int items[];
String test[]={"X=ray","Blood test","Ultrasound Scan"};
JLabel jl1,jl2,jl3;
JTextField jtf1,jtf2,jtf3;
int amount,xray=500,bloodtest=1000,uscan=5000;
public void init()
{
Container contentPane=getContentPane();
contentPane.setLayout(new FlowLayout());
jl1=new JLabel("Patient id");
jl2=new JLabel("Patient Name");
jl3=new JLabel("Total amount");
jtf1=new JTextField(20);
jtf2=new JTextField(20);
jtf3=new JTextField(20);
jlist1=new JList(test);
jlist1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
jb1=new JButton("Bill");
contentPane.add(jl1);
contentPane.add(jtf1);
contentPane.add(jl2);
contentPane.add(jtf2);
contentPane.add(jlist1);
contentPane.add(jl3);
contentPane.add(jtf3);
contentPane.add(jb1);
jb1.addActionListener(this);
jlist1.addListSelectionListener(this);
}
public void valueChanged(ListSelectionEvent lse)
{
amount=0;
int items[]=jlist1.getSelectedIndices();
for(int i=0;i<items.length;i++)
{
if(items[i]==0)
amount=amount+xray;
if(items[i]==1)
amount=amount+bloodtest;
if(items[i]==2)
amount=amount=uscan;
}
}
public void actionPerformed(ActionEvent ae)
{
String str1=ae.getActionCommand();
if(str1.equals("Bill"))
{
jtf3.setText(String.valueOf(amount));
repaint();
}
}
}
/*<html>
<title>MedicalBillList</title>
<applet code="MedicalBillList" width="400" height="600">
</applet>
</html>*/