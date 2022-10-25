package Java09;
class Namecard
{   
    private String name;
    private String address;
    private Phone data;
    public Namecard(String a,String b,String c,String d)
    {
        name=a;
        address=b;
        data = new Phone(c, d);
    }
    class Phone
    {
        private String company;
        private String cell;
        public Phone(String s1,String s2)
        {
            company=s1;
            cell=s2;
        }
    }
    public void show()
    {
        System.out.println("好友姓名:"+name);
        System.out.println("聯絡地址:"+address);
        System.out.println("公司號碼:"+data.company);
        System.out.println("手機號碼:"+data.cell);
    }
}
public class Class17
{
   public static void main(String args[])
    {
        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
        first.show();
    }
}
