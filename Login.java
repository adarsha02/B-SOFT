
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame
{
    public JTextField loginusernametextfield;
    public JButton loginexitbtn1;
    public JButton loginbtn1;
    private JPasswordField loginpasswordfield;
   
    public Login() {
        setAlwaysOnTop(true);
        setTitle("LogIn");
        setResizable(false);
        getContentPane().setBackground(new Color(51, 102, 153));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 723, 498);
        getContentPane().setLayout(null);
        JPanel subPanel = new JPanel();
        subPanel.setBackground(new Color(0, 153, 153));
        subPanel.setBounds(0, 0, 192, 458);
        getContentPane().add(subPanel);
        subPanel.setLayout(null);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lionheqrt\\Downloads\\partnership.png"));
        lblNewLabel.setBounds(10, 84, 125, 152);
        subPanel.add(lblNewLabel);

        JLabel lblBsoft = new JLabel("Bsoft");
        lblBsoft.setForeground(new Color(255, 255, 255));
        lblBsoft.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblBsoft.setBounds(38, 247, 97, 33);
        subPanel.add(lblBsoft);

        JLabel lblLogIn = new JLabel("Log In");
        lblLogIn.setForeground(new Color(255, 255, 255));
        lblLogIn.setFont(new Font("Tahoma", Font.PLAIN, 45));
        lblLogIn.setBounds(365, 85, 171, 61);
        getContentPane().add(lblLogIn);

        loginusernametextfield = new JTextField();
        loginusernametextfield.setFont(new Font("Tahoma", Font.ITALIC, 14));
        loginusernametextfield.setText("");
        loginusernametextfield.setBackground(new Color(51, 102, 153));
        loginusernametextfield.setForeground(new Color(255, 255, 255));
        loginusernametextfield.setBounds(317, 202, 204, 34);
        loginusernametextfield.setBorder(null);
        getContentPane().add(loginusernametextfield);
        loginusernametextfield.setColumns(10);
        loginusernametextfield.hasFocus();

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblPassword.setBounds(313, 255, 155, 34);
        getContentPane().add(lblPassword);

        loginbtn1 = new JButton("LOGIN");
        loginbtn1.setForeground(new Color(0, 102, 153));
        loginbtn1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        loginbtn1.setBounds(313, 378, 115, 37);
        getContentPane().add(loginbtn1);

        loginexitbtn1 = new JButton("EXIT");
        loginexitbtn1.setForeground(new Color(0, 102, 153));
        loginexitbtn1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        loginexitbtn1.setBounds(494, 378, 115, 37);
        getContentPane().add(loginexitbtn1);
        
        loginexitbtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});

        JSeparator separator = new JSeparator();
        separator.setBounds(313, 242, 225, 2);
        getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(313, 345, 265, 2);
        getContentPane().add(separator_1);

        JLabel lblEmmployId = new JLabel("Username");
        lblEmmployId.setForeground(Color.WHITE);
        lblEmmployId.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblEmmployId.setBounds(307, 171, 161, 34);
        getContentPane().add(lblEmmployId);
        
       loginpasswordfield= new JPasswordField();
        loginpasswordfield.setBounds(320, 308, 225, 34);
        loginpasswordfield.setBackground(new Color(51, 102, 153));
        loginpasswordfield.setForeground(new Color(255, 255, 255));
        loginpasswordfield.setBorder(null);
       
        loginusernametextfield.setBorder(null);
        getContentPane().add(loginpasswordfield);
        loginbtn1.addActionListener(this::actionPerformed);
        loginexitbtn1.addActionListener(this::actionPerformed);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (command.equals("LOGIN")) {
            String tempusername = loginusernametextfield.getText();
           
			String temppassword = String.valueOf(loginpasswordfield.getPassword());

            if (tempusername.equals("") && temppassword.equals("")) {

                JOptionPane.showMessageDialog(Login.this, String.format("Username and Password field left empty"));
                loginusernametextfield.requestFocus();//sets the focus back to username field
            } else if (tempusername.equals("")) {
                JOptionPane.showMessageDialog(Login.this, String.format("Username field left empty"));
                loginusernametextfield.requestFocus();// sets the focus back to username field
            } else if (temppassword.equals("")) {
                JOptionPane.showMessageDialog(Login.this, String.format("Password field left empty"));
                loginpasswordfield.requestFocus();// sets the focus back to password field

            } else {
                MysqlConnection msc = new MysqlConnection();
                int returnvalue;
                returnvalue = msc.authenticateemployees(getusername(), getpassword());
                switch (returnvalue) {
                   /* case 1:
                        admin adn = new admin();
                        setVisible(false);
                        break;
                     case 2:
                        Manager mgr = new Manager();
                        setVisible(false);
                        break;
                        */
                        
                    case 3:
                        TellerFirst tllr = new TellerFirst();
                        setVisible(false);
                        break;
                  /* case 4:
                        SystemAdmin san = new SystemAdmin();
                        setVisible(false);
                        break;
                        */
                    case 5:
                        CustoService cse = new CustoService();
                        setVisible(false);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(Login.this, String.format("Username/Password incorrect"));
                        loginpasswordfield.setText("");
                        loginusernametextfield.setText("");
                        loginusernametextfield.hasFocus();
                }
            }
        }
    }
    public String getusername()
    {
        return loginusernametextfield.getText();
    }
    public String getpassword()
    {
        return String.valueOf(loginpasswordfield.getPassword());

    }
}
