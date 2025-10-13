public class BreakEvenPoint2
{
   public static void main(String[] args)
   {
      int verkaufspreis  = 1500;
      int rohstoffkosten = 600;
      int arbeitskosten  = 400;
      int fixkosten      = 5000;
      int stueckzahl     = 300;
      int breakeven = 0;
      
      System.out.println("Break-Even-Point");
      System.out.println("================");
      System.out.println("Verkaufspreis pro Stueck: " + verkaufspreis);
      System.out.println("Rohstoffkosten pro Stueck: " + rohstoffkosten);
      System.out.println("Arbeitskosten pro Stueck: " + arbeitskosten);
      System.out.println("Fixkosten pro Monat: " + fixkosten);
      System.out.println("Maximale Stueckzahl pro Monat: " + stueckzahl);
      System.out.println(" ");

      for(int i = 1; i<= stueckzahl; i++)
      {
         int variablekosten = (rohstoffkosten + arbeitskosten) * i;
         int erloes = verkaufspreis * i;
         int gesamtkosten = variablekosten + fixkosten;
         int ueberschuss = erloes - gesamtkosten;
         int stueck = rohstoffkosten + arbeitskosten;

         int stueckkosten = fixkosten / i + stueck;
         int stueckueberschuss = verkaufspreis - stueckkosten;
         
         System.out.println("Stueckzahl: " + i + " " + "Stueckkosten: " + stueckkosten + " " + "Ueberschuss pro Stueck: " + stueckueberschuss);
         
         if(stueckueberschuss < 0)
         {
            breakeven = i + 1;
         }
      }  
      System.out.println("Es müssen mindestens " + breakeven + " Stueck produziert werden.");   
   }
}
