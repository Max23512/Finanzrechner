import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
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
        test.neurendite();
        System.out.println(test.rendite);

  }
}
