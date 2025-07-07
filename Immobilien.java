import java.util.Random;

public class Immobilien extends Anlageklassen{
    @Override
    public double  neurendite(){
        Random rand = new Random();
        rendite = rand.nextDouble() * 0.01;
        rendite -= 0.001;
        akktuellerendite = rendite;
        akktuellerendite *= 100;
        rendite++;
        return rendite;
        }
    }

