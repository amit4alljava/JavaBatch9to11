

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Plane {
	private final String  IMAGE_NAME = "helicopter.png";
	private int width;
	private int height;
	private boolean isVisible;
	private int x ;
	private int y;
	private Image image;
	private int planeXMove;
	private int planeYMove;
	private ArrayList<Missile> missileList= new ArrayList<>();
	public Rectangle getRectangle(){
		Rectangle rectangle = new Rectangle(x, y, width, height);
		return rectangle;
	}
	public Plane(){
		x = 50;
		y = 50;
		isVisible = true;
		
		image = new ImageIcon(Plane.class.getResource(IMAGE_NAME)).getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	
	public void move(){
		x+=planeXMove;
		y+=planeYMove;
//		if(x<GameLauncher.BOARD_WIDTH){
//			x+=planeXMove;
//			
//		}
//		else
//		if(y<GameLauncher.BOARD_HEIGHT){	
//			y+=planeYMove;
//		}
	}
	
	
	
	public ArrayList<Missile> getMissileList() {
		return missileList;
	}
	public void setMissileList(ArrayList<Missile> missileList) {
		this.missileList = missileList;
	}
	public void launchMissile(){
		Missile missile = new Missile();
		missile.setX(this.getX()+this.getWidth());
		missile.setY(this.getY());
		
		this.missileList.add(missile);
		Toolkit.getDefaultToolkit().beep();
		System.out.println("Missile Launch "+this);
		
	}
	
	public void planeMove(KeyEvent e){
		int keyCode = e.getKeyCode();
		//System.out.println(keyCode);
		if(keyCode == KeyEvent.VK_SPACE){
			launchMissile();
		}
		if(keyCode == KeyEvent.VK_LEFT ){
			planeXMove=-1;
			
		}
		if(keyCode == KeyEvent.VK_RIGHT  ){
			planeXMove=1;
			System.out.println("X is "+x);
			
		}
		if(keyCode == KeyEvent.VK_UP ){
			planeYMove=-1;
			
		}
		if(keyCode == KeyEvent.VK_DOWN && y<(GameLauncher.BOARD_HEIGHT-100)){
			planeYMove=1;
			System.out.println("Y is "+y);
		}
	}
	
	public void planeDontMove(){
		planeXMove=0;
		planeYMove=0;
	}
	
	@Override
	public String toString(){
		return "Plane X "+x+" and Y "+y+" Missile "+missileList;
	}
	
}
