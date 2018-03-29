import java.util.ArrayList;

public class Collisions 
{
  //probably delete this
  public static final double collisionRadiusRatio = 0.05;
  ArrayList<Ball> addedBalls;
  
  public Collisions( Ball b1, Ball b2, Ball b3, Ball b4, Ball b5) {
    addedBalls = new ArrayList<Ball>();
    if(b1.isAdded())
      addedBalls.add(b1);
    if(b2.isAdded())
      addedBalls.add(b2);
    if(b3.isAdded())
      addedBalls.add(b3);
    if(b4.isAdded())
      addedBalls.add(b4);
    if(b5.isAdded())
      addedBalls.add(b5);
  }
  
  public void setAddedBalls(ArrayList<Ball> addedBalls){
    this.addedBalls = addedBalls;
  }
  
  public ArrayList<Ball> getAddedBalls(){
    return addedBalls;
  }
  
  public static void moveAddedBalls(ArrayList<Ball> addedBalls){
    for ( int i = 0; i < addedBalls.size(); i++ )
      addedBalls.get(i).move();
  }

  
  public static void calculateAllVelocities(ArrayList<Ball> addedBalls){

    //Wall Collisions
    for( int i = 0 ; i < addedBalls.size() ; i++)
    {
      // Size of the frame is not decided yet so width and height are not decided.
      if( addedBalls.get(i).getPosition().getX() > CollisionArea.width - Ball.RADIUS) {
        addedBalls.get(i).setVelocity( -addedBalls.get(i).getVelocity().getX(), addedBalls.get(i).getVelocity().getY() );
        addedBalls.get(i).getPosition().setVector( (double)CollisionArea.width - Ball.RADIUS, addedBalls.get(i).getPosition().getY());
      }
      else if( addedBalls.get(i).getPosition().getX() < 0 + Ball.RADIUS      )  {
        addedBalls.get(i).setVelocity( -addedBalls.get(i).getVelocity().getX(), addedBalls.get(i).getVelocity().getY() );
        addedBalls.get(i).getPosition().setVector( (double)Ball.RADIUS, addedBalls.get(i).getPosition().getY());
      }
      if( addedBalls.get(i).getPosition().getY() > CollisionArea.height - Ball.RADIUS ) {
        addedBalls.get(i).setVelocity(addedBalls.get(i).getVelocity().getX(), -addedBalls.get(i).getVelocity().getY() );
        addedBalls.get(i).getPosition().setVector(addedBalls.get(i).getPosition().getX(), (double)CollisionArea.height - Ball.RADIUS );
      }
      else if( addedBalls.get(i).getPosition().getY() < 0 + Ball.RADIUS     ) {
        addedBalls.get(i).setVelocity(addedBalls.get(i).getVelocity().getX(), -addedBalls.get(i).getVelocity().getY() );
        addedBalls.get(i).getPosition().setVector(addedBalls.get(i).getPosition().getX(), (double)Ball.RADIUS );
      }
    }     
    
    //Collisions
    for(int i=0 ; i < addedBalls.size() ; i++)
    {
      for(int j=i+1 ; j<addedBalls.size() ; j++)
      {
        double distance = addedBalls.get(i).getPosition().distance( addedBalls.get(j).getPosition() );
        
        if( distance < (2*Ball.RADIUS) ) //(2*Ball.RADIUS)*(1-collisionRadiusRatio) < distance && distance < (2*Ball.RADIUS)//*(1+collisionRadiusRatio))                            
        {
          Vector impulse = new Vector();
          impulse = Vector.subtract( addedBalls.get(i).getPosition(), addedBalls.get(j).getPosition() );
          double v1x, v2x;
          double v1y, v2y;
          double m1 = addedBalls.get(i).getMass();
          double m2 = addedBalls.get(j).getMass();
          v1x = addedBalls.get(i).getVelocity().getX();
          v1y = addedBalls.get(i).getVelocity().getY();
          v2x = addedBalls.get(j).getVelocity().getX();
          v2y = addedBalls.get(j).getVelocity().getY();
          
          double factor =  2*m1*m2 / (m1+m2);
          factor = factor*( (v2x-v1x) * impulse.getX() + (v2y-v1y) * impulse.getY() );
          factor = factor / impulse.getLength();
          factor = factor / impulse.getLength();
          impulse.multiply(factor);
          
          addedBalls.get(i).setVelocity( Vector.sum( addedBalls.get(i).getVelocity(), Vector.multiply(impulse, 1/m1)));
          addedBalls.get(j).setVelocity( Vector.subtract( addedBalls.get(j).getVelocity(),Vector.multiply(impulse,1/m2)));
        }
      }     
    }
  }
  
  public static void reverseAll(ArrayList<Ball> addedBalls) {
    for ( int i = 0; i < addedBalls.size(); i++ ) {
      addedBalls.get(i).getVelocity().reverse();
    }
  }
}
