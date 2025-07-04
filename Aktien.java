import java.util.Random;

public class Aktien extends Anlageklassen{
    @Override
    public int neurendite(){
       Random rand = new Random();
    rendite = rand.nextInt(40);
    rendite -= 20;
    return rendite;
    }
}