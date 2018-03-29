
/**
 * @(#)Form.java
 *
 *
 * @author Berfu Deniz Kara
 * @version 1.00 2015/5/11
 * 
 * The Form class is the parent class for the Planet and CenterStar class. It creates the main object "Form" 
 */

public class Form {
 
 //variables
 String name;
 double mass;
 int radius;
 double distanceToStar;
 double vectorX;
 double vectorY;
 int locationX;
 int locationY;
 double velocity;
 
 //epmty constructor
 public Form(){
  name =  "mystery";
  mass = 5.0;
  radius = 40;
  distanceToStar = 350 - locationX;;
  vectorX = 0.0;
  vectorY = 0.0;
  locationX = 100;
  locationY = 190;
  velocity = Math.sqrt(Math.pow(vectorX, 2) + Math.pow(vectorY, 2));
 }
 
 //constructor
 public Form(String name, double mass, int radius, double vectorX, double vectorY, int locationX, int locationY){
  this.name = name;
  this.mass = mass;
  this.radius = radius;
  distanceToStar = 350 - locationX;
  this.vectorX = vectorX;
  this.vectorY = vectorY;
  this.locationX = locationX;
  this.locationY = locationY;
  velocity = Math.sqrt(Math.pow(vectorX, 2) + Math.pow(vectorY, 2));
 }
 
 //a setter method to set both vectors in the same time
 public void setVectorXY(double vectorX, double vectorY){
  this.vectorX = vectorX;
  this.vectorY = vectorY;
 }

  
 //SETTER AND GETTER METHODS
 
 public void setName(String name) {
  this.name = name;
 }
 
 public String getName() {
  return name;
 }
 
 public double getMass() {
  return mass; 
 }

 public void setMass(double mass) {
  this.mass = mass;
 }

 public int getRadius() {
  return radius;
 }

 public void setRadius(int radius) {
  this.radius = radius;
 }

 public double getDistanceToStar() {
  return distanceToStar;
 }
 
 public void setDistanceToStar(int distanceToStar) {
  this.distanceToStar = distanceToStar;
 }

 public double getVectorX() {
  return vectorX;
 }

 public void setVectorX(double vectorX) {
  this.vectorX = vectorX;
 }
 
 public double getVectorY() {
  return vectorY;
 }

 public void setVectorY(double vectorY) {
  this.vectorY = vectorY;
 }

 public int getLocationX() {
  return locationX;
 }

 public void setLocationX(int locationX) {
  this.locationX = locationX;
 }

 public int getLocationY() {
  return locationY;
 }

 public void setLocationY(int locationY) {
  this.locationY = locationY;
 }
 
 public double getVelocity() {
  return velocity; 
 }

 public void setVelocity(double velocity) {
  this.velocity = velocity;
 }
 
 //extra set method for velocity by getting both vectors 
 public void setVelocity(double vectorX, double vectorY) {
  this.velocity =  Math.sqrt(Math.pow(vectorX, 2) + Math.pow(vectorY, 2));
 }
}
