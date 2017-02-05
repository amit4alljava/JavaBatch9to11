import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MySecondScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					MySecondScreen frame = new MySecondScreen();
					frame.setVisible(true);
				
	}
	
	private void print(String message){
		JOptionPane.showMessageDialog(this, message);
	}

	/**
	 * Create the frame.
	 */
	public MySecondScreen() {
		
		setBounds(100, 100, 450, 300);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print("U Click on Ok");
			}
		});
		btnOk.setMnemonic('o');
		btnOk.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnOk.setBounds(37, 44, 117, 29);
		contentPane.add(btnOk);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblWelcome.setBounds(151, 16, 184, 16);
		contentPane.add(lblWelcome);
	}
}
