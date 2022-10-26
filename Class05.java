package Java09;
public class Class05
{
   public static void main(String args[])
   {
   }
}
class CCount
{   
    static int cnt=0;
    public void count()
    {
        cnt += 1;
    }
    public CCount()
    {
        count();
    }
    public void setZero()
    {
        cnt = 0;
    }
    public void setValue(int n)
    {
        cnt = n;
    }
}
