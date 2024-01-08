import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JApplet implements ActionListener
{
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	double x,y,z;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		l1=new JLabel("First Number:");
		l2=new JLabel("Second Number:");
		l3=new JLabel("Answer:");

		tf1=new JTextField(20);
		tf2=new JTextField(20);
		tf3=new JTextField(20);

		b1=new JButton("Add");
		b2=new JButton("Substract");
		b3=new JButton("Multiply");
		b4=new JButton("Divide");

		contentPane.add(l1);
		contentPane.add(tf1);
		contentPane.add(l2);
		contentPane.add(tf2);
		contentPane.add(l3);
		contentPane.add(tf3);
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
{
	String str=ae.getActionCommand();
	x=Double.parseDouble(tf1.getText());
	y=Double.parseDouble(tf2.getText());
	if(str.equals("Add"))
	z=x+y;
	if(str.equals("Substract"))
	z=x-y;
	if(str.equals("Multiply"))
	z=x*y;
	if(str.equals("Divide"))
	z=x/y;
	tf3.setText(String.valueOf(z));
	repaint();
}
}
/*<html>
<title>SimpleCalculator</title>
<applet code="SimpleCalculator" width="400" height="600">
</applet>
</html>*/