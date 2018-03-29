import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPanel extends JPanel implements ActionListener {
  
  JButton kepler;
  JButton collisions;
  JButton help;
  JLabel label;
  
  public FirstPanel() {
   
    setBackground(Color.red);
    
    label = new JLabel( "WHICH TOPIC DO YOU WANT TO STUDY?");
    
    kepler = new JButton("Kepler's Law");
    kepler.addActionListener(this);  
    
    collisions = new JButton("Collisions");
    collisions.addActionListener(this);  
    
    help = new JButton("Help");
    help.addActionListener(this);  
    
    // setLayout(new BorderLayout());
    add(label);
    add(kepler);
    add(collisions);
    add(help);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == kepler)
      MainFrame.switchToPanel(new KeplerPanels(this));
    else if ( e.getSource() == collisions) 
      MainFrame.switchToPanel(new CollisionPanel(this));
    else 
      MainFrame.switchToPanel(new HelpPanel(this));
  }
}
