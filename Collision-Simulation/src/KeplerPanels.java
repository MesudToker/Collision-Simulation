import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeplerPanels extends JPanel implements ActionListener {

 // keep a reference for PrevButton call.
 FirstPanel main;
 JButton back;
    KeplerPanel keplerPanel;
 
 public KeplerPanels(final FirstPanel main) {
     keplerPanel = new KeplerPanel();
  this.main = main;
  setBackground(Color.green);

  back = new JButton("BACK");
  back.addActionListener(this);

  setLayout(new BorderLayout());
  JPanel buttonsPanel = new JPanel();
  buttonsPanel.add(back);
  add(buttonsPanel, BorderLayout.SOUTH);
     add(keplerPanel, BorderLayout.CENTER);
 }

 @Override
 public void actionPerformed(ActionEvent e) {
   MainFrame.switchToPanel(main);
 }
}
