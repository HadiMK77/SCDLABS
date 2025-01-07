package Lab10t2;

public class GeometryMain {
 public static void main(String[] args) {
     Geometry geometry = new Geometry(5.0);
     System.out.println("Circumference of the circle: " + geometry.calculateCircumference());
     System.out.println("Area of the circle: " + geometry.calculateAreaOfCircle());
     System.out.println("Volume of the sphere: " + geometry.calculateVolumeOfSphere());
     System.out.println("Surface area of the sphere: " + geometry.calculateSurfaceAreaOfSphere());
     geometry.setRadius(10.0);
     System.out.println("\nAfter changing the radius:");
     System.out.println("Circumference of the circle: " + geometry.calculateCircumference());
     System.out.println("Area of the circle: " + geometry.calculateAreaOfCircle());
     System.out.println("Volume of the sphere: " + geometry.calculateVolumeOfSphere());
     System.out.println("Surface area of the sphere: " + geometry.calculateSurfaceAreaOfSphere());
 }
}






