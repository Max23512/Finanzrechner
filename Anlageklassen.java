import java.util.Random;

public class Anlageklassen{
int rendite;
int nutzerwert;


public int getrendite(){
    return rendite;
}



public int getnutzerwert(){
    return nutzerwert;
}

public int neurendite(int bereich, int minusbereich){
    Random rand = new Random();
    rendite = rand.nextInt(bereich);
    rendite -= minusbereich;
    return rendite;
    }

}