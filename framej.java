package pck3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;


public class framej implements ActionListener,ItemListener , MouseListener,KeyListener,WindowListener{
	
	JTextField t;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JTextField t7,t8,t9;
	JTextField tf ;
	JTextField tf1 ;
	JTextField tf2 ;
	JCheckBox cb,cb1,cb2;
	JRadioButton c,c2;
	String jj;
	String kk;
	String ll,z;
	JComboBox<String> ch;
	ButtonGroup cg;
	ButtonGroup cg1;
	
	JFrame f= new JFrame();
	framej()
	{
		JLabel lb= new JLabel("Enter Name");
		lb.setBounds(50, 50, 70, 35);
		lb.setForeground(Color.black);
		f.add(lb);
		
	    t = new JTextField();
		t.setBounds(100, 400, 200, 20);
		f.add(t);
		t1= new JTextField();
		t1.setBounds(100, 425, 200, 20);
		f.add(t1);
		t2 = new JTextField();
		t2.setBounds(100, 450, 200, 20);
		f.add(t2);
		t3 = new JTextField();
		t3.setBounds(100, 475, 200, 20);
		f.add(t3);
		t4 = new JTextField();
		t4.setBounds(100, 500, 200, 20);
		f.add(t4);
		t5 = new JTextField();
		t5.setBounds(100, 525, 200, 20);
		f.add(t5);
		t6 = new JTextField();
		t6.setBounds(100, 550, 200, 20);
		f.add(t6);
		t7= new JTextField();
		t7.setBounds(100, 575, 200, 20);
		f.add(t7);
		t8= new JTextField();
		t8.setBounds(100, 625, 200, 20);
		t8.addKeyListener(this);
		f.add(t8);
		t9= new JTextField();
		t9.setBounds(100, 650, 200, 20);
		f.add(t9);
		JLabel ll1= new JLabel("String");
		ll1.setBounds(50, 625, 70, 35);
		ll1.setForeground(Color.black);
		f.add(ll1);
		JLabel ll2= new JLabel("Length");
		ll2.setBounds(50, 650, 70, 35);
		ll2.setForeground(Color.black);
		f.add(ll2);
		
		tf = new JTextField();
		tf.setBounds(150, 55, 100, 20);
		tf.addMouseListener(this);
		f.add(tf);
		
		JLabel lb1= new JLabel("Enter Age");
		lb1.setBounds(50, 100, 70, 35);
		lb1.setForeground(Color.black);
		f.add(lb1);
		
		tf1 = new JTextField();
		tf1.setBounds(150, 105, 100, 20);
		tf1.addMouseListener(this);
		f.add(tf1);
		
		JLabel lb2= new JLabel("Enter phone no.");
		lb2.setBounds(50, 150, 70, 35);
		lb2.setForeground(Color.black);
		f.add(lb2);
		
		tf2 = new JTextField();
		tf2.setBounds(150, 155, 100, 20);
		tf2.addMouseListener(this);
		f.add(tf2);
		
		JLabel lb3= new JLabel("Select Hobbies");
		lb3.setBounds(50, 200, 100, 35);
		lb3.setForeground(Color.black);
		f.add(lb3);
		
		cb= new JCheckBox("Singing");
		cb.setBounds(150, 205, 100, 20);
		cb.setForeground(Color.black);
		f.add(cb);
		cb.addItemListener(this);
		cb1= new JCheckBox("Dancing");
		cb1.setBounds(250, 205, 100, 20);
		cb1.setForeground(Color.black);
		f.add(cb1);
		cb1.addItemListener(this);
		cb2= new JCheckBox("Dancing");
		cb2.setBounds(350, 205, 100, 20);
		cb2.setForeground(Color.black);
		f.add(cb2);
		cb2.addItemListener(this);
		
		JLabel lb4= new JLabel("Select Gender");
		lb4.setBounds(50, 250, 100, 35);
		lb4.setForeground(Color.black);
		f.add(lb4);
		cg=new ButtonGroup();
		c=new JRadioButton("male");
		c.setBounds(150, 255, 100, 20);
		c.setForeground(Color.black);
		f.add(c);
		c.addItemListener(this);
		cg1=new ButtonGroup();
		c2=new JRadioButton("female");
		c2.setBounds(250, 255, 100, 20);
		c2.setForeground(Color.black);
		f.add(c2);
		c2.addItemListener(this);
		
		ch= new JComboBox<String>();
		ch.setBounds(150, 300, 120, 20);
		ch.addItem("Select Country");
		ch.addItem("India");
		ch.addItem("China");
		ch.addItem("America");
		ch.addItem("Australia");
		ch.addItem("England");
		f.add(ch);
		
		Button b=new Button("Submit");
		b.setBounds(150, 350, 70, 35);
		b.addActionListener(this);
		f.add(b);		
		
		
		
		
		f.setSize(500, 500);
		f.addWindowListener(this);
		f.setTitle("welcome to swing");
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {


		new framej();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String a=tf.getText();
		String d=tf1.getText();
		String e=tf2.getText();
		t.setText(a);
		t1.setText(d);
		t2.setText(e);
		t3.setText(jj);
		t4.setText(kk);
		t5.setText(ll);
		String b=(String) ch.getSelectedItem();
		t7.setText(b);
		t6.setText(z);
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==cb)
		{
			if(arg0.getStateChange()==1)
			{
				jj="singing";
			}
		}
		if(arg0.getSource()==cb1)
		{
			if(arg0.getStateChange()==1)
			{
				kk="dancing";
			}
		}
		if(arg0.getSource()==cb2)
		{
			if(arg0.getStateChange()==1)
			{
				ll="painting";
			}
		}
		if(arg0.getSource()==c)
		{
			if(arg0.getStateChange()==1)
			{
				z="male";
			}
		}
		if(arg0.getSource()==c2)
		{
			if(arg0.getStateChange()==1)
			{
				z="female";
			}
		}


		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==tf){
			tf.setText("Enter Name");
		}
		if(arg0.getSource()==tf1){
			tf1.setText("Enter Age");
		}
		if(arg0.getSource()==tf2){
			tf2.setText("Enter Age");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		String A=t8.getText();
		int B=(A.length()+1);
		String C=Integer.toString(B);
		t9.setText(C);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		f.dispose();
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
