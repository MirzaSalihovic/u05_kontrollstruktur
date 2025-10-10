import java.io.*;

public class Zahlungsplan3
{
   public static void main(String[] args) throws Exception
   {

      InputStreamReader   eingabeLeser;
      BufferedReader      gepufferterLeser;
      String              eingabeText = "";
      int                 eingabeZahl = 0;
      int                 eingabeRate = 0;

      eingabeLeser      = new InputStreamReader(System.in);
      gepufferterLeser  = new BufferedReader(eingabeLeser);

      System.out.println("Bitte Kreditbetrag eingeben: ");

      eingabeText = gepufferterLeser.readLine();
      int betrag = Integer.parseInt(eingabeText); 

      System.out.println("Bitte Kreditrate eingeben: ");

      eingabeText = gepufferterLeser.readLine();
      int rate = Integer.parseInt(eingabeText);

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
