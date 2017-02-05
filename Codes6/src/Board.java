import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
	private Timer timer;
	Plane plane;
	final int DELAY = 5;
	public void updateGame(){
		timer = new Timer(DELAY,new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				plane.move();
				repaint();
				System.out.println("Timer Calling...");
			}
		});
		timer.start();
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D twoD = (Graphics2D)g;
		if(plane.isVisible()){
		twoD.drawImage(plane.getImage(), plane.getX(), plane.getY(), this);
		}
		// My Painting
	}
	
	public Board(){
		this.setBounds(0,0,GameOne.BOARD_WIDTH,GameOne.BOARD_HEIGHT);
		this.setBackground(Color.CYAN);
		plane = new Plane();
		this.setFocusable(true);
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				plane.direction(e);
				//repaint();
				//System.out.println(e.getKeyCode()+" "+e.getKeyChar());
			}
			@Override
			public void keyReleased(KeyEvent e){
				plane.dontMove();
			}
		});
		updateGame();
		//this.setSize();
	}
	
}
