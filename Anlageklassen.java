import java.util.Random;

public class Anlageklassen{
double rendite;
int nutzerwert;


public double getrendite(){
    return rendite;
}



public int getnutzerwert(){
    return nutzerwert;
}

public double  neurendite(){
    Random rand = new Random();
    rendite = rand.nextInt(40);
    rendite -= 1;
    return rendite;
    }

}