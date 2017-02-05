import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Plane {
	private int x;
	private int y;
	private Image image;
	private int width;
	private int height;
	private boolean isVisible;
	private int velX;
	private int velY;
	
	public Rectangle getRectangle(){
		Rectangle r = new Rectangle(x,y,width,height);
		return r;
	}
	
	public void dontMove(){
		velX = 0;
		velY = 0;
	}
	public void direction(KeyEvent e){
		
		
		if(e.getKeyCode() == KeyEvent.VK_UP){
			velY = -1;
		}
		
		else
		if(e.getKeyCode() == KeyEvent.VK_DOWN){	
			velY = 1;
		}
		else
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			if(x==5){
				velX = 0;
			}
			else{
			velX = -1;
			}
			}
		else
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			if(x ==GameOne.BOARD_WIDTH-image.getWidth(null)){
				velX =0;
			}
			else{
			velX = 1;
			}
		}
		//move();
	}
	public void move(){
		x = x + velX;
		y = y + velY;
		
	}
	
	Plane(){
		x = 50;
		y = 100;
		 image = 
				new ImageIcon
				(Plane.class.getResource("helicopter.png")).getImage();
		 width = image.getWidth(null);
		 height = image.getHeight(null);
		 isVisible = true;
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
	
	
}
