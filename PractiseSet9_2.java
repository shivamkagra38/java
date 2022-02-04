public class PractiseSet9_2
{
    public static void main(String[] args)
    {
     Cylinder one = new Cylinder();
     one.setRadius(5);
     one.setHeight(6);
     one.print();
     System.out.println("*******************");
     one.calculateArea();
     one.calculateVolume();
    }
}

class Cylinder
{
   private double radius;
   private double height;
   private double area;
   private double volume;
   private double pie = 3.14;
   public void setRadius(double a)
   {
    radius = a;
   }
   public void setHeight(double b)
   {
    height = b;
   }
   public void calculateArea()
   {
       area = 2*pie*radius*height + 2*pie*radius*radius;
       System.out.println("Surface Area Is "+ area);
   }
   public void calculateVolume()
   {
       volume = pie*radius*radius*height;
       System.out.println("Volume Is " + volume);
   }
   public void print()
   {
      System.out.println("Height Is "+ height +" and Radius Is "+ radius); 
   }
}


