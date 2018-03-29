/**
 * @(#)KeplerPanel.java
 *
 *
 * @author Berfu Deniz Kara
 * @version 1.00 2015/5/11
 * 
 * This class holds the panel and the timer's listener 
 */

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JSlider;
import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.UIManager;

@SuppressWarnings("serial")
public class KeplerPanel extends JPanel implements ActionListener {

	//variables
	static JButton btnAdd, btnRemove, btnBack, btnReset, btnPause, btnStart, buttonPlus, buttonMinus;
	static JTextPane txtpnSpeed;
	static JSlider soundSlider;
    static boolean paintCheck;
	
 	static Graphics page ; 
	
	//Creating forms List and the star
	static ArrayList<Form> formsList ;
	static CenterStar theStar;
	static Planet planet1;
	
	//drawing the star
	public void  paintComponent(Graphics page){
			super.paintComponent(page);
			page.setColor(Color.yellow);
			page.fillOval(theStar.getLocationX(), theStar.getLocationY(), theStar.getRadius(), theStar.getRadius());
			page.fillOval(planet1.getLocationX(), planet1.getLocationY(), planet1.getRadius(), planet1.getRadius());
	}
	
	//drawing the Planets
	public void  paintPlanet(Graphics page){
	     paintComponent(page);
		//drawing the Planets
		page.setColor(Color.blue);
		page.fillOval(formsList.get(formsList.size()).getLocationX(), formsList.get(formsList.size()).getLocationY(), formsList.get(formsList.size()).getRadius(), formsList.get(formsList.size()).getRadius());	
	}

   //PANEL
   public KeplerPanel() {
	   
	    //adding the star to the formsList; It will be always be the first member of the formsList
		formsList = new ArrayList<Form>();
		theStar = new CenterStar();
		planet1 = new Planet();
		formsList.add(theStar);
		formsList.add(planet1);

		
		KeplerPanelListeners.timer = new Timer(KeplerPanelListeners.DELAY, new CalculationListener());//Running all methods in the Calculation Listener repeatedly
		
		//arranging the panel size
	    setBounds(0, 0, 810, 482);
	    setLayout(null);
        	    
	    
	    //BUTTONS
        btnAdd = new JButton("ADD");
		btnAdd.setBackground(new Color(102, 153, 255));
		btnAdd.setBounds(724, 11, 86, 31);
		btnAdd.addMouseListener(new KeplerPanelListeners());
		add(btnAdd);
		
		btnRemove = new JButton("REMOVE");
		btnRemove.setBackground(new Color(102, 153, 255));
		btnRemove.setBounds(724, 53, 86, 31);
		btnRemove.addMouseListener(new KeplerPanelListeners());
		add(btnRemove);
		
		btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(153, 153, 255));
		btnBack.setBounds(724, 419, 86, 40);
		//btnBack.addMouseListener(new KeplerPanelListeners());
		add(btnBack);
		
		btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(153, 255, 51));
		btnReset.setBounds(438, 436, 73, 23);
		btnReset.addMouseListener(new KeplerPanelListeners());
		add(btnReset);
		
		btnPause = new JButton("PAUSE");
		btnPause.setBackground(new Color(153, 255, 51));
		btnPause.setBounds(355, 436, 73, 23);
		btnPause.addMouseListener(new KeplerPanelListeners());
		add(btnPause);
		
		btnStart = new JButton("START");
		btnStart.setBackground(new Color(153, 255, 51));
		btnStart.setBounds(272, 436, 73, 23);
		btnStart.addMouseListener(new KeplerPanelListeners());
		add(btnStart);
		
		buttonPlus = new JButton("+");
		buttonPlus.setBackground(new Color(102, 102, 102));
		buttonPlus.setBounds(221, 436, 22, 23);
		buttonPlus.addMouseListener(new KeplerPanelListeners());
		add(buttonPlus);
		
		buttonMinus = new JButton("-");
		buttonMinus.setBackground(new Color(153, 153, 153));
		buttonMinus.setBounds(89, 436, 22, 23);
		buttonMinus.addMouseListener(new KeplerPanelListeners());
		add(buttonMinus);
		
		
		//SOUND SLIDER
		soundSlider = new JSlider();
		soundSlider.setBounds(121, 436, 90, 23);
		soundSlider.addMouseListener(new KeplerPanelListeners());
		add(soundSlider);
		
		
		//TEXT PANE
		txtpnSpeed = new JTextPane();
		txtpnSpeed.setBackground(UIManager.getColor("CheckBox.background"));
		txtpnSpeed.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnSpeed.setText("SPEED");
		txtpnSpeed.setEditable(false);
		txtpnSpeed.setBounds(23, 436, 49, 23);
		add(txtpnSpeed);
		
   }
   
   //TIMER
   public class CalculationListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
				
			//all Kepler calculations are redone at here
			Kepler.gravitationMap(KeplerPanel.formsList);
			Kepler.period(KeplerPanel.formsList);
			Kepler.velocity(KeplerPanel.formsList);
				
		}	
	}	
   
   @Override
   public void actionPerformed(ActionEvent event) {
	   for(int i = 0; i < KeplerPanelListeners.planetCounter; i++ ){
		   if(event.getSource() == DrawPlanet.menuList.get(i))
			   Planet.planetList.get(i).setName(DrawPlanet.planetNameList.get(i).getName());
		   	   Planet.planetList.get(i).setMass(Integer.parseInt(DrawPlanet.planetMassList.get(i).getName()));
		   	   Planet.planetList.get(i).setRadius(Integer.parseInt(DrawPlanet.planetRadiusList.get(i).getName()));
	   }
	  
		   
   }
}