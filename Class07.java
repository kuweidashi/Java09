package Java09;
public class Class07
{
   public static void main(String args[])
   {
    POWER.power(2, 5);
    POWER.power(3, 2);
   }
}
class POWER
{
    public static void power(int x,int n)
    {
        System.out.println(Math.pow(x,n));
    }
}
