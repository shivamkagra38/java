public class PractiseSet9_1
{
    public static void main(String[] args)
    {
     Cylinder one = new Cylinder();
     one.setRadius(55.6);
     one.setHeight(43);
     one.print();
    }
}

class Cylinder
{
   private double radius;
   private double height;
   
   public void setRadius(double a)
   {
    radius = a;
   }
   public void setHeight(double b)
   {
    height = b;
   }
   public void print()
   {
      System.out.println("Height is "+ height +" and Radius is "+ radius); 
   }
}

