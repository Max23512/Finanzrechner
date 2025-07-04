import java.util.ArrayList;

public class Finanzrechner {
    private ArrayList<Double> startkapital;
    private ArrayList<Double> endkapital;
    private ArrayList<Double> arrrendite;
    private ArrayList<Anlageklassen> ausgewaehlt;
    private int laufzeit;

    public Finanzrechner(ArrayList<Double> startkapital, ArrayList<Anlageklassen> ausgewaehlt, int laufzeit) {
        this.startkapital = new ArrayList<>(startkapital);
        this.endkapital = new ArrayList<>();
        this.arrrendite = new ArrayList<>();
        this.ausgewaehlt = ausgewaehlt;
        this.laufzeit = laufzeit;
    }

    public void berechne(){

     for(int i = 0; i < ausgewaehlt.size(); i++){
            for(int j = 0; j <= laufzeit; j++){
                double test = j;
                endkapital.add(test);
                endkapital.set(j, startkapital.get(j) * ausgewaehlt.get(i).neurendite());
                startkapital.add(endkapital.get(j));
                arrrendite.add(ausgewaehlt.get(i).akktuellerendite);
            } 
        }
    }
}

