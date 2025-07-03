import java.util.ArrayList;
import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> startkapital  = new ArrayList<String>();
        ArrayList<String> endkapital  = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen zum Investitionsrechner");
        System.out.println("Bitte geben sie ihren Anlagebetrag ein");
        int betrag = scanner.nextInt();
        System.out.println("Bitte geben sie ihre Laufzeit ein");
        int laufzeit = scanner.nextInt();
        System.out.println("Wählen sie die anlageklasse aus");
        System.out.println("1. Aktien");
        System.out.println("2. Anleihen");
        System.out.println("3. Immobilien");
        int wahl = scanner.nextInt();
        Aktien test = new Aktien();
        
            System.out.print("Wählen Sie eine Anlageklasse (0 zum Beenden): ");
        switch (wahl) {
            case 1:
            System.out.println("Aktien hinzugefügt.");
            break;
            case 2:
            
            System.out.println("Anleihen hinzugefügt.");
            break;
            case 3:
            
            System.out.println("Immobilien hinzugefügt.");
            break;
            case 0:
            
            break;
            default:
            System.out.println("Ungültige Auswahl.");
        }   
   }
}

// Liste erstellen zum speichern von start/endkapital
