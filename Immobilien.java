import java.util.Random;

public class Immobilien extends Anlageklassen{
    @Override
    public double  neurendite(){
        Random rand = new Random();
        rendite = rand.nextDouble() * 0.1;
        rendite -= 0.05;
        akktuellerendite = rendite;
        akktuellerendite *= 100;
        rendite++;
        return rendite;
        }
    }

