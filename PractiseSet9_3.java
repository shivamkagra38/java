public class PractiseSet9_3
{
    public static void main(String[] args)
    {
     Cylinder one = new Cylinder(4.5,5);
     System.out.println("Radius Is " + one.getRadius());
     System.out.println("Height Is " + one.getHeight());
    }
}

class Cylinder
{
   private double radius;
   private double height;
   private double area;
   private double volume;
   private double pie = 3.14;
   
   public Cylinder(double r , double h)
   {
       radius=r;
       height=h;
   }
   public double getRadius()
   {
       return radius;
   }
   public double getHeight()
   {
       return height;
   }
}
