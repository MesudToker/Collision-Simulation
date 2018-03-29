/**
 * @(#)KeplerPanelListeners.java
 *
 *
 * @author Berfu Deniz Kara
 * @version 1.00 2015/5/11
 * 
 * This class holds the panel's listeners. 
 */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Timer;

public class KeplerPanelListeners implements MouseListener {
	   
	   //Paint variables
	   static int planetCounter = 0;
	   
	   //TIMER
	   static Timer timer;
	   static final int DELAY = 20;
	   
	   //Creating a planet and adding to formsList
	   public void createPlanet(){
		   Planet planetTemp = new Planet();
		   planetCounter++;
		   Planet.planetList.add(planetTemp);
		   KeplerPanel.formsList.add(planetTemp);   
	   }
	   
	   //MOUSE LISTENERS
	   @Override
	   public void mouseClicked(MouseEvent event) {
		   
		   	   //ADD
			   if(event.getSource() == KeplerPanel.btnAdd){
					if(planetCounter < 11){
						System.out.println("Added to index: "+planetCounter);
						createPlanet();
						//DrawPlanet.createMenu(DrawPlanet.menuList, DrawPlanet.planetNameList, DrawPlanet.planetMassList, DrawPlanet.planetRadiusList,  planetCounter);
						SimuTest.keplerPanel.repaint();
				        SimuTest.frame.repaint();
					}
					else
						System.out.println("Ups!! You can't add more than 10 planets !");
				}
			   
			    //REMOVE
				else if(event.getSource() == KeplerPanel.btnRemove){
					if(planetCounter!=0){	 					
			 			KeplerPanel.formsList.remove(planetCounter);
			 			Planet.planetList.remove(planetCounter-1);
			 		//	SimuTest.keplerPanel.remove(DrawPlanet.menuList.get(planetCounter));
			 			planetCounter--;
			 			System.out.println("Removed from index: "+planetCounter);		 				
					}
		 			else
						System.out.println("There is no planet to remove");
				}
			   
			    //START
				else if(event.getSource() == KeplerPanel.btnStart){
					timer.start();//starting timer
				}
			   
			   
			   //PAUSE    
				else if(event.getSource() == KeplerPanel.btnPause){
					//if timer is running, it will stop
					if(timer.isRunning())
						timer.stop();
					else
						System.out.println("You haven't started yet!");
				}
			   
			    //RESET
				else if(event.getSource() == KeplerPanel.btnReset){
					KeplerPanel.formsList.clear();//remove all the planets from the formsList
					Planet.planetList.clear();
					KeplerPanel.formsList.add(KeplerPanel.theStar);//readd the star to the formsList
					planetCounter=0;
					//if timer is running, stops the timer
					if(timer.isRunning())
						timer.stop();
				}
			   
			    
			    //PLUS
				else if(event.getSource() == KeplerPanel.buttonPlus){
					
				}
			   
			    //MINUS
				else if(event.getSource() == KeplerPanel.buttonMinus){
					
				}
			   
			    //SOUND SLIDER
				else if(event.getSource() == KeplerPanel.soundSlider){
					
				}
			   
		    }
		    @Override
			public void mouseEntered(MouseEvent arg0) {
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {

			}
			@Override
			public void mousePressed (MouseEvent arg0) {
				
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
    }   
