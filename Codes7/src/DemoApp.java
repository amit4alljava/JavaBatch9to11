

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class DemoApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoApp frame = new DemoApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3,3,12,12));
		
		JButton buttonArr [] = new JButton[9];
		for(int i =0; i<buttonArr.length; i++){
			buttonArr[i] = new JButton("");
			contentPane.add(buttonArr[i]);
		}
		
		
//		JButton btnNewButton_1 = new JButton("New button");
//		contentPane.add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("New button");
//		contentPane.add(btnNewButton_2);
//		
//		JButton btnNewButton = new JButton("New button");
//		contentPane.add(btnNewButton);
//		JButton btnNewButton3 = new JButton("New button");
//		contentPane.add(btnNewButton3);
//		JButton btnNewButton4 = new JButton("New button");
//		contentPane.add(btnNewButton4);
//		JButton btnNewButton5 = new JButton("New button");
//		contentPane.add(btnNewButton5);
//		JButton btnNewButton6 = new JButton("New button");
//		contentPane.add(btnNewButton6);
//		JButton btnNewButton7 = new JButton("New button");
//		contentPane.add(btnNewButton7);
	}

}
