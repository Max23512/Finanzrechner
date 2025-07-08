import java.util.ArrayList;

public class Finanzrechner {
    private ArrayList<Double> startkapital;
    private ArrayList<Double> endkapital;
    private ArrayList<Double> arrrendite;
    private ArrayList<Anlageklassen> ausgewaehlt;
    private int laufzeit;
    private double  fstartkapital;
    

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
                    //System.out.println();
                    endkapital.add(startkapital.get(startkapital.size()-1) * ausgewaehlt.get(i).neurendite());
                    //stem.out.println();
                    startkapital.add(endkapital.get(endkapital.size()-1));
                    //System.out.println();
                    arrrendite.add(ausgewaehlt.get(i).akktuellerendite);

                    if(startkapital.size()%laufzeit == 1){
                        startkapital.remove(startkapital.size()-1);
                        startkapital.add(startkapital.get(0));
                        System.out.println(ausgewaehlt.get(i));
                    } 
                }
            }
        }
        
        
                
     public ArrayList<Double> getendkapital() {
        return endkapital;
    }
         public ArrayList<Double> getstartkapital() {
        return startkapital;
    }
             public ArrayList<Double> getakktuellerendite() {
        return arrrendite;
    }
}

