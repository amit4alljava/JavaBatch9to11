

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy {
	//private int powerLeft ;
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean isVisible;
	private Image image;
	private final String IMAGE_NAME = "enemy.gif";
	private int velX;
	private int velY;
	public Enemy(int x,int y){
		this.velX = this.x = x ;
		this.velY= this.y = y;
		isVisible = true;
		
		image = new ImageIcon(Enemy.class.getResource(IMAGE_NAME)).getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
	}
	public void move(){
		if(velX>0){
			velX--;
		}
		else
		if(velX==0){
			velX = x;
			//isVisible=false;
		}
	}
	
	public Rectangle getRectangle(){
		Rectangle rectangle = new Rectangle(velX, velY, width, height);
		return rectangle;
	}
	public int getVelX() {
		return velX;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public int getVelY() {
		return velY;
	}
	public void setVelY(int velY) {
		this.velY = velY;
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
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	
}
