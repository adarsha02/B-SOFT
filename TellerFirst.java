import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TellerFirst extends JFrame {
	private JTextField txtEnterName;
	private JTextField accountNumber;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JButton EnterBtn;
	public TellerFirst() {
		setAlwaysOnTop(true);
		itscustomerdetailframe();
	}
	public void itscustomerdetailframe() {
		//code for frame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	       setTitle("logIn");
	       setUndecorated(true);
	       setResizable(false);
	       setBounds(100, 100, 723, 498);
	       
	       
	      
	       
	//panel1 and panel2 is made to separate the frame and required components are inserted
	JPanel telpanel1 = new JPanel();
	telpanel1.setSize(new Dimension(200,800));
	
	telpanel1.setBackground(new Color(255,255,255,100));
		        getContentPane().add(telpanel1);
		        telpanel1.setLayout(null);
		        
		JPanel telpanel2 = new JPanel();
		 telpanel2.setBackground(new Color(51,102,153,100));
		 telpanel2.setLayout(null);
		    		 getContentPane().add(telpanel2);
   
		    		 JLabel telicon = new JLabel();
		 			telicon.setIcon(new ImageIcon("C:\\Users\\adarsha\\Desktop\\LOGOTELLER.png"));
		 			telicon.setBounds(10, 271, 180, 185);
		 			telpanel1.add(telicon);
		    		 
		 			
		 			
   JLabel tellabel1 =new JLabel("CUSTOMER DETAILS", SwingConstants.CENTER);
  tellabel1.setForeground(Color.WHITE);
  tellabel1.setFont(new Font("Serif", Font.BOLD,30));
  telpanel2.add(tellabel1);
  
  JLabel telIcon1 = new JLabel();
	telIcon1.setIcon(new ImageIcon("C:\\Users\\adarsha\\Desktop\\bsoftlo1.png"));
	telIcon1.setBounds(-44, 11, 244, 220);
	telpanel1.add(telIcon1);
  
  lblNewLabel_1 = new JLabel("CUSTOMER DETAILS");
  lblNewLabel_1.setForeground(Color.WHITE);
  lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
  lblNewLabel_1.setBounds(329, 68, 228, 38);
  telpanel2.add(lblNewLabel_1);
  
  JLabel lblNewLabel_2 = new JLabel("NAME:\r\n\r\n");
  lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 13));
  lblNewLabel_2.setForeground(Color.WHITE);
  lblNewLabel_2.setBounds(246, 163, 56, 17);
  telpanel2.add(lblNewLabel_2);
  
  txtEnterName = new JTextField();
  txtEnterName.setFont(new Font("Tahoma", Font.ITALIC, 11));
  //txtEnterName.setText("ENTER NAME");
  txtEnterName.setBounds(312, 162, 173, 20);
  telpanel2.add(txtEnterName);
  txtEnterName.setColumns(10);
  
  /*
txtEnterName.addFocusListener(new FocusListener() {
	
	@Override
	public void focusLost(FocusEvent arg0) {
		if(txtEnterName.getText().equals("")) {
			txtEnterName.setText("ENTER NAME");
			}
		
	}
	
	@Override
	public void focusGained(FocusEvent arg0) {
		if(txtEnterName.getText().equals("ENTER NAME")) {
			txtEnterName.setText("");
			}
		
	}
});

*/
  
  
  JLabel warningText = new JLabel("");
  warningText.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
  warningText.setForeground(Color.WHITE);
  warningText.setBounds(495, 225, 218, 14);
  telpanel2.add(warningText);
 
  accountNumber = new JTextField(20);
  accountNumber.addKeyListener(new KeyAdapter() {
	 	@Override
	 	public void keyTyped(KeyEvent eee) {
	 		char  c= eee.getKeyChar();
	 		if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
	 			eee.consume();
	 			warningText.setText("****Please enter the numeric value***");
	 		}
	 		if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
	 			warningText.setText("");
	 		}
	 	}
	 });
  accountNumber.setFont(new Font("Tahoma", Font.ITALIC, 11));
  //accountNumber.setText("ENTER ACC NUM");
  accountNumber.setBounds(312, 219, 173, 20);
  accountNumber.setBorder(null);
  telpanel2.add(accountNumber);
  accountNumber.setColumns(10);

  
 
 // if(accNum=null) {
	//  JDialog accdialog = new JDialog(this, "PLEASE ENTER ACCOUNT NUMBER!!", true);
	//  telpanel2.add(accdialog); 
 // }
 
  lblNewLabel_3 = new JLabel("ACC. NUM:");
  lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 13));
  lblNewLabel_3.setForeground(Color.WHITE);
  lblNewLabel_3.setBounds(225, 225, 71, 14);
  telpanel2.add(lblNewLabel_3);
  
  EnterBtn = new JButton("ENTER");
  EnterBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
  EnterBtn.setForeground(Color.BLUE);
  EnterBtn.setBackground(Color.LIGHT_GRAY);
  EnterBtn.setBounds(288, 275, 109, 31);
  telpanel2.add(EnterBtn);
  
 
  

  EnterBtn.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent ee) {
		 String name = txtEnterName.getText();
		 if ((accountNumber.getText().equals("")) && name.equals("")) {
	    	  JOptionPane.showMessageDialog(TellerFirst.this, String.format("PLEASE ENTER NAME AND ACCOUNT NUMBER"));
		      txtEnterName.requestFocus();
		  
		  }
		  else if (accountNumber.getText().equals("")) {
			  JOptionPane.showMessageDialog(TellerFirst.this, String.format("PLEASE ENTER ACCOUNT NUMBER"));
		      accountNumber.requestFocus();
		  }
		      else if(name.equals("")) {
				  JOptionPane.showMessageDialog(TellerFirst.this, String.format("PLEASE ENTER NAME"));
			      txtEnterName.requestFocus();
		      }
		  
		  else {
		   
		TellerSecond ts = new TellerSecond();
		  }
	}
});

setVisible(true);

	}
}
