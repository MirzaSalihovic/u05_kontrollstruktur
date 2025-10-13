public class BreakEvenPoint
{
   public static void main(String[] args)
   {

      int verkaufspreis  = 1500;
      int rohstoffkosten = 600;
      int arbeitskosten  = 400;
      int fixkosten      = 5000;
      int stueckzahl     = 15;
      
      System.out.println("Break-Even-Point");
      System.out.println("================");
      System.out.println("Verkaufspreis pro Stueck: " + verkaufspreis);
      System.out.println("Rohstoffkosten pro Stueck: " + rohstoffkosten);
      System.out.println("Arbeitskosten pro Stueck: " + arbeitskosten);
      System.out.println("Fixkosten pro Monat: " + fixkosten);
      System.out.println("Maximale Stueckzahl pro Monat: " + stueckzahl);

      for(int i = 1; i<= stueckzahl; i++)
      {
         int variablekosten = (rohstoffkosten + arbeitskosten) * i;
         int erloes = verkaufspreis * i;
         int gesamtkosten = variablekosten + fixkosten;
         int ueberschuss = erloes - gesamtkosten;
         
         System.out.println("Stueckzahl: " + i + " " + "Gesamtkosten: " + gesamtkosten + " " + "Erloes: " + erloes + " " + "Ueberschuss: " + ueberschuss);
      }
   }
}
