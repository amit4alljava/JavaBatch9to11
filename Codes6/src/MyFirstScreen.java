import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFirstScreen  extends JFrame {//implements ActionListener {
	private final int WIDTH = 300;
	private final int HEIGHT = 300;
	
//	@Override
//	public void actionPerformed(ActionEvent e){
//		String label  = e.getActionCommand();
//		if(label.equals("OK")){
//		JOptionPane.showMessageDialog(this, "U Click on OK");
//		}
//		else
//		if(label.equals("Cancel")){
//			JOptionPane.showMessageDialog(this, "U Click on Cancel");
//			}
//		else
//		if(label.equals("welcome")){
//			JOptionPane.showMessageDialog(this, "U Click on welcome");
//			}
//	}
	
	private void print(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}
	
	public MyFirstScreen(){
		JButton ok = new JButton("OK");
		//ok.addActionListener(this);
		// Step - 1 Class Create + implement interface + override method + create object
		ok.addActionListener((e)->print( "U Click on ok"));
//		ok.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				print( "U Click on ok");
//				
//			}
//		});
		ok.setBounds(10, 10, 70, 50);
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				print("U Click on Cancel");
				
			}
		});
		//cancel.addActionListener(this);
		cancel.setBounds(10, 70, 70, 50);
		
		JButton welcome = new JButton("welcome");
welcome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				print("U Click on Welcome");
				
			}
		});
		//welcome.addActionListener(this);
		welcome.setBounds(80, 50, 70, 50);
		this.setSize(WIDTH,HEIGHT);
		this.setTitle("My Screen");
		this.setLocation(300, 200);
		this.getContentPane().setLayout(null);
		//this.getContentPane().setLayout(new GridLayout(2, 2));
		//this.getContentPane().setLayout(new FlowLayout());
		this.add(ok);
		this.add(cancel);
		this.add(welcome);
		//this.getContentPane().add(ok,BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		MyFirstScreen obj = new MyFirstScreen();
		
		obj.setVisible(true);

	}

}
