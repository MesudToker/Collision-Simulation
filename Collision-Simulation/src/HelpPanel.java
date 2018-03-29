import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class HelpPanel extends JPanel implements ActionListener {
  FirstPanel main;
  JButton back;
  JLabel label;
  JLabel image;
  
  public HelpPanel(final FirstPanel main) {
    this.main = main;
    setBackground(Color.red);
    setLayout(new BorderLayout());
    
    label = new JLabel( new ImageIcon( "proof2.gif"));
    image = new JLabel( new ImageIcon( "image.gif"));
    
    back = new JButton("BACK TO MAIN");
    back.addActionListener(this);  
    
    JPanel imagePanel = new JPanel();
    imagePanel.add(label);
    imagePanel.add(image);
    add(imagePanel, BorderLayout.NORTH);
    
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.add(back);
    add(buttonsPanel, BorderLayout.SOUTH);
//    JScrollPane pane = new JScrollPane();
//    pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//    pane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//      //(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//    //setContentPane(pane);
//    add(pane);
   
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    MainFrame.switchToPanel(main);
  }
}