import java.util.Random;

public class Immobilien extends Anlageklassen{
    public double  neuerendite(){
        Random rand = new Random();
        rendite = rand.nextDouble() * 0.01;
        rendite -= 0.001;
        rendite++;
        return rendite;
        }
    }

