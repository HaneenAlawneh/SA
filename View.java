import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame  {
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JTextField t1;
	private JTextField t2;
	public JTextField t3;
	private JButton b1 ;
	private JButton b2 ;
	private JButton b3 ;
	private JButton b4 ;
	private JPanel p1,p2,p3;
	public int f;
	public int s;
	public int o;
	
	
	public View()
	{
		
super("Haneen's Cal");

	l1= new JLabel("First number");
	l2=new JLabel("Second number");
	l3= new JLabel ("result");
	
	b1= new JButton("+");
	b2= new JButton("-");
	b3= new JButton("/");
	b4= new JButton("*");
	
	t1= new JTextField(10);
	t2= new JTextField(10);
	t3= new JTextField(10);
	p1 = new JPanel ();
	
	p1.add(l1);
	p1.add(t1);
	p1.add(l2);
	p1.add(t2);
	
p2 = new JPanel ();
	
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);
	p2.add(b4);
	
p3 = new JPanel ();
	
	p3.add(l3);
	p3.add(t3);
	
	add(p1, BorderLayout.NORTH);
	add(p2, BorderLayout.CENTER);
	add(p3, BorderLayout.SOUTH);
	setSize(500,200);
	handler h1= new handler();
	b1.addActionListener(h1);
	b2.addActionListener(h1);
	b3.addActionListener(h1);
	b4.addActionListener(h1);
	
		
	}
	
	 
	private class handler implements ActionListener {
	public void actionPerformed (ActionEvent e )
	{
	
		 f = Integer.parseInt(t1.getText());
		 s = Integer.parseInt(t2.getText());
				if(e.getSource()==b1)
		{
			o=1;
			
		}
		
		if(e.getSource()==b2)
		{
			o=2;
			
			
		}
		
		if(e.getSource()==b3)
		{
			o=3;

			
		}
		if(e.getSource()==b4)
		{
			o=4;
			
		}

		
		
		
	}
	}
	
	public int geto()
	{
		return o;
	}
	
	public int getf()
	{
		return f;
	}
	
	public int gets()
	{
		return s;
	}
	public void seto(int x)
	{
		o=x;
	}
	public void setf(int x)
	{
		f=x;
	}
	public void sets(int x)
	{
		s=x;
	}
	
	
	

	}


