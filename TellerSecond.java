import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class TellerSecond extends JFrame {
	private JTextField withdrawTextfield;
	private JTextField depositeTextfield;
public TellerSecond() {
	setAlwaysOnTop(true);
	itstransactionframe();
}
public void itstransactionframe() {
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTitle("logIn");
    setUndecorated(true);
    setResizable(false);
    setBounds(100, 100, 723, 498);
	        
	JPanel telpanel2 = new JPanel();
	 telpanel2.setBackground(new Color(51,102,153));
	 telpanel2.setLayout(null);
	    		 getContentPane().add(telpanel2);
	    		 
	    		 JLabel lblNewLabel = new JLabel("CHOOSE OPTION:");
	    		 lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 13));
	    		 lblNewLabel.setForeground(Color.WHITE);
	    		 lblNewLabel.setBounds(236, 223, 128, 14);
	    		 telpanel2.add(lblNewLabel);
	    		 
	    		 
	    		 JLabel TellerSecondLabel1 = new JLabel("BALANCE OF MR ADARSHA IS RS: 1308305 ONLY");
	    		 //JLabel TellerSecondLabel1 = new JLabel("");
	    		 TellerSecondLabel1.setForeground(Color.WHITE);
	    		 TellerSecondLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
	    		 TellerSecondLabel1.setBounds(210, 11, 452, 56);
	    		 //TellerSecondLabel1.setText("NAME:\t"+ 190   +"\n  ID: \t"+  20 +"\n ACCOUNT NUMBER: \t"+ 30   +"\n DATE OF BIRTH: \t"+ 40  +"\n CITIZENSHIP NUMBER: \t"+  50 +"\n ADDRESS \t"+60   +"\n BALANCE \t"+ 70 );
	    		 telpanel2.add(TellerSecondLabel1);
	    		 
	    		 
	    		 JLabel warningTextfiled = new JLabel("");
		    		warningTextfiled.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		    		warningTextfiled.setForeground(Color.WHITE);
		    		warningTextfiled.setBounds(326, 331, 304, 14);
		    		telpanel2.add(warningTextfiled);
	    		 
	    		 depositeTextfield = new JTextField();
	    		 depositeTextfield.addKeyListener(new KeyAdapter() {
	    		 	@Override
	    		 	public void keyTyped(KeyEvent eee) {
	    		 		char  c= eee.getKeyChar();
	    		 		if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
	    		 			eee.consume();
	    		 			warningTextfiled.setText("***Please enter the numeric value***");
	    		 		}
	    		 		if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
	    		 			warningTextfiled.setText("");
	    		 		}
	    		 	}
	    		 });
	    		 depositeTextfield.setBounds(374, 295, 202, 20);
	    		 depositeTextfield.setEnabled(false);
	    		 telpanel2.add(depositeTextfield);
	    		 depositeTextfield.setColumns(10);
	    		 
	    		 
	    		 
	    		 String[] option = { "SELECT","WITHDRAW", "DEPOSITE" };
	    		 JComboBox comboBox = new JComboBox(option);
	    		 comboBox.setBounds(374, 221, 202, 20);
	    		 telpanel2.add(comboBox);
	    		 
	    		 
	    		 JLabel yyyy = new JLabel("YYYY");
	    			yyyy.setForeground(Color.WHITE);
	    			yyyy.setFont(new Font("SansSerif", Font.BOLD, 12));
	    			yyyy.setBounds(359, 134, 46, 14);
	    			telpanel2.add(yyyy);
	    			
	    			JLabel mm = new JLabel("MM");
	    			mm.setFont(new Font("SansSerif", Font.BOLD, 12));
	    			mm.setForeground(Color.WHITE);
	    			mm.setBounds(416, 134, 46, 14);
	    			telpanel2.add(mm);
	    			
	    			JLabel lblDd = new JLabel("DD");
	    			lblDd.setFont(new Font("SansSerif", Font.BOLD, 12));
	    			lblDd.setForeground(Color.WHITE);
	    			lblDd.setBounds(459, 134, 46, 14);
	    			telpanel2.add(lblDd);
	    			
	    			
	    			
	    			 
	    			 
	    			 Integer[] saal = new Integer[60]; 
	    			 int ini=2018;
	    			 for(int i=0;i<50;i++){
	    			     saal[i]= ini;
	    			     ini++;
	    			 }
	    			 JComboBox year = new JComboBox(saal);
	    			year.setBounds(347, 159, 63, 20);
	    			telpanel2.add(year);
	    			
	    			
	    			
	    			 Integer[] mahina = new Integer[12]; 
	    			 int initi=1;
	    			 for(int i=0;i<12;i++){
	    			     mahina[i]= initi;
	    			     initi++;
	    			 }
	    			JComboBox month = new JComboBox(mahina);
	    			month.setBounds(409, 159, 43, 20);
	    			telpanel2.add(month);
	    			
	    			
	    			 Integer[] din = new Integer[31]; 
	    			 int init=1;
	    			 for(int i=0;i<31;i++){
	    			     din[i]= init;
	    			     init++;
	    			 }
	    			JComboBox day = new JComboBox(din);
	    			day.setBounds(451, 159, 43, 20);
	    			telpanel2.add(day);
	    		 
	    			
	    			
	    			
	    		 withdrawTextfield = new JTextField();
	    		 withdrawTextfield.addKeyListener(new KeyAdapter() {
		    		 	@Override
		    		 	public void keyTyped(KeyEvent evt) {
		    		 		char  c= evt.getKeyChar();
		    		 		if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
		    		 			evt.consume();
		    		 			warningTextfiled.setText("***Please enter the numeric value***");
		    		 		}
		    		 		if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
		    		 			warningTextfiled.setText("");
		    		 		}
		    		 	}
		    		 });
	    		 withdrawTextfield.setBounds(374, 356, 202, 20);
	    		 withdrawTextfield.setColumns(10);
	    		 withdrawTextfield.setEnabled(false);
	    		 telpanel2.add(withdrawTextfield);
	    		 
	    		 
	    		
	    		 JLabel lblWithdraw = new JLabel("WITHDRAW:");
	    		 lblWithdraw.setForeground(Color.WHITE);
	    		 lblWithdraw.setFont(new Font("SansSerif", Font.BOLD, 13));
	    		 lblWithdraw.setBounds(272, 358, 128, 14);
	    		 telpanel2.add(lblWithdraw);
	    		 
	    		 JLabel depositeLabel = new JLabel("DEPOSITE:");
	    		 depositeLabel.setForeground(Color.WHITE);
	    		 depositeLabel.setFont(new Font("SansSerif", Font.BOLD, 13));
	    		 depositeLabel.setBounds(272, 297, 92, 14);
	    		 telpanel2.add(depositeLabel);
	    		 
	    		 JButton btnDeposite = new JButton("DEPOSITE");
	    		
	    		 btnDeposite.setFont(new Font("Tahoma", Font.BOLD, 11));
	    		 btnDeposite.setForeground(Color.BLUE);
	    		 btnDeposite.setBackground(Color.LIGHT_GRAY);
	    		 btnDeposite.setBounds(416, 421, 104, 23);
	    		 btnDeposite.setEnabled(false);
	    		 telpanel2.add(btnDeposite);
	    		 
	    		 JButton btnWithdraw = new JButton("WITHDRAW");
	    		
	    		 btnWithdraw.setBackground(Color.LIGHT_GRAY);
	    		 btnWithdraw.setFont(new Font("Tahoma", Font.BOLD, 11));
	    		 btnWithdraw.setForeground(Color.BLUE);
	    		 btnWithdraw.setBounds(416, 387, 104, 23);
	    		 telpanel2.add(btnWithdraw);
	    		 btnWithdraw.setEnabled(false);
	    		 
	    		 JButton backBtn = new JButton("BACK");
	    		 backBtn.setSelectedIcon(new ImageIcon("C:\\Users\\adarsha\\Desktop\\download.png"));
	    		 backBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
	    		 backBtn.setForeground(Color.BLUE);
	    		 backBtn.setBounds(611, 463, 123, 35);
	    		 telpanel2.add(backBtn);
	    		 
	    		 
//panel1 and panel2 is made to separate the frame and required components are inserted
JPanel telpanel1 = new JPanel();
telpanel1.setLocation(0, 0);
telpanel2.add(telpanel1);
telpanel1.setSize(new Dimension(200, 800));

telpanel1.setBackground(new Color(0,153,153));
telpanel1.setLayout(null);

JLabel telicon = new JLabel("GJYH");
	telicon.setIcon(new ImageIcon("C:\\Users\\adarsha\\Desktop\\LOGOTELLER.png"));
	telicon.setBounds(10, 271, 180, 185);
	telpanel1.add(telicon);
	
	JLabel telIcon1 = new JLabel();
		telIcon1.setIcon(new ImageIcon("C:\\Users\\adarsha\\Desktop\\bsoftlo1.png"));
		telIcon1.setBounds(-44, 11, 244, 220);
		telpanel1.add(telIcon1);
		
		
		
		
	    		 comboBox.addItemListener(new ItemListener() {
	    		        public void itemStateChanged(ItemEvent e) {
	    		        	if(e.getSource()==comboBox) {
	    		        	if(comboBox.getSelectedItem().equals("WITHDRAW")) {
	    		        		btnDeposite.setEnabled(false);
	    		        		depositeTextfield.setEnabled(false);
	    		        		btnWithdraw.setEnabled(true);
	    		        		withdrawTextfield.setEnabled(true);
	    		        		
	    		        	}
	    		      
	    		        	else if(comboBox.getSelectedItem().equals("DEPOSITE")) {
	    		        		btnDeposite.setEnabled(true);
	    		        		depositeTextfield.setEnabled(true);
	    		        		btnWithdraw.setEnabled(false);
	    		        		withdrawTextfield.setEnabled(false);
	    		        		
	    		        	}
	    		        	else if(comboBox.getSelectedItem().equals("SELECT")) {
	    		        		btnDeposite.setEnabled(false);
    		        		depositeTextfield.setEnabled(false);
    		        		btnWithdraw.setEnabled(false);
    		        		withdrawTextfield.setEnabled(false);
	    		        	}
	    		        	
	    		        	}
	    		        	 
	    		        }
	    		    });
	    		 
	    		  
	    		 btnWithdraw.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						
			
	    		 if(comboBox.getSelectedItem().equals("WITHDRAW")) {
	    		       if(withdrawTextfield.getText().equals("")) {
	    			    JOptionPane.showMessageDialog(TellerSecond.this, String.format("PLEASE ENTER WITHDRAW AMOUNT"));
	   		            withdrawTextfield.requestFocus();
	    		         }
	    		 }
	    		 
					}
					});
	    		 btnDeposite.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						
			
	    		  if(comboBox.getSelectedItem().equals("DEPOSITE")) {
	    			 
	    			   if(depositeTextfield.getText().equals("")) {
		    			    JOptionPane.showMessageDialog(TellerSecond.this, String.format("PLEASE ENTER DEPOSITE AMOUNT"));
		   		            depositeTextfield.requestFocus();
		    		         }
	    		 }
	    		 
	    		  
					}
					});
					
	    		 
	    		 
	    		backBtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						TellerFirst tt = new TellerFirst();
						dispose();
						
					}
				} );
	    		
	    		
	    		
	    		
	    		
	    		JButton btnExit = new JButton("EXIT");
	    		btnExit.setBounds(498, 469, 89, 23);
	    		btnExit.setBorderPainted(false);
	    		btnExit.setFocusPainted(false);
	    		telpanel2.add(btnExit);
	    		
	    		
	    		
	    		btnExit.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						
					}
				});
	    		
	    		
	    		
	    
	    		 
	    		 setVisible(true);
}
}
