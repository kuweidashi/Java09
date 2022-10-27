package Java09;

public class Class02
{
   public static void main(String args[])
   {
   }
}
class CRectangle
{   
   int width;
   int height;
   public CRectangle(int w,int h) {
      width=w;
      height=h;
   }
   public CRectangle(){
      this(10, 8);
      System.out.println("constructor called");      
   }
}
