import java.util.Random;

public class Aktien extends Anlageklassen{
    @Override
    public double  neurendite(){
       Random rand = new Random();
    rendite = rand.nextDouble(0.4);
    rendite -= 0.2;
    akktuellerendite = rendite;
    rendite++;
    return rendite;
    }
}