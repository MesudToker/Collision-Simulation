import java.awt.Color;
import java.awt.*;

public class Ball 
{
  private double mass;
  public static final int RADIUS = 70;
  private Vector position;
  private Vector velocity;
  private boolean added;
  private Color color;
  public static final int DELAY = 5;
  // private Vector momentum;
  
  public Ball() {
    mass = 0;
    position = new Vector();
    velocity = new Vector();
    added = false;
  }
  
  public double getMass() {
    return mass;
  }
  
  public Vector getPosition() {
    return position;
  }
  
  public Vector getVelocity() {
    return velocity;
  }
  
  public boolean isAdded() {
    return added;
  }
  
  public Color getColor() {
    return this.color;
  }
  
  public void setMass( double mass ) {
    this.mass = mass;
  }
  
  public void setPosition( Vector position ) {
    this.position = position;
  }
  
  public void setVelocity( Vector velocity ) {
    this.velocity = velocity;
  }
  
  public void setVelocity( double x, double y ) {
    this.velocity = new Vector( x, y );
  }
  
  public void setAdded( boolean added ) {
    this.added = added;
  }
  
  public void setColor( Color color ) {
    this.color = color;
  }
  
  public Vector findMomentum() {
      Vector velocityCopy = new Vector(velocity.getX(), velocity.getY());
    return velocityCopy.multiply( mass );
  }
  
  public void move() {
    double delay = DELAY / 1000.0;
    Vector v = new Vector ( getVelocity().getX(), getVelocity().getY() );
    v.multiply( delay );
    position.sum( v );
  }
  
  // Painting
  public void paint( Graphics g ) {
    final double ANGLE_OF_WINGS =  Math.PI * 30 / 180;
    double angle = Math.atan(this.getVelocity().getY() / this.getVelocity().getX());
    // Body of the velocity vector
    double x2 = this.getPosition().getX()+this.getVelocity().getX()/2 ;//+ RADIUS*Math.cos(angle);
    double y2 = this.getPosition().getY()+this.getVelocity().getY() /2; //+ RADIUS*Math.sin(angle);
    double x1 = this.getPosition().getX()  ;
    double y1 = this.getPosition().getY()  ;
    
    g.setColor(this.getColor());
    g.drawLine((int) Math.round(x1), (int) Math.round(y1), (int) Math.round(x2), (int) Math.round(y2));
    
    // wing of the velocity vector
    double wingLength = this.getVelocity().getLength()/10;   
    g.setColor(this.getColor());
    
    if ( this.getVelocity().getX() < 0 ) {
      // right wing
      double x3 = x2 + wingLength * Math.cos( angle + ANGLE_OF_WINGS )*Math.cos(angle)/Math.abs(Math.cos(angle));
      double y3 = y2 + wingLength * Math.sin( angle + ANGLE_OF_WINGS );
      // left wing 
      double x4 = x2 + wingLength * Math.cos( angle - ANGLE_OF_WINGS )*Math.cos(angle)/Math.abs(Math.cos(angle));
      double y4 = y2 + wingLength * Math.sin( angle - ANGLE_OF_WINGS );
      g.drawLine( (int)Math.round(x2), (int)Math.round(y2), (int)Math.round(x4), (int)Math.round(y4) ); 
      g.drawLine( (int)Math.round(x2), (int)Math.round(y2), (int)Math.round(x3), (int)Math.round(y3) );
    }
    else {
      // right wing
      double x3 = x2 - wingLength * Math.cos( angle + ANGLE_OF_WINGS )*Math.cos(angle)/Math.abs(Math.cos(angle));
      double y3 = y2 - wingLength * Math.sin( angle + ANGLE_OF_WINGS );
      // left wing 
      double x4 = x2 - wingLength * Math.cos( angle - ANGLE_OF_WINGS )*Math.cos(angle)/Math.abs(Math.cos(angle));
      double y4 = y2 - wingLength * Math.sin( angle - ANGLE_OF_WINGS ); 
      g.drawLine( (int)Math.round(x2), (int)Math.round(y2), (int)Math.round(x4), (int)Math.round(y4) ); 
      g.drawLine( (int)Math.round(x2), (int)Math.round(y2), (int)Math.round(x3), (int)Math.round(y3) );
    }   
    // this
    g.setColor(this.getColor());
    g.fillOval((int) Math.round(this.getPosition().getX()) - RADIUS, (int) Math.round(this.getPosition().getY()) - RADIUS, 2 * RADIUS, 2 * RADIUS);
  }
}