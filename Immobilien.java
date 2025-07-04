import java.util.Random;

public class Immobilien extends Anlageklassen{
    public int neuerendite(){
        Random rand = new Random();
        rendite = rand.nextInt(40);
        rendite -= 20;
        return rendite;
        }
    }

