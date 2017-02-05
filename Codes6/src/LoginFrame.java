import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField useridtxt;
	private JPasswordField passwordField;
	private void login(){
		String userid = useridtxt.getText();
		String password = passwordField.getText();
		if(userid.equals(password)){
			this.setVisible(false);
			this.dispose();
			WelcomeScreen screen = new WelcomeScreen(userid);
			//MySecondScreen screen = new MySecondScreen();
			screen.setVisible(true);
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Invalid Userid or Password");
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				
	}
	private void design(){
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginForm = new JLabel("Login Form");
		lblLoginForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginForm.setForeground(Color.RED);
		lblLoginForm.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblLoginForm.setBounds(154, 22, 161, 65);
		contentPane.add(lblLoginForm);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblUserid.setBounds(33, 106, 103, 16);
		contentPane.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblPassword.setBounds(33, 166, 103, 16);
		contentPane.add(lblPassword);
		
		useridtxt = new JTextField();
		useridtxt.setBounds(127, 102, 215, 26);
		contentPane.add(useridtxt);
		useridtxt.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 162, 194, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnLogin.setBounds(35, 215, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(161, 215, 117, 29);
		contentPane.add(btnReset);
	}
	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		design();
	}
}
