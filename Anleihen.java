import java.util.Random;

public class Anleihen extends Anlageklassen{
    public int neurendite(){
    Random rand = new Random();
    rendite = rand.nextInt(40);
    rendite -= 20;
    return rendite;
    }

}