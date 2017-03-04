
import java.awt.Color;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ChatServer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ServerSocket server;
	private DataInputStream in;
	private DataOutputStream out;
	private final int PORT= 9001;
	JTextArea textArea = new JTextArea();

	public static void main(String[] args) throws Exception {
		
					ChatServer frame = new ChatServer();
					frame.setVisible(true);
					frame.initialize();
					frame.recieveClientMessages();
			
	}
	
	private void initialize() throws IOException{
		server = new ServerSocket(PORT);
		textArea.setText("Waiting for the Client to Join the Chat.....");
		Socket socket = server.accept();
	    in =new DataInputStream(socket.getInputStream());
	    out = new DataOutputStream(socket.getOutputStream());
	}
	private void recieveClientMessages() throws IOException{
		String messageRecieved = "";
		while(!messageRecieved.equalsIgnoreCase("exit")){
			messageRecieved = in.readUTF();
			textArea.setText(textArea.getText()+"\n Client :: "+messageRecieved);
		}
	}

	/**
	 * Create the frame.
	 */
	public ChatServer() {
		setTitle("Chat-Server");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 255), 3, true));
		scrollPane.setBounds(31, 23, 572, 288);
		contentPane.add(scrollPane);
		
		
		textArea.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		textField.setBounds(31, 376, 559, 56);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterMessageTo = new JLabel("Enter Message to Send");
		lblEnterMessageTo.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblEnterMessageTo.setBounds(32, 344, 231, 20);
		contentPane.add(lblEnterMessageTo);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sendMessage();
			}
		});
		btnSend.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnSend.setBounds(473, 443, 117, 29);
		contentPane.add(btnSend);
	}
	private void sendMessage(){
		String message = textField.getText();
		try {
			out.writeUTF(message);
			textArea.setText(textArea.getText()+"\n Server :: "+message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}