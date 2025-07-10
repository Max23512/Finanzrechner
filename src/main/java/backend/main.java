package backend;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean ende = true;
        ArrayList<Double> startkapital = new ArrayList<>();
        ArrayList<Double> endkapital = new ArrayList<>();
        ArrayList<Double> arrrendite = new ArrayList<>();
        ArrayList<Anlageklassen> ausgewaehlt = new ArrayList<>();
        boolean gueltigeEingabe = false;
        boolean gueltigeEingabe1 = false;
        boolean gueltigeEingabe2 = false;
        int laufzeit = 0;
        int wahl = 0;
        double betrag = 0;

        System.out.println("Willkommen zum Investitionsrechner");

        while (!gueltigeEingabe) {
            System.out.println("Bitte geben sie ihren Anlagebetrag ein");
            try {
                betrag = scanner.nextInt();
                if (betrag < 1) {
                    System.out.println("Anlagebetrag zu klein");
                    continue;
                }
                startkapital.add(betrag);
                gueltigeEingabe = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Eine ganze Zahl ohne Zeichen bitte");
                scanner.nextLine();
            }
        }

        while (!gueltigeEingabe1) {
            System.out.println("Bitte geben sie ihre Laufzeit ein");
            try {
                laufzeit = scanner.nextInt();
                if (laufzeit < 1) {
                    System.out.println("Laufzeit zu kurz");
                    continue;
                }
                gueltigeEingabe1 = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Eine ganze Zahl ohne Zeichen bitte");
                scanner.nextLine();
            }
        }

        while (ende) {
            while (!gueltigeEingabe2) {
                System.out.println("Wählen sie die Anlageklasse aus");
                System.out.println("1. Aktien");
                System.out.println("2. Anleihen");
                System.out.println("3. Immobilien");
                System.out.println("0. Zeige die Vorraussage");
                try {
                    wahl = scanner.nextInt();
                    if (wahl < 0 || wahl > 3) {
                        System.out.println("Nur 0, 1, 2 oder 3 sind erlaubt!");
                    } else {
                        gueltigeEingabe2 = true;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Nur 1, 2, 3 oder 0 bitte");
                    scanner.nextLine();
                }
            }

            switch (wahl) {
                case 1:
                    ausgewaehlt.add(new Aktien());
                    System.out.println("Aktien hinzugefügt.");
                    gueltigeEingabe2 = false;
                    break;
                case 2:
                    ausgewaehlt.add(new Anleihen());
                    System.out.println("Anleihen hinzugefügt.");
                    gueltigeEingabe2 = false;
                    break;
                case 3:
                    ausgewaehlt.add(new Immobilien());
                    System.out.println("Immobilien hinzugefügt.");
                    gueltigeEingabe2 = false;
                    break;
                case 0:
                    ende = false;
                    gueltigeEingabe2 = true;
                    break;
                default:
                    System.out.println("Ungültige Auswahl.");
            }
        }

        Finanzrechner rechner = new Finanzrechner(startkapital, ausgewaehlt, laufzeit);
        rechner.berechne();

        for (int i = 0; i < laufzeit * ausgewaehlt.size(); i++) {
            System.out.println(rechner.getstartkapital().get(i) + "     " +
                               rechner.getakktuellerendite().get(i) + "     " +
                               rechner.getendkapital().get(i));
            // Hier stimmt deine if-Bedingung vermutlich nicht, ich lass sie erstmal raus oder du passt sie an.
        }

        System.out.println("Das ist ihr Endkapital: " + rechner.getendkapital().get(rechner.getendkapital().size() - 1));
        // Scanner schließen am Ende
        scanner.close();
    }
}