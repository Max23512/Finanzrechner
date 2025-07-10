package backend;
import java.util.Random;

public class Anlageklassen{
double rendite;
double akktuellerendite;

public double  neurendite(){
    Random rand = new Random();
    rendite = rand.nextInt(40);
    rendite -= 1;
    akktuellerendite = rendite;
    akktuellerendite *= 100;
    rendite++;
    return rendite;
    }
}