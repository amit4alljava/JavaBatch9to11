import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameOne extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					GameOne frame = new GameOne();
					frame.setVisible(true);
			
	}
	private void askForClose(){
		int choice = JOptionPane.showConfirmDialog(this,
				"Do u really want to close this window"
				,"My Gaming",JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION){
					this.setVisible(false);
					this.dispose();
				}
				else
				if(choice == JOptionPane.NO_OPTION){	
					return;
				}
	}

	/**
	 * Create the frame.
	 */
	public GameOne() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForClose();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGameOne = new JLabel("Game One");
		lblGameOne.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblGameOne.setBounds(182, 21, 143, 40);
		contentPane.add(lblGameOne);
	}
}
