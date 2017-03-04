

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TicTacToeSecondPlayer extends JFrame {
private JLabel msglbl = new JLabel("");
private boolean isXorZero = true;
private boolean yourTurn = true;
	private JPanel contentPane;
	Socket socket;
	final String SERVER_NAME ="localhost";
	final int PORT = 9001;
	DataInputStream input ;
	DataOutputStream output;
	private void initialize() throws IOException{
		
		msglbl.setText("Player1 Already Join...");
		 socket = new Socket(SERVER_NAME,PORT);
		input= new DataInputStream(socket.getInputStream());
		output = new DataOutputStream(socket.getOutputStream());
	}
	private void recieveInput() throws IOException{
		String recInput = "";
		while(!recInput.equalsIgnoreCase("exit")){
			yourTurn = true;
			msglbl.setText("Now Your Turn ");
			recInput = input.readUTF();
			System.out.println("Rec Input "+recInput);
			placeZero(recInput);
		}
	}
	private void placeZero(String recInput){
		System.out.println("Client Side Zero Call "+recInput);
		if(recInput.trim().length()>0){
			yourTurn=true;
			String array[]=recInput.split(",");
			int position = Integer.parseInt(array[0]);
			String buttonValue = array[1];
			switch(position){
			case 1:
				one.setText(buttonValue);
				break;
			case 2:
				two.setText(buttonValue);
				break;
			case 3:
				three.setText(buttonValue);
				break;
			case 4:
				four.setText(buttonValue);
				break;
			case 5:
				fifth.setText(buttonValue);
				break;
			case 6:
				six.setText(buttonValue);
				break;
			case 7:
				seven.setText(buttonValue);
				break;
			case 8:
				eight.setText(buttonValue);
				break;
			case 9:
				nine.setText(buttonValue);
				break;	
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		
					TicTacToeSecondPlayer frame = new TicTacToeSecondPlayer();
					frame.setVisible(true);
					frame.initialize();
					frame.recieveInput();
				
	
	}

	/**
	 * Create the frame.
	 */
	JButton one = new JButton("");
	JButton two = new JButton("");
	JButton three = new JButton("");
	JButton four = new JButton("");
	JButton fifth = new JButton("");
	JButton six = new JButton("");
	JButton seven = new JButton("");
	JButton eight = new JButton("");
	JButton nine = new JButton("");
	public TicTacToeSecondPlayer() {
		setTitle("TicTacToe- Player Two");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendX(1,one);
			}
		});
		one.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		one.setBounds(31, 73, 97, 71);
		contentPane.add(one);
		
		
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendX(2,two);
			}
		});
		two.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		two.setBounds(236, 73, 97, 71);
		contentPane.add(two);
		
		
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendX(3,three);
			}
		});
		three.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		three.setBounds(463, 73, 97, 71);
		contentPane.add(three);
		
		
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendX(4,four);
			}
		});
		four.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		four.setBounds(31, 194, 97, 71);
		contentPane.add(four);
		
		
		fifth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendX(5,fifth);
			}
		});
		fifth.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		fifth.setBounds(236, 194, 97, 71);
		contentPane.add(fifth);
		
		
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendX(6,six);
			}
		});
		six.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		six.setBounds(463, 194, 97, 71);
		contentPane.add(six);
		
		
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendX(7,seven);
			}
		});
		seven.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		seven.setBounds(31, 302, 97, 71);
		contentPane.add(seven);
		
		
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendX(8,eight);
			}
		});
		eight.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		eight.setBounds(236, 302, 97, 71);
		contentPane.add(eight);
		
		
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendX(9,nine);
			}
		});
		nine.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		nine.setBounds(463, 302, 97, 71);
		contentPane.add(nine);
		
		
		msglbl.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		msglbl.setBounds(20, 22, 580, 39);
		contentPane.add(msglbl);
	}

	
	
	private void sendX(int buttonPosition,JButton button){
		if(button.getText().trim().length()==0){
			if(yourTurn){
				button.setText("X");
				yourTurn =false;
				msglbl.setText("Now Player One Turn....Wait for Your Turn...");
				try {
					output.writeUTF(buttonPosition+","+"X");
					System.out.println("SendZero Call Pos "+buttonPosition+" Value X "+" Your Turn "+yourTurn);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}