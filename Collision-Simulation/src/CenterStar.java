/**
 * @(#)CenterStar.java
 *
 *
 * @author Berfu Deniz Kara
 * @version 1.00 2015/5/11
 * 
 * The CenterStar class creates the special object "Star" at the center. Star's velocity and distanceToStar variables are always zero.
 */

public class CenterStar extends Form {
	
	//empty constructor
	public CenterStar() {
		super();//extends Form's empty constructor
		name = "Canis Majoris";
		mass = 100;
		radius = 55;
		locationX = 350;
		locationY = 180;
		//Star's velocity, vectors and distanceToStar variables are always zero.
		distanceToStar = 0.0;
		vectorX = 0.0;
		vectorY = 0.0;
		velocity = 0.0;	
	}
	
	// constructor
	public CenterStar(String name, double mass, int radius, double vectorX, double vectorY, int locationX, int locationY) {
		super(name, mass, radius, vectorX, vectorY, locationX, locationY);//extends Form's constructor
		locationX = 350;
		locationY = 200;
		//Star's velocity, vectors and distanceToStar variables are always zero.
		this.distanceToStar = 0.0;
		vectorX = 0.0;
		vectorY = 0.0;
		this.velocity = 0.0;
	}
		
	//Sets star's velocity, vectors and distanceToStar variables to zero and Locations won't change
	@Override
	public void setDistanceToStar(int distanceToStar) {
		distanceToStar = 0;
	}

	@Override
	public void setLocationX(int locationX) {
		locationX = 350;
	}
	
	@Override
	public void setLocationY(int locationY) {
		locationY = 180;
	}
	
	@Override
	public void setVectorY(double vectorY) {
		vectorY = 0.0;
	}
	
	@Override
	public void setVelocity(double velocity) {
		this.velocity = 0.0;
	}
	
	@Override
	public void setVectorXY(double vectorX, double vectorY){
		this.vectorX = 0.0;
		this.vectorY = 0.0;
	}
	
	@Override
	public void setVelocity(double vectorX, double vectorY) {
		this.velocity = 0.0;
	}
}
