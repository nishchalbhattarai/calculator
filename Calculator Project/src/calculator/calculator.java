package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel= new JPanel();
	JTextArea jtextarea= new JTextArea(2,10);
	
	JButton jbutton1 = new JButton();
	JButton jbutton2 = new JButton();
	JButton jbutton3 = new JButton();
	JButton jbutton4 = new JButton();
	JButton jbutton5 = new JButton();
	JButton jbutton6 = new JButton();
	JButton jbutton7 = new JButton();
	JButton jbutton8 = new JButton();
	JButton jbutton9 = new JButton();
	JButton jbutton0 = new JButton();
	
	JButton jbuttonadd = new JButton();
	JButton jbuttonsub = new JButton();
	JButton jbuttonmult = new JButton();
	JButton jbuttondiv = new JButton();
	
	JButton jbuttonclear = new JButton();
	JButton jbuttondot = new JButton();
	JButton jbuttonequal = new JButton();
	
	double n1,n2,result;
	int add=0,mul=0,div=0,sub=0;
	
	public calculator(){
		
		frame.setSize(350,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator demo");
		
		frame.setResizable(true);
		
		frame.add(panel);
		panel.setBackground(Color.gray);
		
		Border border =BorderFactory.createLineBorder(Color.blue,4);
		
		panel.add(jtextarea);
		jtextarea.setBackground(Color.black);
		Border tborder= BorderFactory.createLineBorder(Color.blue,1);
		jtextarea.setBorder(tborder);
		Font font = new Font("Arial",Font.BOLD,33);
		jtextarea.setFont(font);
		jtextarea.setForeground(Color.white);
		
		jtextarea.setPreferredSize(new Dimension(2,10));
		jtextarea.setLineWrap(true);
		
		
		jbutton1.setPreferredSize(new Dimension(100,40));
		jbutton1.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button1.png"));
		
		jbutton2.setPreferredSize(new Dimension(100,40));
		jbutton2.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button2.png"));
		
		jbutton3.setPreferredSize(new Dimension(100,40));
		jbutton3.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button3.png"));
		
		jbutton4.setPreferredSize(new Dimension(100,40));
		jbutton4.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button4.png"));
		
		jbutton5.setPreferredSize(new Dimension(100,40));
		jbutton5.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button5.png"));
		
		jbutton6.setPreferredSize(new Dimension(100,40));
		jbutton6.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button6.png"));
		
		jbutton7.setPreferredSize(new Dimension(100,40));
		jbutton7.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button7.png"));
		
		jbutton8.setPreferredSize(new Dimension(100,40));
		jbutton8.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button8.png"));
		
		jbutton9.setPreferredSize(new Dimension(100,40));
		jbutton9.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button9.png"));
		
		jbutton0.setPreferredSize(new Dimension(100,40));
		jbutton0.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\button0.png"));
		
		jbuttondot.setPreferredSize(new Dimension(100,40));
		jbuttondot.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\buttondot.png"));
		
		jbuttonsub.setPreferredSize(new Dimension(100,40));
		jbuttonsub.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\buttonsub.png"));
		
		jbuttonmult.setPreferredSize(new Dimension(100,40));
		jbuttonmult.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\buttonmul.png"));
	
		jbuttondiv.setPreferredSize(new Dimension(100,40));
		jbuttondiv.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\buttondiv.png"));
		
		jbuttonadd.setPreferredSize(new Dimension(100,40));
		jbuttonadd.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\buttonadd.png"));
	
		jbuttonclear.setPreferredSize(new Dimension(100,40));
		jbuttonclear.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\buttonclear.png"));
	
		jbuttonequal.setPreferredSize(new Dimension(200,40));
		jbuttonequal.setIcon(new ImageIcon("C:\\Users\\Nishchal\\Desktop\\major project\\pics calc\\buttonequal.png"));
	
		panel.add(jbutton1);
		panel.add(jbutton2);
		panel.add(jbutton3);
		panel.add(jbutton4);
		panel.add(jbutton5);
		panel.add(jbutton6);
		panel.add(jbutton7);
		panel.add(jbutton8);
		panel.add(jbutton9);
		panel.add(jbutton0);
		panel.add(jbuttondot);
		panel.add(jbuttonsub);
		panel.add(jbuttonmult);
		panel.add(jbuttondiv);
		panel.add(jbuttonadd);
		panel.add(jbuttonclear);
		panel.add(jbuttonequal);
		
		
		jbutton1.addActionListener((ActionListener)this);
		jbutton2.addActionListener((ActionListener)this);
		jbutton3.addActionListener((ActionListener)this);
		jbutton4.addActionListener((ActionListener)this);
		jbutton5.addActionListener((ActionListener)this);
		jbutton6.addActionListener((ActionListener)this);
		jbutton7.addActionListener((ActionListener)this);
		jbutton8.addActionListener((ActionListener)this);
		jbutton9.addActionListener((ActionListener)this);
		jbutton0.addActionListener((ActionListener) this);
		jbuttondot.addActionListener((ActionListener)this);
		jbuttonsub.addActionListener((ActionListener)this);
		jbuttonmult.addActionListener((ActionListener)this);
		jbuttondiv.addActionListener((ActionListener)this);
		jbuttonadd.addActionListener((ActionListener)this);
		jbuttonclear.addActionListener((ActionListener)this);
		jbuttonequal.addActionListener((ActionListener)this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		
		if(source == jbuttonclear) {
			n1=0.0;
			n2=0.0;
			jtextarea.setText("");	
			
		}
		
		if(source== jbutton1) {
			jtextarea.append("1");
		}	
		
		if(source== jbutton2) {
			jtextarea.append("2");
		}
		
		if(source== jbutton3) {
			jtextarea.append("3");
		}
		
		if(source== jbutton4) {
			jtextarea.append("4");
		}
		
		if(source== jbutton5) {
			jtextarea.append("5");
		}
		
		if(source== jbutton6) {
			jtextarea.append("6");
		}
		
		if(source== jbutton7) {
			jtextarea.append("7");
		}
		
		if(source== jbutton8) {
			jtextarea.append("8");
		}
		
		if(source== jbutton9) {
			jtextarea.append("9");
		}
		if(source== jbutton0) {
			jtextarea.append("0");
		}
		
		if(source== jbuttondot) {
			jtextarea.append(".");
		}
		
		if(source== jbuttonadd) {
			n1= number_reader();
			jtextarea.append("+");
			add=1;
			sub=0;
			mul=0;
			div=0;
		}
		if(source== jbuttondiv) {
			n1= number_reader();
			jtextarea.append("/");
			add=0;
			sub=0;
			mul=0;
			div=1;
		}
		if(source== jbuttonsub) {
			n1= number_reader();
			jtextarea.append("-");
			add=0;
			sub=1;
			mul=0;
			div=0;
		}
		if(source== jbuttonmult) {
			n1= number_reader();
			jtextarea.append("*");
			add=0;
			sub=0;
			mul=1;
			div=0;
		}
		if(source== jbuttonequal) {
			n2= number_reader();
			if(add>0) {
				result=n1+n2;
				jtextarea.setText(Double.toString(result));
			}
			if(sub>0) {
				result=n1-n2;
				jtextarea.setText(Double.toString(result));
			}
			if(mul>0) {
				result=n1*n2;
				jtextarea.setText(Double.toString(result));
			}
			if(div>0) {
				result=n1/n2;
				jtextarea.setText(Double.toString(result));
			}
		}
	}
	public double number_reader() {
		double num1;
		String s;
		s=jtextarea.getText();
		num1=Double.valueOf(s);
		
		
		return num1;
		
	}
	
}
