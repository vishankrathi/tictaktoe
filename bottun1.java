import java.awt.*;
import java.awt.event.*;

class frame1 extends Frame implements ActionListener 
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Label l1,l2,l3;
	TextField tf1,tf2;
	int count=0;
	int w_count=0;
	int v_count=0;
	String sign;
	frame1()
	{
		b1=new Button("1");
		b1.setBounds(50,50,50,50);
		b1.addActionListener(this);
		
		b2=new Button("2");
		b2.setBounds(105,50,50,50);
		b2.addActionListener(this);
		b3=new Button("3");
		b3.setBounds(160,50,50,50);
		b3.addActionListener(this);
		b4=new Button("4");
		b4.setBounds(50,105,50,50);
		b4.addActionListener(this);
		b5=new Button("5");
		b5.setBounds(105,105,50,50);
		b5.addActionListener(this);
		b6=new Button("6");
		b6.setBounds(160,105,50,50);
		b6.addActionListener(this);
		b7=new Button("7");
		b7.setBounds(50,160,50,50);
		b7.addActionListener(this);
		b8=new Button("8");
		b8.setBounds(105,160,50,50);
		b8.addActionListener(this);
		b9=new Button("9");
		b9.setBounds(160,160,50,50);
		b9.addActionListener(this);
		
		l1=new Label("WINNER",Label.CENTER);
		l1.setBounds(50,210,150,30);
		l1.setBackground(Color.red);
		
		l2=new Label("x");
		l2.setBounds(50,260,50,30);
		tf1=new TextField(10);
		tf1.setBounds(110,260,50,30);
		l3=new Label("Y");
		l3.setBounds(50,300,50,30);
		tf2=new TextField(10);
		tf2.setBounds(110,300,50,30);
		
		b10=new Button("restart");
		b10.setBounds(50,350,50,50);
		b10.addActionListener(this);
		
		 
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(tf2);
		
		
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		sign=(count%2==0)?"X":"0";
		int i=0;
		
		if(ae.getSource()==b1)
		{
			b1.setLabel(sign);
			
			if(checkWinner()==true){
				l1.setText(sign+" is Winner");
			printWinner();
			//DisableButton();
			}
				
		}			
		else if(ae.getSource()==b2)
		{
			b2.setLabel(sign);	
			if(checkWinner()==true){
				l1.setText(sign+" is Winner");
			printWinner();
			//DisableButton();
			}
				
		}
		else if(ae.getSource()==b3)
		{
			b3.setLabel(sign);
			if(checkWinner()==true){
				l1.setText(sign+" is Winner");
			printWinner();
			//DisableButton();
			}
				
		}
		else if(ae.getSource()==b4)
		{
			b4.setLabel(sign);
			if(checkWinner()==true){
				l1.setText(sign+" is Winner");
			printWinner();
			DisableButton();
			}
				
	    }
		else if(ae.getSource()==b5)
		{
			b5.setLabel(sign);
			if(checkWinner()==true){
				l1.setText(sign+" is Winner");
			printWinner();
			DisableButton();
			}
				
	    }
		else if(ae.getSource()==b6)
		{
			b6.setLabel(sign);
			if(checkWinner()==true){
				l1.setText(sign+" is Winner");
			printWinner();
			DisableButton();
			}
				
	    }
		else if(ae.getSource()==b7)
		{
			b7.setLabel(sign);
			if(checkWinner()==true){
				l1.setText(sign+" is Winner");
			printWinner();
			DisableButton();
			}
				
	    }
		else if(ae.getSource()==b8)
		{
			b8.setLabel(sign);
		if(checkWinner()==true){
				l1.setText(sign+" is Winner");
			printWinner();
			DisableButton();
		}
			
				
	    }
		else if(ae.getSource()==b9)
		{
			b9.setLabel(sign);
			if(checkWinner()==true)
			{
				l1.setText(sign+" is Winner");
				printWinner();
				DisableButton();
				
			}
	    }
		count++;
		
		if(ae.getSource()==b10)
		{
			enableButton();
			b1.setLabel("1");
			b2.setLabel("2");
			b3.setLabel("3");
			b4.setLabel("4");
			b5.setLabel("5");
			b6.setLabel("6");
			b7.setLabel("7");
			b8.setLabel("8");
			b9.setLabel("9");
			
			
		}
		
	}
	
	
	
	void printWinner()
	{
		
		if(sign.equals("0")){
			
			w_count++;
			tf2.setText(String.valueOf(w_count));
		}
		else{
			
			v_count++;
			tf1.setText(String.valueOf(v_count));
			
		}
		count=0;
	}
	void DisableButton()
	{
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}
	void enableButton()
	{
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		
	}
	boolean checkWinner()
	{
		
		if(b1.getLabel().equals(b2.getLabel()) && b2.getLabel().equals(b3.getLabel()))
			return true;
		else if(b1.getLabel().equals(b4.getLabel()) && b4.getLabel().equals(b7.getLabel()))
			return true;
		else if(b3.getLabel().equals(b6.getLabel()) && b6.getLabel().equals(b9.getLabel()))
			return true;
		else if(b7.getLabel().equals(b8.getLabel()) && b8.getLabel().equals(b9.getLabel()))
			return true;
		else if(b4.getLabel().equals(b5.getLabel()) && b5.getLabel().equals(b6.getLabel()))
			return true;
		else if(b7.getLabel().equals(b8.getLabel()) && b8.getLabel().equals(b9.getLabel()))
			return true;
		else if(b2.getLabel().equals(b5.getLabel()) && b5.getLabel().equals(b8.getLabel()))
			return true;
		else if(b1.getLabel().equals(b5.getLabel()) && b5.getLabel().equals(b9.getLabel()))
			return true;
		else if(b7.getLabel().equals(b5.getLabel()) && b5.getLabel().equals(b3.getLabel()))
			return true;
		else
			return false;
	}
	
	public static void main(String [] ar)
	{
		new frame1();
	}
}