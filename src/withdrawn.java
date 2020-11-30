import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class withdrawn {
	
	JFrame f;
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1;
	JPasswordField t2;
	Connection con;
	ResultSet rs;
	Statement stmt;
	
	public withdrawn(String str2) {
		
		f = new JFrame();
		f.setTitle("Bank Management System");
		f.setSize(660, 550);
		f.setLayout(null);
		
		l1 = new JLabel("Withdrawal");
		Font plainFont = new Font("Serif", Font.BOLD, 34);        
	    l1.setFont(plainFont);
		l1.setBounds(240, 10, 400, 150);
		f.add(l1);
		
		l2 = new JLabel("Enter Amount: ");
		Font  CardFont= new Font("Serif", Font.PLAIN, 24);        
	    l2.setFont(CardFont);
		l2.setBounds(120, 150, 150, 50);
		f.add(l2);
		
		t1 = new JTextField();
		t1.setFont(CardFont);
		t1.setBounds(270, 160, 250, 30);
		f.add(t1);
		
		b1 = new JButton("Withdrawal");
		b1.setFont(CardFont);
		b1.setBounds(120, 300, 190, 40);
		f.add(b1);
		
		b2 = new JButton("Back");
		b2.setFont(CardFont);
		b2.setBounds(330, 300, 190, 40);
		f.add(b2);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str1 = t1.getText().toString();
				
				
				try {	
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
					stmt = con.createStatement();
					
					stmt.executeUpdate("update cash_details set withdrawn = '"+str1+"' where Card_number='"+str2+"'  ");
					
					int count = Integer.parseInt(str1);
					
					rs = stmt.executeQuery("select * from cash_details where Card_number='"+str2+"'  ");
					
					
					while(rs.next()) {
						int available = Integer.parseInt(rs.getString(4));
						if (available > count) {
						available = available - count;
						//System.out.println(available);
						String s = String.valueOf(available);
						stmt.execute("update cash_details set Available = '"+s+"' where Card_number='"+str2+"'  ");
						JOptionPane.showMessageDialog(null, str1+ " Withdrawal Successfully..!!");
						}else {
							JOptionPane.showMessageDialog(null, "You have Insufficient funds.");
						}
					}
					

					
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
		
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
				new ATMFRAME_1(str2);
			}
			
		});
		
		
		f.setVisible(true);
	}
	
}
