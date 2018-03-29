/**
 * @(#)Kepler.java
 *
 *
 * @author Berfu Deniz Kara
 * @version 1.00 2015/5/11
 * 
 * The Kepler class is where all the calculations are done. 
 */

import java.util.ArrayList;

public class Kepler {
	
	final static double G =(6.67)/(100000000000.0) ; // The universal gravitational constant (6.67 × 10-11 N m2 kg-2) 
	                                                 // It will be used in the gravitation method*****( F = G m1 m2 / r2 )
    
	
	//Calculates the gravitation between two form object
	public static double gravitation(Form fa, Form fb){	
		//
		if((fa.getDistanceToStar()-fb.getDistanceToStar()) == 0 )
			return 0.0;
        //            F      =  G *   m1*m2                      /  r^2  
		double gravitation   =  G * ((fa.getMass()*fb.getMass()) / Math.pow(Math.abs(fa.getDistanceToStar()-fb.getDistanceToStar()), 2));
		return (int)gravitation; 
	}
	
	//Calculates the gravitation for all the objects in the system by one by one
	public static void gravitationMap(ArrayList<Form> formsList){
		for(int i = 0; i < formsList.size()-1; i++){
			for(int k = 0; k <= i; k++){
				//adds the gravitation value to the forms
				formsList.get(k).setVectorX(formsList.get(k).getVectorX() + gravitation(formsList.get(k), formsList.get(k+1)));
				formsList.get(k+1).setVectorX(formsList.get(k+1).getVectorX()  + gravitation(formsList.get(k), formsList.get(k+1)));
			}
		}
	}
	
	//Calculates the period one by one for all objects
	public static double period(ArrayList<Form> formsList){
		
		return 0.0;
	}
	
	//calculates the velocity of all planets
    public static void velocity(ArrayList<Form> formsList){
		for(int i = 0; i < formsList.size(); i++){
			formsList.get(i).setVelocity(formsList.get(i).getVectorX(), formsList.get(i).getVectorY());
		}	
	}
	
	//reverse the rotation by multiply the velocity with " -1 "
	public static void rotationReverse(ArrayList<Form> formsList){
		for(int i =0; i < formsList.size() -1; i++){
			formsList.get(i).setVelocity(formsList.get(i).getVelocity() * (-1));
		}
	}
}

