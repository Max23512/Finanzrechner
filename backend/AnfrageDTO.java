package backend;

import java.util.Map;

public class AnfrageDTO {
    private double betrag;
    private int laufzeit;
    private Map<String, Boolean> anlageklassen;

    public double getBetrag() { return betrag; }
    public void setBetrag(double betrag) { this.betrag = betrag; }

    public int getLaufzeit() { return laufzeit; }
    public void setLaufzeit(int laufzeit) { this.laufzeit = laufzeit; }

    public Map<String, Boolean> getAnlageklassen() { return anlageklassen; }
    public void setAnlageklassen(Map<String, Boolean> anlageklassen) { this.anlageklassen = anlageklassen; }
}
