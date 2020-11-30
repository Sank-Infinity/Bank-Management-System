import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class balance_inquiry {
	
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1;
	JTextField t1;
	JPasswordField t2;
	Connection con;
	ResultSet rs;
	Statement stmt;
	
	public balance_inquiry(String str2) {
		
		f = new JFrame();
		f.setTitle("Bank Management System");
		f.setSize(750, 400);
		f.setLayout(null);
		
		l1 = new JLabel("Balance Enquiry ");
		Font plainFont = new Font("Serif", Font.BOLD, 34);        
	    l1.setFont(plainFont);
		l1.setBounds(200, 10, 400, 50);
		f.add(l1);

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("select * from cash_details where Card_number= '"+str2+"'  ");
			
			while(rs.next()) {
				
				l2 = new JLabel("Card number ");
				Font comman = new Font("Serif", Font.PLAIN, 24);        
			    l2.setFont(comman);
				l2.setBounds(10, 100, 200, 50);
				f.add(l2);
				
				l3 = new JLabel(rs.getString(1));
			    l3.setFont(comman);
				l3.setBounds(10, 150, 200, 50);
				f.add(l3);
				
				l4 = new JLabel("Deposited ");
			    l4.setFont(comman);
				l4.setBounds(250, 100, 200, 50);
				f.add(l4);
				
				l5 = new JLabel(rs.getString(2));
			    l5.setFont(comman);
				l5.setBounds(270, 150, 200, 50);
				f.add(l5);
				
				l6 = new JLabel("Withdrawal ");
			    l6.setFont(comman);
				l6.setBounds(400, 100, 200, 50);
				f.add(l6);
				
				l7 = new JLabel(rs.getString(3));
			    l7.setFont(comman);
				l7.setBounds(420, 150, 200, 50);
				f.add(l7);
				
				l8 = new JLabel("Available ");
			    l8.setFont(comman);
				l8.setBounds(550, 100, 200, 50);
				f.add(l8);
				
				l9 = new JLabel(rs.getString(4));
			    l9.setFont(comman);
				l9.setBounds(570, 150, 200, 50);
				f.add(l9);
				
				b1 = new JButton("BACK");
				b1.setFont(comman);
				b1.setBounds(500, 250, 200, 50);
				f.add(b1);
				
				b1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						f.dispose();
						new ATMFRAME_1(str2);
					}
					
				});
			}

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		f.setVisible(true);
	}
	
	
}
