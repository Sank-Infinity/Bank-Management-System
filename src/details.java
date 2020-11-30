import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;


public class details {
	
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,atm, netbanking,mobbanking, mail, cheque,statment;
	JButton b1,b2;
	JTextField t1;
	JPasswordField t2;
	Connection con;
	ResultSet rs;
	Statement stmt;
	
public details(String cardnumber) {
		
		f = new JFrame();
		f.setTitle("Bank Management System");
		f.setSize(600, 750);
		f.setLayout(null);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			stmt = con.createStatement();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		l1 = new JLabel("Account details");
		Font plainFont = new Font("Serif", Font.BOLD, 34);        
	    l1.setFont(plainFont);
		l1.setBounds(50, 10, 400, 50);
		f.add(l1);
		
		l2 = new JLabel("Name : ");
		Font comman = new Font("Serif", Font.PLAIN, 24);        
	    l2.setFont(comman);
		l2.setBounds(50, 50, 400, 50);
		f.add(l2);
		
		try {
			rs = stmt.executeQuery("select * from details where card_no= '"+cardnumber+"'  ");
			while(rs.next()) {
				l3 = new JLabel(rs.getString(3));
			    l3.setFont(comman);
				l3.setBounds(250, 50, 400, 50);
				f.add(l3);
				
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		l4 = new JLabel("Card Number :");
	    l4.setFont(comman);
		l4.setBounds(50, 100, 400, 50);
		f.add(l4);
		
		try {
			rs = stmt.executeQuery("select * from details where card_no= '"+cardnumber+"'  ");
			while(rs.next()) {
				l5 = new JLabel(rs.getString(1));
			    l5.setFont(comman);
				l5.setBounds(250, 100, 400, 50);
				f.add(l5);
				
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		l6 = new JLabel("Adhar Number :");
	    l6.setFont(comman);
		l6.setBounds(50, 150, 400, 50);
		f.add(l6);
		
		try {
			rs = stmt.executeQuery("select * from details where card_no= '"+cardnumber+"'  ");
			while(rs.next()) {
				l7 = new JLabel(rs.getString(14));
			    l7.setFont(comman);
				l7.setBounds(250, 150, 400, 50);
				f.add(l7);
				
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		l8 = new JLabel("PAN Number :");
	    l8.setFont(comman);
		l8.setBounds(50, 200, 400, 50);
		f.add(l8);
		
		try {
			rs = stmt.executeQuery("select * from details where card_no= '"+cardnumber+"'  ");
			while(rs.next()) {
				l9 = new JLabel(rs.getString(13));
			    l9.setFont(comman);
				l9.setBounds(250, 200, 400, 50);
				f.add(l9);
				
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		l10 = new JLabel("Account Type :");
	    l10.setFont(comman);
		l10.setBounds(50, 250, 400, 50);
		f.add(l10);
		
		try {
			rs = stmt.executeQuery("select * from details where card_no= '"+cardnumber+"'  ");
			while(rs.next()) {
				l11 = new JLabel(rs.getString(16));
			    l11.setFont(comman);
				l11.setBounds(250, 250, 400, 50);
				f.add(l11);
				
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		l12 = new JLabel("Provided services :");
	    l12.setFont(comman);
		l12.setBounds(50, 300, 400, 50);
		f.add(l12);
		
		
		try {
			rs = stmt.executeQuery("select * from details where card_no= '"+cardnumber+"'  ");
			while(rs.next()) {
				atm = new JLabel(rs.getString(17));
			    atm.setFont(comman);
				atm.setBounds(250, 300, 400, 50);
				f.add(atm);
				
				netbanking = new JLabel(rs.getString(18));
				netbanking.setFont(comman);
				netbanking.setBounds(250, 350, 400, 50);
				f.add(netbanking);
				
				mobbanking = new JLabel(rs.getString(19));
				mobbanking.setFont(comman);
				mobbanking.setBounds(250, 400, 400, 50);
				f.add(mobbanking);
				
				mail = new JLabel(rs.getString(20));
				mail.setFont(comman);
				mail.setBounds(250, 450, 400, 50);
				f.add(mail);
				
				cheque = new JLabel(rs.getString(21));
				cheque.setFont(comman);
				cheque.setBounds(250, 500, 400, 50);
				f.add(cheque);
				
				statment = new JLabel(rs.getString(22));
				statment.setFont(comman);
				statment.setBounds(250, 550, 400, 50);
				f.add(statment);
				
				
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		b1= new JButton("BACK");
		b1.setFont(comman);
		b1.setBounds(280, 620, 150, 50);
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
				new ATMFRAME_1(cardnumber);
			}
			
		});
		
		b2= new JButton("DELETE");
		b2.setFont(comman);
		b2.setBounds(70, 620, 150, 50);
		f.add(b2);
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {	
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
					stmt = con.createStatement();
					
					
					stmt.executeUpdate(" delete from cash_details where Card_number= '"+cardnumber+"'  ");
					stmt.executeUpdate(" delete from details where card_no= '"+cardnumber+"'  ");
					
					JOptionPane.showMessageDialog(null, "Your Account removed successfully..!!");
					
					f.dispose();
					new FirstFrame();
					
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch ( SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				finally {
					try {
						rs.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
			
		});
		

		
		f.setVisible(true);
		
	}

 
}
