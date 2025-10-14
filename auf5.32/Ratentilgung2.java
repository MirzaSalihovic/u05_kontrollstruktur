import java.io.*;

public class Ratentilgung2
{
   public static void main(String[] args) throws Exception
   {

      InputStreamReader   eingabeLeser;
      BufferedReader      gepufferterLeser;
      String              eingabeText = "";

      eingabeLeser      = new InputStreamReader(System.in);
      gepufferterLeser  = new BufferedReader(eingabeLeser);

      System.out.println("Bitte Kredithöhe eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int kredit = Integer.parseInt(eingabeText); 

      System.out.println("Bitte Zinssatz eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int zinssatz = Integer.parseInt(eingabeText);

      System.out.println("Bitte Laufzeit eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int laufzeit = Integer.parseInt(eingabeText);

      int restschuld = kredit;

      System.out.println("Ratentilgung");
      System.out.println("");
      
      for(int i = 1; i <= laufzeit; i++)
      {
         int tilgungsbetrag = kredit / laufzeit;
         int zinsen = restschuld * zinssatz / 100;
         int zahlung = zinsen + tilgungsbetrag;

         System.out.println("Jahr: " + i + " Restschuld " + restschuld + " Zinsen " + zinsen + " Tilgung " + tilgungsbetrag + " Zahlung " + zahlung);
         restschuld = restschuld - tilgungsbetrag;
      }
   }
}
