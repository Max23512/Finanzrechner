import java.util.Random;

public class Anleihen extends Anlageklassen{
    @Override
    public double  neurendite(){
        Random rand = new Random();
        rendite = rand.nextDouble(0.02);
        rendite -= 0.01;
        rendite++;
        return rendite;
        }
    }
   
