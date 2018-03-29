
import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JTextPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class DrawPlanet implements MenuListener {
	
	//static compomenents
	static JMenu planetMenu1, planetMenu2, planetMenu3, planetMenu4, planetMenu5, planetMenu6, planetMenu7, planetMenu8, planetMenu9, planetMenu10 ;
	
	static JTextPane planetName1, planetName2, planetName3, planetName4, planetName5, planetName6, planetName7, planetName8, planetName9, planetName10 ;
	static JTextPane planetMass1, planetMass2, planetMass3, planetMass4, planetMass5, planetMass6, planetMass7, planetMass8, planetMass9, planetMass10;
	static JTextPane planetRadius1, planetRadius2, planetRadius3, planetRadius4, planetRadius5, planetRadius6, planetRadius7, planetRadius8, planetRadius9, planetRadius10 ;
	
	//static component's ArrayLists
	static ArrayList<JMenu> menuList;
	static ArrayList<JTextPane> planetNameList;
	static ArrayList<JTextPane> planetMassList;
	static ArrayList<JTextPane> planetRadiusList;
	
	public static void initComonents(){
		
		planetName1 = new JTextPane();
		planetName2 = new JTextPane();
		planetName3 = new JTextPane();
		planetName4 = new JTextPane();
		planetName5 = new JTextPane();
		planetName6 = new JTextPane();
		planetName7 = new JTextPane();
		planetName8 = new JTextPane();
		planetName9 = new JTextPane();
		planetName10 = new JTextPane();
		planetMass1 = new JTextPane();
		planetMass2 = new JTextPane();
		planetMass3 = new JTextPane();
		planetMass4 = new JTextPane();
		planetMass5 = new JTextPane();
		planetMass6 = new JTextPane();
		planetMass7 = new JTextPane();
		planetMass8 = new JTextPane();
		planetMass9 = new JTextPane();
		planetMass10 = new JTextPane();
		planetRadius1 = new JTextPane();
		planetRadius2 = new JTextPane();
		planetRadius3 = new JTextPane();
		planetRadius4 = new JTextPane();
		planetRadius5 = new JTextPane();
		planetRadius6 = new JTextPane();
		planetRadius7 = new JTextPane();
		planetRadius8 = new JTextPane();
		planetRadius9 = new JTextPane();
		planetRadius10 = new JTextPane();
	}
	
	//adding components to their ArrayLists
	public static void addMasses(){
		
		planetMassList.add(planetMass1);
		planetMassList.add(planetMass2);
		planetMassList.add(planetMass3);
		planetMassList.add(planetMass4);
		planetMassList.add(planetMass5);
		planetMassList.add(planetMass6);
		planetMassList.add(planetMass7);
		planetMassList.add(planetMass8);
		planetMassList.add(planetMass9);
		planetMassList.add(planetMass10);
	}
	public static void addNames(){
		planetNameList.add(planetName1);
		planetNameList.add(planetName2);
		planetNameList.add(planetName3);
		planetNameList.add(planetName4);
		planetNameList.add(planetName5);
		planetNameList.add(planetName6);
		planetNameList.add(planetName7);
		planetNameList.add(planetName8);
		planetNameList.add(planetName9);
		planetNameList.add(planetName10);
	}
	public static void addRadiuses(){
		planetRadiusList.add(planetRadius1);
		planetRadiusList.add(planetRadius2);
		planetRadiusList.add(planetRadius3);
		planetRadiusList.add(planetRadius4);
		planetRadiusList.add(planetRadius5);
		planetRadiusList.add(planetRadius6);
		planetRadiusList.add(planetRadius7);
		planetRadiusList.add(planetRadius8);
		planetRadiusList.add(planetRadius9);
		planetRadiusList.add(planetRadius10);
	}
	public static void addMenus(){
		menuList.add(planetMenu1);
		menuList.add(planetMenu2);
		menuList.add(planetMenu3);
		menuList.add(planetMenu4);
		menuList.add(planetMenu5);
		menuList.add(planetMenu6);
		menuList.add(planetMenu7);
		menuList.add(planetMenu8);
		menuList.add(planetMenu9);
		menuList.add(planetMenu10);
	}
	
    public static void createMenu(ArrayList<JMenu> menus, ArrayList<JTextPane> names, ArrayList<JTextPane> masses, ArrayList<JTextPane> radiuses, int index){
    	menus.get(index) ;
    	names.get(index) ;
    	masses.get(index) ;
    	radiuses.get(index) ;
    	
    	//PLANET MENUS
    	menus.get(index).setBounds(61, 108, 107, 22);
        SimuTest.keplerPanel.add(menus.get(index));
    
		menus.get(index).add(names.get(index) );
		names.get(index) .setText("name");
    			
		menus.get(index).add(masses.get(index));
		masses.get(index).setText("mass");

		menus.get(index).add(radiuses.get(index));
		radiuses.get(index).setText("radius");
		
		SimuTest.keplerPanel.add(menus.get(index));
    }
	@Override
	public void menuCanceled(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void menuDeselected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void menuSelected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
