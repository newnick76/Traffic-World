package edu.csc150;

import java.awt.Color;

import greenfoot.Actor;
import greenfoot.World;
import greenfoot.GreenfootImage;

public class Intersections extends Actor{

	public Intersections(){
		GreenfootImage image = new GreenfootImage(50,50);
		setImage(image);
	}
	
	public void makeIntersections(World world){
		for(int i = 0; i < Roads.numOfRoadsNS; i++){
			for(int s = 0; s < Roads.numOfRoadsEW; s++){
			
				world.addObject(new Intersections(), (int)(i*158.4)+25, 25);
				world.addObject(new Intersections(), (int)(i*158.4)+25, 200);
				world.addObject(new Intersections(), (int)(i*158.4)+25, 375);
				world.addObject(new Intersections(), (int)(i*158.4)+25, 550);
				world.addObject(new Intersections(), (int)(i*158.4)+25, 725);
			}
		}
	}
	
}
