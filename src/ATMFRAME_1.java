import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;


public class ATMFRAME_1 {

	JFrame f;
	JLabel l1;
	JButton b1,b2,b3,b4,b5;
	JTextField t1;
	JPasswordField t2;
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public ATMFRAME_1(String cardname) {
		f = new JFrame();
		f.setSize(660, 550);
		f.setLayout(null);
		
		l1 = new JLabel("Welcome To BANK");
		Font plainFont = new Font("Serif", Font.BOLD, 34);        
	    l1.setFont(plainFont);
		l1.setBounds(190, 10, 400, 150);
		f.add(l1);
		
		b1 = new JButton("Deposit");
		Font  CardFont= new Font("Serif", Font.PLAIN, 24);        
		b1.setFont(CardFont);
		b1.setBounds(120, 150, 190, 40);
		f.add(b1);
		
		b2 = new JButton("Withdrawal");
		b2.setFont(CardFont);
		b2.setBounds(330, 150, 200, 40);
		f.add(b2);
		
		b3 = new JButton("Show Details");
		b3.setFont(CardFont);
		b3.setBounds(120, 250, 190, 40);
		f.add(b3);
		
		b4 = new JButton("Balance Inquiry");
		b4.setFont(CardFont);
		b4.setBounds(330, 250, 200, 40);
		f.add(b4);
		
		b5 = new JButton("LogOut");
		b5.setFont(CardFont);
		b5.setBounds(120, 380, 410, 40);
		f.add(b5);
		
		
		f.setVisible(true);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
				String str2 = cardname;
				new deposit(str2);
			}
			
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
				String str2 = cardname;
				new withdrawn(str2);
			}
			
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
				String str2 = cardname;
				new details(str2);
			}
			
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
				String str2 = cardname;
				new balance_inquiry(str2);
			}
			
		});
		
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
				new FirstFrame();
			}
			
		});
		
	}
	
}
