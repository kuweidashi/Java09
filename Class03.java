package Java09;

class Caaa                              //一個package只能有一個公眾類型的class
{   
   private int value;                   //不會,無其他類別使用value變數

   public Caaa()
   {
      value=10;
      System.out.println("value="+value);
   }
   public Caaa(int i)
   {
      value=i;
      System.out.println("value="+value);
   }
}

public class Class03
{
   public static void main(String args[])
   {
      Caaa obj1 = new Caaa();             //第一個
      Caaa obj2 = new Caaa(12);           //第二個
   }
}
