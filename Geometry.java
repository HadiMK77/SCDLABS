package Lab10t2;

class Geometry {
 public static final double PI = 3.14159;
 private double radius; 
 public Geometry(double radius) {
     this.radius = radius;
 }

 public double getRadius() {
     return radius;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 public double calculateCircumference() {
     return 2 * PI * radius;
 }

 public double calculateAreaOfCircle() {
     return PI * radius * radius;
 }

 public double calculateVolumeOfSphere() {
     return (4.0 / 3.0) * PI * Math.pow(radius, 3);
 }

 public double calculateSurfaceAreaOfSphere() {
     return 4 * PI * radius * radius;
 }
}
