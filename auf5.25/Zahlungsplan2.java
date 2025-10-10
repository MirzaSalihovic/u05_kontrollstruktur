public class Zahlungsplan2
{
   public static void main(String[] args)
   {
      int betrag = 666;
      int rate = 100;
      int zähler = 1;
      
      System.out.println("Zahlungsplan");
      System.out.println("============");

      while(betrag > 100)
      {
         betrag -= 100;
         System.out.println(zähler++ + ". Rate: " + rate + "Euro");
         
         if(betrag < 100)
         {
            System.out.println(zähler++ + ". Rate: " + betrag + "Euro");
         }
      }
   }
}
