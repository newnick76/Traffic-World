package edu.csc150;

import java.util.Random;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import edu.csc150.carColors;

public class Cars extends Actor{
		
	public static Random randy = new Random();
	
	/*how to detect if your cars are at the intersection
	 * getObjectInRange(Radius, IntersectionListener.class);
	 * use an interface IntersectionListener{
	 *  public void approachingIntersection();
	 *  public void enteringIntersection();
	 *  public void leavingIntersection();
	 *  public void gone();
	 * }
	 */
	
	GreenfootImage[] images = new GreenfootImage[]{
			new GreenfootImage("images/topCarBlue.png"),
			new GreenfootImage("images/topCarYellow.png"),
			new GreenfootImage("images/topCarRed.png"),
			new GreenfootImage("images/topCarPurple.png"),};
	
	public Cars(int rotation){
		setImage(images[randy.nextInt(4)]);
		setRotation(rotation);
	}
	
	
	public void act(){
		move(1);
		isAtEdge();
	}
@Override
public boolean isAtEdge(){

	if(this.getX() == 0){
		this.setLocation(1000-2, this.getY());
		return true;
	}
	if(this.getX() == 999){
		this.setLocation(1, this.getY());
		return true;
	}
	if(this.getY() == 0){
		this.setLocation(this.getX(), 750-2);
		return true;
	}
	if(this.getY() == 749){
		this.setLocation(this.getX(), 1);
		return true;
	}
	return false;
	}
	
}


