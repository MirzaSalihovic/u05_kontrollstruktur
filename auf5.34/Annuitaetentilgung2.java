import java.io.*;

public class Annuitaetentilgung2
{
   public static void main(String[] args) throws Exception
   {

      InputStreamReader   eingabeLeser;
      BufferedReader      gepufferterLeser;
      String              eingabeText = "";

      eingabeLeser      = new InputStreamReader(System.in);
      gepufferterLeser  = new BufferedReader(eingabeLeser);

      System.out.println("Bitte Zinssatz eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int zinssatz = Integer.parseInt(eingabeText); 

      System.out.println("Bitte Kredithöhe eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int kredit = Integer.parseInt(eingabeText);

      System.out.println("Bitte Annuitaet eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int annuitaet = Integer.parseInt(eingabeText);

      System.out.println("Bitte Laufzeit eingeben: ");
      eingabeText = gepufferterLeser.readLine();
      int laufzeit = Integer.parseInt(eingabeText);

      int restschuld = kredit;

      System.out.println("Ratentilgung");
      System.out.println("");
      
      for(int i = 1; i <= laufzeit; i++)
      {
         int zinsen = restschuld * zinssatz / 100;
         int tilgungsbetrag = annuitaet - zinsen;
         int zahlung = zinsen + tilgungsbetrag;

         System.out.println("Jahr: " + i + " Restschuld " + restschuld + " Zinsen " + zinsen + " Tilgung " + tilgungsbetrag + " Zahlung " + zahlung);
         restschuld = restschuld - tilgungsbetrag;
         
         if(restschuld < 900 && restschuld > 0)
         {  
            i++;
            tilgungsbetrag = restschuld;
            zinsen = restschuld * zinssatz / 100;
            zahlung = tilgungsbetrag + zinsen;
            
            System.out.println("Jahr: " + i + " Restschuld " + restschuld + " Zinsen " + zinsen + " Tilgung " + tilgungsbetrag + " Zahlung " + zahlung);
            restschuld = restschuld - tilgungsbetrag;
         }
      }
   }
}
