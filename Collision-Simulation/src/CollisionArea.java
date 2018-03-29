import javax.swing.*;
import java.awt.*;

public class CollisionArea extends JPanel
{
  public static int height = 720;
  public static int width = 1280;
  public boolean isDrag = false;
  public Ball b1;
  public Ball b2;
  public Ball b3 ;
  public Ball b4 ;
  public Ball b5 ;
  public Collisions collision;
  
  public CollisionArea() {
    setPreferredSize( new Dimension( width, height));
    setBackground(Color.WHITE);
    
    b1 = new Ball();
    b1.setColor( Color.BLUE );
    b1.setMass(100.0);
    b1.setPosition(new Vector ( 500, 500));
    b1.setVelocity( new Vector ( 3, 200));
    b1.setAdded(true);
    
    b2 = new Ball();
    b2.setColor( Color.MAGENTA );
    b2.setMass(20.0);
    b2.setPosition( new Vector ( 600, 70));
    b2.setVelocity( new Vector ( -300, -200));
    b2.setAdded(true);
    
    b3 = new Ball();
    b3.setColor( Color.RED );
    b3.setMass(200.0);
    b3.setPosition(new Vector ( 500, 200));
    b3.setVelocity( new Vector ( -100, 200));
    b3.setAdded(true);
    
    b4 = new Ball();
    b4.setColor( Color.YELLOW );
    b4.setMass(25.0);
    b4.setPosition(new Vector ( 100, 200));
    b4.setVelocity( new Vector ( 100, 500));
    b4.setAdded(true);
    
    b5 = new Ball();
    b5.setColor( Color.CYAN );
    b5.setMass(2.0);
    b5.setPosition(new Vector ( 100, 500));
    b5.setVelocity( new Vector ( 100, 100));
    b5.setAdded(true);
    
    collision = new Collisions( b1, b2, b3, b4, b5 );
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);

    for(int i=0 ; i<collision.getAddedBalls().size() ; i++)
    {
      collision.getAddedBalls().get(i).paint(g);
    }

  }
}
