package Java09;

class CWin
{
   public static int cnt;     //類別變數,不隨物件不同而改變

   public String color;
   public int width;
   public int height;

   public void count()       //都可以
   {
      cnt=cnt+1;
   }
   public CWin(String str, int w, int h)
   {
      color=str;
      width=w;
      height=h;
   }
   public CWin()
   {
      color="Red";
      width=2;
      height=2;
   }
   public void setZero()
   {
      cnt=0;
   }
   public void setValue(int n)
   {
      cnt=n;
   }
}

public class Class08
{
   public static void main(String args[])
   {
   }
}
