public class Zahlungsplan
{
   public static void main(String[] args)
   {
      int euro = 620;
      int rate = euro / 6;
      
      System.out.println("Zahlungsplan");
      System.out.println("============");
      
      for(int i = 1; i <= 6; i++)
      {
      System.out.println(i + ". Rate: " + rate + "Euro");
      }
   }
}
