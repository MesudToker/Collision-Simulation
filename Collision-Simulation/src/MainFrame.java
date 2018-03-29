import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

 // this is the trick.
 // app will have only one Frame, 
 // so make it static and use only this one instance.
 // 
 private static MainFrame instance = new MainFrame();

 public static MainFrame getInstance() {
  return instance;
 }

 public static void switchToPanel(JPanel p) {
  getInstance().setContentPane(p);
  getInstance().validate();
 }

 private MainFrame() {
     setSize( new Dimension( 1600, 1200));
  setTitle("Physics Simulation - MasterMinds");
  setVisible(true);
  setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  addWindowListener(new java.awt.event.WindowAdapter() {
   public void windowClosing(java.awt.event.WindowEvent evt) {
    int userAnswer = JOptionPane.showConfirmDialog(
      MainFrame.getInstance(),
      "Are you sure to close program?", "Confirm exit",
      JOptionPane.YES_NO_OPTION);
    if (userAnswer == JOptionPane.OK_OPTION) {
     System.out.println("Closing program");
     System.exit(0);
    }
   }
  });
 }

 public static void main(String[] args) {
  MainFrame.switchToPanel(new FirstPanel());
 }
}
