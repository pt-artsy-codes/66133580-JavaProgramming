
public class TheCircleClass { 

   private double radius;
   private String color;
   
   public TheCircleClass() { 
      radius = 1.0;
      color = "red";
   }
   
   
   public CTheCircleClass(double r) { 
      radius = r;
      color = "red";
   }
   
   public double getRadius() {
     return radius; 
   }
   
   public double getArea() {
      return radius*radius*Math.PI;
   }
}