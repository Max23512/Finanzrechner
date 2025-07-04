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

public int neurendite(){
    Random rand = new Random();
    rendite = rand.nextInt(40);
    rendite -= 1;
    return rendite;
    }

}