import java.sql.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FirstFrame {
	
	JFrame f;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	JTextField t1;
	JPasswordField t2;
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	
	public FirstFrame() {
		
		f = new JFrame();
		f.setSize(660, 550);
		f.setLayout(null);
		f.setTitle("Bank Management System");
		
		l1 = new JLabel("Welcome To ATM");
		Font plainFont = new Font("Serif", Font.BOLD, 34);        
	    l1.setFont(plainFont);
		l1.setBounds(190, 10, 400, 150);
		f.add(l1);
		
		l2 = new JLabel("CARD NO: ");
		Font  CardFont= new Font("Serif", Font.PLAIN, 24);        
	    l2.setFont(CardFont);
		l2.setBounds(120, 150, 150, 50);
		f.add(l2);
		
		t1 = new JTextField();
		t1.setFont(CardFont);
		t1.setBounds(270, 160, 250, 30);
		f.add(t1);
		
		l3 = new JLabel("PIN : ");
	    l3.setFont(CardFont);
		l3.setBounds(120, 210, 150, 50);
		f.add(l3);
		
		t2 = new JPasswordField();
		t2.setFont(CardFont);
		t2.setBounds(270, 220, 250, 30);
		f.add(t2);
		
		b1 = new JButton("Sign In");
		b1.setFont(CardFont);
		b1.setBounds(120, 300, 190, 40);
		f.add(b1);
		
		b2 = new JButton("Clear");
		b2.setFont(CardFont);
		b2.setBounds(330, 300, 190, 40);
		f.add(b2);
		
		b3 = new JButton("Register");
		b3.setFont(CardFont);
		b3.setBounds(120, 380, 400, 40);
		f.add(b3);
		
		f.setVisible(true);
		

		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
					stmt = con.createStatement();
				    
					String cardname = t1.getText().toString();
					String pinnumber = new String(t2.getPassword());
					
					rs = stmt.executeQuery("select * from details");
					
					while(rs.next()) {
						if(cardname.equals(rs.getString(1)) && pinnumber.equals(rs.getString(2))) {
							f.dispose();
							
							new ATMFRAME_1(cardname);
							
					
						}
					 }
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
			
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t1.setText("");
				t2.setText("");
			}
			
		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
				new SecondFrame();
			}
			
		});
		
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstFrame();
	}

}
