import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.sql.*;
import javax.swing.*;

public class ThirdFrame {

	JFrame f1;
	JRadioButton saving, current, fixed, recurring;
	JLabel l1, account,card, cardno, pin, pinno, service;
	JPanel p = new JPanel();
	JCheckBox atm, internet, mobile, mail, cheque, statement, agree;
	JButton submit, cancel;
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	
	public ThirdFrame(String nam, String fnam, String date, String sex, String email, String mstatus,String add, String capital,String pincode,String rajya, String pannum, String adharnum, String mobilenum ) {
		
		f1 = new JFrame();
		f1.setSize(700,750);
		f1.setLayout(null);
		f1.setTitle("Bank Management System");
		
		l1 = new JLabel("Account Details");
		Font plainFont = new Font("Serif", Font.BOLD, 34);        
	    l1.setFont(plainFont);
		l1.setBounds(210, 10, 450, 50);
		f1.add(l1);
		
		account = new JLabel("Account Type  ");
		Font pageone = new Font("Serif", Font.BOLD, 20);        
		account.setFont(pageone);
		account.setBounds(80, 90, 450, 50);
		f1.add(account);

		saving = new JRadioButton("Savings Account");
		saving.setFont(pageone);
		saving.setBounds(80, 130, 200, 50);
		f1.add(saving);
		
		current = new JRadioButton("Current Account");
		current.setFont(pageone);
		current.setBounds(300, 130, 200, 50);
		f1.add(current);
		
		fixed = new JRadioButton("Fixed Account");
		fixed.setFont(pageone);
		fixed.setBounds(80, 170, 200, 50);
		f1.add(fixed);
		
		recurring = new JRadioButton("Recurring Account");
		recurring.setFont(pageone);
		recurring.setBounds(300, 170, 200, 50);
		f1.add(recurring);
		
		card = new JLabel("CARD NO : ");
		card.setFont(pageone);
		card.setBounds(80, 230, 450, 50);
		f1.add(card);
		
		cardno = new JLabel(" XXXX-XXXX-XXXX-4184 ");
		cardno.setFont(pageone);
		cardno.setBounds(200, 230, 450, 50);
		f1.add(cardno);
		
		pin = new JLabel("PIN :");
		pin.setFont(pageone);
		pin.setBounds(80, 270, 450, 50);
		f1.add(pin);
		
		pinno = new JLabel(" XXXX ");
		pinno.setFont(pageone);
		pinno.setBounds(200, 270, 450, 50);
		f1.add(pinno);
		
		service = new JLabel(" Service Required  ");
		service.setFont(pageone);
		service.setBounds(75, 310, 450, 50);
		f1.add(service);
		
		atm = new JCheckBox("  ATM");
		atm.setFont(pageone);
		atm.setBounds(80, 350, 150, 50);
		f1.add(atm);
		
		internet = new JCheckBox("  Internet Banking");
		internet.setFont(pageone);
		internet.setBounds(300, 350, 200, 50);
		f1.add(internet);
		
		mobile = new JCheckBox("  Mobile Banking");
		mobile.setFont(pageone);
		mobile.setBounds(80, 390, 200, 50);
		f1.add(mobile);
		
		mail = new JCheckBox("  Email Alert");
		mail.setFont(pageone);
		mail.setBounds(300, 390, 200, 50);
		f1.add(mail);
		
		cheque = new JCheckBox("  Cheque Book");
		cheque.setFont(pageone);
		cheque.setBounds(80, 430, 200, 50);
		f1.add(cheque);
		
		statement = new JCheckBox("  E-Statement");
		statement.setFont(pageone);
		statement.setBounds(300, 430, 200, 50);
		f1.add(statement);
		
		agree = new JCheckBox("  I am agree with all terms and conditions.*");
		agree.setFont(pageone);
		agree.setBounds(80, 500, 500, 50);
		f1.add(agree);
		
		
		submit = new JButton("Submit");
		submit.setFont(pageone);
		submit.setBounds(80, 600, 200, 50);
		f1.add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setFont(pageone);
		cancel.setBounds(360, 600, 200, 50);
		f1.add(cancel);
		
		f1.setVisible(true);
		
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  
                String type = "";
                if (saving.isSelected()) {
                	type = "Savings Account";
                }
                else if(current.isSelected()) {
                	type = "Current Account";
                }
                else if(fixed.isSelected()) {
                	type = "Fixed Account";
                }
                else if(recurring.isSelected()) {
                	type = "Recurring Account";
                }
                
                
                
                // Bank services 
                
                String machine = "-";
                if(atm.isSelected()) {
                	machine = "ATM Service";
                }
                
                String netbanking = "-";
                if(internet.isSelected()) {
                	netbanking = "Internet Banking";
                }
                
                String mobbanking = "-";
                if (mobile.isSelected()) {
                	mobbanking = "Mobile Banking";
                }
                
                String gmail = "-";
                if (mail.isSelected()) {
                	gmail = "Email Service";
                }
                
                String chekbook = "-";
                if(cheque.isSelected()) {
                	chekbook = "Cheque Book";
                }
                
                String estate="-";
                if(statement.isSelected()) {
                	estate = "E-Statement";
                }
                
                if (agree.isSelected()) {
                	
                	Random rand = new Random();
                	int Card1 = 999 + rand.nextInt(9000);
                	int Card2 = 999 + rand.nextInt(9000);
                	int Card3 = 999 + rand.nextInt(9000);
                	int Card4 = 999 + rand.nextInt(9000);
                	
                	String str1 = Integer.toString(Card1);
                	String str2 = Integer.toString(Card2);
                	String str3 = Integer.toString(Card3);
                	String str4 = Integer.toString(Card4);
                	
                	String CARDNUMBER = str1 +str2+ str3+str4;
                	String CARDNUMBER1 = str1 + "-"+str2+"-"+ str3+"-"+ str4;

                	String deposit = "0";
                	String withdrawn = "0";
                	String available = "0";

                	
                	int PINno = 999 + rand.nextInt(9000);
                	String PINNUMBER = Integer.toString(PINno);
                	
                	try {
                		Class.forName("com.mysql.cj.jdbc.Driver");
        				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
        			    stmt = con.createStatement();

        			    
						stmt.executeUpdate("insert into details values('"+CARDNUMBER+"','"+PINNUMBER+"','"+nam+"','"+fnam+"','"+date+"','"+sex+"','"+email+"','"+mstatus+"','"+add+"','"+capital+"','"+pincode+"','"+rajya+"','"+pannum+"','"+adharnum+"','"+mobilenum+"','"+type+"','"+machine+"','"+netbanking+"','"+mobbanking+"','"+gmail+"','"+chekbook+"','"+estate+"')");
					    stmt.executeUpdate("insert into cash_details values ('"+CARDNUMBER+"','"+deposit+"','"+withdrawn+"','"+available+"')");
						
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                	catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                	
                	f1.dispose();
                	JOptionPane.showMessageDialog(null, "Card number : "+ CARDNUMBER1 + "\n PIN no: "+ PINNUMBER);
                	new FirstFrame();
                	
                	
                }
                else {
                	JOptionPane.showMessageDialog(null, "Please check the box...!!!");
                }
			}
				
		});
		
		
		
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f1.dispose();
				new FirstFrame();
			}
			
		});
		
		
		
	}
	
	
}