import java.util.Random;

public class Anlageklassen{
double rendite;
int nutzerwert;
double akktuellerendite;


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


public double  akktuellerendite(){
    Random rand = new Random();
    rendite = rand.nextInt(40);
    rendite -= 1;
    return rendite;
    }

}