import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CollisionPanel extends JPanel implements ActionListener {

 FirstPanel main;
 JButton back;
 AllPanel all;

 public CollisionPanel(final FirstPanel main) {
   all = new AllPanel();
  this.main = main;
  setBackground(Color.yellow);

  back = new JButton("BACK");
  back.addActionListener(this);
  
  setLayout(new BorderLayout());
  JPanel buttonsPanel = new JPanel();
  buttonsPanel.add(back);
  add(buttonsPanel, BorderLayout.SOUTH);
  
  add(all, BorderLayout.CENTER);
 }

 @Override
 public void actionPerformed(ActionEvent e) {
   MainFrame.switchToPanel(main);
 }
}
