public class PracticeSet9_4
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.printParameters();
        
        Rectangle r2 = new Rectangle(4,5); //New Object
        r2.printParameters();        
    }
}

class Rectangle
{
   private int length;
   private int breath;
   public Rectangle()
   {
       length = 0;
       breath = 0;
   }
   public Rectangle(int l , int b)
   {
       length = l;
       breath = b;
   }
   public void printParameters()
   {
       System.out.println("**********");
       System.out.println("Length = " + length );
       System.out.println("Breath = " + breath );
       System.out.println("**********");
   }
   }

