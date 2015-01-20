package edu.csc150;

import java.awt.Color;

import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class TrafficWorld extends World {
	
	Roads[] Road = new Roads[Roads.numOfRoadsNS];
	
	public static int roadE;
	public static int roadW;
	public static int roadN;
	public static int roadS;
	
	public TrafficWorld(){
		super(1000, 750, 1);
		this.getBackground().setColor(Color.GREEN);
		this.getBackground().fill();
			
				for (int i = 0; i < Roads.numOfRoadsNS; i++){
					this.getBackground().setColor(Color.GRAY);
					if(i == 0){
						this.getBackground().fillRect(0, 0, 50, 750);
					}
					this.getBackground().fillRect(i*(1000-50)/(Roads.numOfRoadsNS-1), 0, 50, 750);
					
				}
				for (int i = 0; i < Roads.numOfRoadsEW; i++){
					this.getBackground().setColor(Color.GRAY);
					if(i == 0){
						this.getBackground().fillRect(0, 0, 1000, 50);
					}
					this.getBackground().fillRect(0, i*(750-50)/(Roads.numOfRoadsEW-1), 1000, 50);
					
					
				}
				
				for (int i = 0; i < Roads.numOfRoadsEW; i++){
					roadE = (i*175)+35;
					this.addObject(new Cars(0), Greenfoot.getRandomNumber(1000), roadE);
				}
				
				for (int i = 0; i < Roads.numOfRoadsEW; i++){
					roadW = (i*175)+10;
					this.addObject(new Cars(180), Greenfoot.getRandomNumber(1000), roadW);
				}
				
				for (int i = 0; i < Roads.numOfRoadsNS; i++){
					roadS = (i*158)+10;
					this.addObject(new Cars(90), roadS, Greenfoot.getRandomNumber(750));
				}
				
				for (int i = 0; i < Roads.numOfRoadsNS; i++){
					roadN = (i*158)+35;
					this.addObject(new Cars(270), roadN, Greenfoot.getRandomNumber(750));
				}
		
		Intersections inter = new Intersections();
		inter.makeIntersections(this);
		
	}
}
