/**
 * @(#)SimuTest.java
 *
 *
 * @author Berfu Deniz Kara
 * @version 1.00 2015/5/11
 * 
 * This class holds the main frame and the main method. 
 */

import java.util.ArrayList;

import javax.swing.*;


@SuppressWarnings("serial")
public class SimuTest extends JFrame {
	
	//static variables
	static JPanel contentPane; 
	static KeplerPanel keplerPanel;
	static SimuTest frame;
	
	
	
	//MAIN METHOD
	public static void main(String[] args){ 
		
		//Creating Frame
		frame = new SimuTest();
		frame.setVisible(true);
	
		//static component's ArrayLists
		DrawPlanet.menuList = new ArrayList<JMenu>(); 
		DrawPlanet.planetNameList = new ArrayList<JTextPane>(); 
		DrawPlanet.planetMassList = new ArrayList<JTextPane>(); 
		DrawPlanet.planetRadiusList = new ArrayList<JTextPane>(); 
		
		DrawPlanet.initComonents();		
		DrawPlanet.addMenus();	
		DrawPlanet.addNames();
		DrawPlanet.addMasses();
		DrawPlanet.addRadiuses();
			
	}
	
	//MAIN FRAME
	public SimuTest() {
		
		setTitle("Kepler Simulation");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 501);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		keplerPanel = new KeplerPanel();
		keplerPanel.setBounds(0, 0, 829, 478);
		keplerPanel.setVisible(true);
				
		setContentPane(contentPane);		
		getContentPane().add(keplerPanel);
	}	 
}
