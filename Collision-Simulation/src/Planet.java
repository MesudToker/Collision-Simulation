/**
 * @(#)Planet.java
 *
 *
 * @author Berfu Deniz Kara
 * @version 1.00 2015/5/11
 * 
 * The Planet class creates planets and add them into "planetList" ArrayList.
 */

import java.util.ArrayList;

public class Planet extends Form {
    
	//an ArrayList to hold the Planets that has been created
	static ArrayList<Planet> planetList = new ArrayList<Planet>();
	
	//empty constructor
	public Planet() {
		super();//extends Form's empty constructor	
	}	
	
	//constructor
	public Planet(String name, double mass, int radius, double vectorX, double vectorY, int locationX, int locationY) {
		super(name, mass, radius, vectorX, vectorY, locationX, locationY);//extends Form's constructor	
	}
	
	//adds planet into planetList ArrayList
	public void addPlanet(Planet pl){
		planetList.add(pl); 
	}
	
	//removes planet from planetList ArrayList
	public void removePlanet(Planet pl){
		planetList.remove(pl);
	}
}
