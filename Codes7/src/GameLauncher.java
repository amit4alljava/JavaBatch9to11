

import java.awt.BorderLayout;

import javax.swing.JFrame;

// It is a Frame
public class GameLauncher extends JFrame{
	public static final int BOARD_WIDTH = 500;
	public static final  int BOARD_HEIGHT = 500;
	public GameLauncher(){
		Board board = new Board();
		
		this.add(board);
		this.setSize(BOARD_WIDTH, BOARD_HEIGHT);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameLauncher gameLauncher = new GameLauncher();

	}

}
