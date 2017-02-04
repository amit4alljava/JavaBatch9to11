import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

public class MyIntroScreen extends JWindow {
	JLabel photo = new JLabel(""); // Instance Variable
	JLabel lblGameOn = new JLabel("Game On");
	JProgressBar progressBar = new JProgressBar();
	Timer timer ;
	private final int DELAY = 100;
	private boolean isVisible = false;
	private int counter = 1;
	MP3Player player ;
	private void playSong(){
		player = new MP3Player(MyIntroScreen.class.getResource("S.mp3"));
		player.play();
	}
	
	private void animation(){
		ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lblGameOn.setVisible(isVisible);
				isVisible = !isVisible;
				progressBar.setValue(counter);
				if(counter>=100){
					timer.stop();
					player.stop();
					MyIntroScreen.this.setVisible(false);
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				}
				counter++;
				
				
			}
		};
		timer = new Timer(DELAY,action);
		timer.start();
	}
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					MyIntroScreen frame = new MyIntroScreen();
					frame.setVisible(true);
					frame.animation();
					frame.playSong();
				
	}

	/**
	 * Create the frame.
	 */
	public MyIntroScreen() {
		Icon icon = new ImageIcon(MyIntroScreen.class.getResource("intro.gif"));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// Local Variable
		
		photo.setIcon(icon);
		photo.setBounds(6, 6, 438, 252);
		contentPane.add(photo);
		
		
		lblGameOn.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		lblGameOn.setBounds(161, 270, 149, 41);
		contentPane.add(lblGameOn);
		
		
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		progressBar.setStringPainted(true);
		progressBar.setBounds(6, 310, 438, 20);
		contentPane.add(progressBar);
	}
}
