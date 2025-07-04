import java.util.ArrayList;
import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean ende = true;
        ArrayList<Double> startkapital  = new ArrayList<Double>();
        ArrayList<Double> endkapital  = new ArrayList<Double>();
        ArrayList<Anlageklassen> ausgewaehlt = new ArrayList<>();
            
                Scanner scanner = new Scanner(System.in);
                System.out.println("Willkommen zum Investitionsrechner");
                System.out.println("Bitte geben sie ihren Anlagebetrag ein");
                double betrag = scanner.nextInt();
                startkapital.add(betrag);
                System.out.println("Bitte geben sie ihre Laufzeit ein");
                int laufzeit = scanner.nextInt();
            while(ende){    
                System.out.println("Wählen sie die anlageklasse aus");
                System.out.println("1. Aktien");
                System.out.println("2. Anleihen");
                System.out.println("3. Immobilien");
                System.out.println("Zeige die Vorraussage");
                int wahl = scanner.nextInt();
                
            
                switch (wahl) {
                    case 1:
                    ausgewaehlt.add(new Aktien());
                    System.out.println("Aktien hinzugefügt.");
                    break;
                    case 2:
                    ausgewaehlt.add(new Anleihen());
                    System.out.println("Anleihen hinzugefügt.");
                    break;
                    case 3:
                    ausgewaehlt.add(new Immobilien());
                    System.out.println("Immobilien hinzugefügt.");
                    break;
                    case 0:
                    System.out.println(ausgewaehlt);
                    ende = false;
                    break;
                    default:
                    System.out.println("Ungültige Auswahl.");
                }
            }  
        for(int i = 0; i < ausgewaehlt.size(); i++){
            System.out.println(ausgewaehlt.get(i));
            for(int j = 0; j <= laufzeit; j++){
                double test = j;
                endkapital.add(test);
                endkapital.set(j, startkapital.get(j) * ausgewaehlt.get(i).neurendite());
                System.out.println(startkapital.get(j) + " " + ausgewaehlt.get(i).akktuellerendite + " " + endkapital.get(j));
                startkapital.add(endkapital.get(j));
            } 
        }
        scanner.close();
   }
}
