import java.util.Random;

public class Anleihen extends Anlageklassen{
    @Override
    public double  neurendite(){
        Random rand = new Random();
        rendite = rand.nextDouble(0.2);
        rendite -= 0.1;
        akktuellerendite = rendite;
        akktuellerendite *= 100;
        rendite++;
        return rendite;
        }
    }
   
