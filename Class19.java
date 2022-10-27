package Java09;

class Data
{
   private String name;
   private Test score;
   public Data(String a, int b, int c)
   {
      name=a;
      score = new Test(b, c);
      score.show();
   }
   class Test
   {
      private int english,math;
      public Test(int eng,int m) {
			english=eng;
			math=m;
		}
      public double avg() {    //計算
			return (english + math)/2.0;
		}
		public void show() {     //列印
			System.out.println("學生姓名:"+name+"\n英文成績:"+english+"\n數學成績:"+math+"\n平均成績:"+avg());
		}
   } 
}
public class Class19
{
   public static void main(String args[])
   {
      new Data("Annie", 85, 92);
   }
}
