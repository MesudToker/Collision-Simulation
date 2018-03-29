/* 
 * Vector Class can work with both Cartesian coordinate 
 system and Polar coordinate systems in two dimensions because 
 it has r and teta variables as well as x and y.  
 */

public class Vector {
    private double x;  //projection of vector on x
    private double y;  //projection of vector on y
    private double length;  //length of vector

    //Constructors
    public Vector() {
        this.x=0;
        this.y=0;
        this.length=0;
      }

    public Vector( double x, double y){
        this.x = x;
        this.y = y;
        length = Math.sqrt( x*x+y*y );
      }

    //Gets
    public double getX(){
        return x;
      }

    public double getY(){
        return y;
      }

    public double getLength(){
        return length;
      }
    //Set
    public void setVector( double x, double y ){
        this.x = x;
        this.y = y;
        this.length = Math.sqrt(x*x+y*y);
      }

    public Vector sum(Vector v){ //adds a vector to current Vector
        this.setVector( v.getX()+this.getX(), v.getY()+this.getY());
        return this;
      }

    public static Vector sum( Vector a, Vector b ) {
        Vector s = new Vector();
        s.setVector( a.getX() + b.getX(), a.getY() + b.getY() );
        return s;
      }

    public Vector subtract(Vector v){ //subtract a vector to current Vector
        this.setVector( -v.getX()+this.getX(), -v.getY()+this.getY() );
        return this;
      }

    public static Vector subtract( Vector a, Vector b ) {
        Vector s = new Vector();
        s.setVector( a.getX() - b.getX(), a.getY() - b.getY() );
        return s;
      }

    public double distance(Vector v){
        return Math.sqrt( ((this.getX()-v.getX())*(this.getX()-v.getX()))+((getY()-v.getY())*(getY()-v.getY())) );
      }

    public Vector multiply(double coefficient){ //multiply the vector with a number
        this.setVector(this.getX()*coefficient, this.getY()*coefficient);
        return this;
      }

    public static Vector multiply( Vector v, double c ) {
        Vector s = new Vector();
        s.setVector( v.getX()*c, v.getY()*c );
        return s;
      }

    public Vector reverse(){
        this.multiply(-1);
        return this;
      }
}