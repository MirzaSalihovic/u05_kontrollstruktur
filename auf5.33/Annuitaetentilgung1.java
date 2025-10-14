public class Annuitaetentilgung1
{
   public static void main(String[] args)
   {

      int kredit = 1735;
      int zinssatz = 10;
      int laufzeit = 2;
      int restschuld = kredit;

      int annuitaet = 999;

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
