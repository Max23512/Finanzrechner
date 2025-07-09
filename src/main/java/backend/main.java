package src.main.java.backend;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean ende = true;
        ArrayList<Double> startkapital  = new ArrayList<Double>();
        ArrayList<Double> endkapital  = new ArrayList<Double>();
        ArrayList<Double> arrrendite  = new ArrayList<Double>();
        ArrayList<Anlageklassen> ausgewaehlt = new ArrayList<>();
        boolean gueltigeEingabe = false;
        boolean gueltigeEingabe1 = false;
        boolean gueltigeEingabe2 = false;
        int laufzeit = 0;
        int wahl =0;
        double betrag = 0;
       
            
                Scanner scanner = new Scanner(System.in);
                System.out.println("Willkommen zum Investitionsrechner");
            while (!gueltigeEingabe) {
                System.out.println("Bitte geben sie ihren Anlagebetrag ein");
                try{
                    betrag = scanner.nextInt();
                    startkapital.add(betrag);
                    gueltigeEingabe =true;
                    if(betrag<1){
                     gueltigeEingabe =false; 
                     System.out.println("Anlagebetrag zu klein ");  
                    }
                } catch(java.util.InputMismatchException e){
                        System.out.println("eine ganze Zahl ohne zeichen bitte");
                        scanner.nextLine();
                }
            }   
            while (!gueltigeEingabe1) {  
                try{
                    System.out.println("Bitte geben sie ihre Laufzeit ein");
                    laufzeit = scanner.nextInt();
                    gueltigeEingabe1 =true;
                     if(laufzeit<1){
                     gueltigeEingabe1 =false; 
                     System.out.println("laufzeit zu kurz");  
                    }
                } catch(java.util.InputMismatchException e){
                        System.out.println("eine ganze Zahl ohne zeichen bitte");
                        scanner.nextLine();
                }        
             }
            while(ende){   
                 while (!gueltigeEingabe2) { 
                    try{
                        System.out.println("Wählen sie die Anlageklasse aus");
                        System.out.println("1. Aktien");
                        System.out.println("2. Anleihen");
                        System.out.println("3. Immobilien");
                        System.out.println("0. Zeige die Vorraussage");
                        wahl = scanner.nextInt();
                        gueltigeEingabe2 = true;
                            if (wahl < 0 || wahl > 3) {
                                System.out.println("Nur 0, 1, 2 oder 3 sind erlaubt!");
                                gueltigeEingabe2 = false;
                            }
                    } catch(java.util.InputMismatchException e){
                        System.out.println("Nur 1,2,3 oder 0 bitte");
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
            
            Finanzrechner rechner = new Finanzrechner(startkapital, ausgewaehlt,laufzeit);
            rechner.berechne();

             for(int i = 0; i < laufzeit*ausgewaehlt.size(); i++){
            System.out.println(rechner.getstartkapital().get(i) + "     " + rechner.getakktuellerendite().get(i) + "     " + rechner.getendkapital().get(i));
            if(i%laufzeit == 1/laufzeit){
                double endrendite = rechner.getendkapital().get(i) + - betrag;
                System.out.println("Das ist ihr Endkapital" + " " + rechner.getendkapital().get(i));
                System.out.println("Das ist ihre Rendite" + " " + endrendite);
            }
                
        scanner.close();
        }
   }
}
