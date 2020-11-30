import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class SecondFrame<JDateChooser> {

	JFrame f;
	JLabel l1,l2,name, father, dob, gender, mail, marital, address, city, pin, state, pan, adhar, mob, qualification;
	public static JTextField nametext, fathertext,dobtxt,  mailtxt, addresstxt, citytxt, pintxt, statetxt, pantxt, adhartxt, mobtxt, qualtxt;
	JButton next;
	public static JRadioButton male,female, other, married, unmarried, devorced;
	
	public SecondFrame() {
		
		f = new JFrame();
		f.setSize(700,750);
		f.setLayout(null);
		f.setTitle("Bank Management System");
		
		l1 = new JLabel("Application Form No. 3586");
		Font plainFont = new Font("Serif", Font.BOLD, 34);        
	    l1.setFont(plainFont);
		l1.setBounds(140, 10, 450, 50);
		f.add(l1);
		
		l2 = new JLabel("Page 1. : Personal Details");
		Font pageone = new Font("Serif", Font.BOLD, 20);        
	    l2.setFont(pageone);
		l2.setBounds(230, 50, 450, 50);
		f.add(l2);
		
		name = new JLabel("Name* : ");
		name.setFont(pageone);
		name.setBounds(80, 90, 450, 50);
		f.add(name);
		
		nametext = new JTextField();
		nametext.setFont(pageone);
		nametext.setBounds(300, 105, 350, 25);
		f.add(nametext);
		
		
		father = new JLabel("Father's Name* : ");
		father.setFont(pageone);
		father.setBounds(80, 130, 450, 50);
		f.add(father);
		
		fathertext = new JTextField();
		fathertext.setFont(pageone);
		fathertext.setBounds(300, 145, 350, 25);
		f.add(fathertext);
		
		dob = new JLabel("Date Of Birth* : ");
		dob.setFont(pageone);
		dob.setBounds(80, 170, 450, 50);
		f.add(dob);
		
		dobtxt = new JTextField();
		dobtxt.setFont(pageone);
		dobtxt.setBounds(300, 185, 350, 25);
		f.add(dobtxt);
		
		gender = new JLabel("Gender* : ");
		gender.setFont(pageone);
		gender.setBounds(80, 210, 450, 50);
		f.add(gender);
		
		male = new JRadioButton("Male");
		male.setFont(pageone);
		male.setBounds(300, 225, 100, 25);
		f.add(male);
		
		female = new JRadioButton("Female");
		female.setFont(pageone);
		female.setBounds(400, 225, 100, 25);
		f.add(female);
		
		other = new JRadioButton("Other");
		other.setFont(pageone);
		other.setBounds(500, 225, 100, 25);
		f.add(other);
		
		mail = new JLabel("Email : ");
		mail.setFont(pageone);
		mail.setBounds(80, 250, 450, 50);
		f.add(mail);
		
		mailtxt = new JTextField();
		mailtxt.setFont(pageone);
		mailtxt.setBounds(300, 265, 350, 25);
		f.add(mailtxt);
		
		marital = new JLabel("Marital Status* : ");
		marital.setFont(pageone);
		marital.setBounds(80, 290, 450, 50);
		f.add(marital);
		
		married = new JRadioButton("Married");
		married.setFont(pageone);
		married.setBounds(300, 305, 100, 25);
		f.add(married);
		
		unmarried = new JRadioButton("Unmarried");
		unmarried.setFont(pageone);
		unmarried.setBounds(400, 305, 120, 25);
		f.add(unmarried);
		
		devorced = new JRadioButton("Other");
		devorced.setFont(pageone);
		devorced.setBounds(530, 305, 100, 25);
		f.add(devorced);
		
		address = new JLabel("Address* : ");
		address.setFont(pageone);
		address.setBounds(80, 330, 450, 50);
		f.add(address);
		
		addresstxt = new JTextField();
		addresstxt.setFont(pageone);
		addresstxt.setBounds(300, 345, 350, 25);
		f.add(addresstxt);
		
		city = new JLabel("City* : ");
		city.setFont(pageone);
		city.setBounds(80, 370, 450, 50);
		f.add(city);
		
		citytxt = new JTextField();
		citytxt.setFont(pageone);
		citytxt.setBounds(300, 385, 350, 25);
		f.add(citytxt);
		
		pin = new JLabel("Pin Code* : ");
		pin.setFont(pageone);
		pin.setBounds(80, 410, 450, 50);
		f.add(pin);
		
		pintxt = new JTextField();
		pintxt.setFont(pageone);
		pintxt.setBounds(300, 425, 350, 25);
		f.add(pintxt);
		
		state = new JLabel("State* : ");
		state.setFont(pageone);
		state.setBounds(80, 450, 450, 50);
		f.add(state);
		
		statetxt = new JTextField();
		statetxt.setFont(pageone);
		statetxt.setBounds(300, 465, 350, 25);
		f.add(statetxt);
		
		pan = new JLabel("PAN No* : ");
		pan.setFont(pageone);
		pan.setBounds(80, 490, 450, 50);
		f.add(pan);
		
		pantxt = new JTextField();
		pantxt.setFont(pageone);
		pantxt.setBounds(300, 505, 350, 25);
		f.add(pantxt);
		
		adhar = new JLabel("ADHAR No* : ");
		adhar.setFont(pageone);
		adhar.setBounds(80, 530, 450, 50);
		f.add(adhar);
		
		adhartxt = new JTextField();
		adhartxt.setFont(pageone);
		adhartxt.setBounds(300, 545, 350, 25);
		f.add(adhartxt);
		
		mob = new JLabel("Mobile No* : ");
		mob.setFont(pageone);
		mob.setBounds(80, 570, 450, 50);
		f.add(mob);
		
		mobtxt = new JTextField();
		mobtxt.setFont(pageone);
		mobtxt.setBounds(300, 585, 350, 25);
		f.add(mobtxt);
		
		next = new JButton("NEXT");
		next.setFont(pageone);
		next.setBounds(455, 640, 190, 40);
		f.add(next);
		
		
		
		f.setVisible(true);
		
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				f.dispose();
				
				String nam = nametext.getText().toString();
				
				String fnam = fathertext.getText().toString();
				String date = dobtxt.getText().toString();
				String sex = " ";
				
				if (male.isSelected()) {
					sex="Male";
				}
				else if (female.isSelected()){
				    sex = "Female";
			    }
				else if(other.isSelected()) {
					sex="Other";
				}
				
				String email = mailtxt.getText().toString();
                String mstatus = " ";
                
                if (married.isSelected()) {
                	mstatus = "Married";
                }
                else if (unmarried.isSelected()) {
                	mstatus = "Unmarried";
                }
                else if(devorced.isSelected()) {
                	mstatus = "Other";
                }
                
                String add = addresstxt.getText().toString();
                String capital = citytxt.getText().toString();
                String pincode = pintxt.getText().toString();
                String rajya = statetxt.getText().toString();
                String pannum = pantxt.getText().toString();
                String adharnum = adhartxt.getText().toString();
                String mobilenum = mobtxt.getText().toString();
                
                
				new ThirdFrame(nam, fnam, date,sex, email, mstatus, add, capital, pincode, rajya,pannum,adharnum,mobilenum );
			}
			
		});
		
		
		
		
	}
	

}
