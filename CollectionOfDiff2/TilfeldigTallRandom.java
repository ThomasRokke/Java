
/**
 * Write a description of class Tilfeldig here.
 * Den genrerer et tilfeldig tall basert på (statistisk)random. Om jeg skal bruke det ifm kryptografi
 * vil jeg heller anbefale SecureRandom
 * 
 * @author Thomas Røkke  
 * @version 24.10.2016
 */
import java.util.Random;

public class TilfeldigTallRandom {
    private int tall;
    private Random random;

    public TilfeldigTallRandom() {
        random = new Random();
        tall = 0;
    } 

    public void randomNummer(){
        //tall = random.nextInt();
        System.out.print(random.nextInt());
    }

    public void flereRandomNummer(int antall) {
        //antall er hvor mange ganger loopen skal gjenta seg.
        for(int i = 0; i < antall; i++){
            System.out.println(random.nextInt(100));
        }
    }

    public void randomMellom1og6 () {
        System.out.println(random.nextInt(6) +1);
    }

    public void random1TilInkParameter(int max) {
        //for(int i = 0; i < 50; i++){ Kun for testing purpose.
        System.out.println(random.nextInt(max) +1);
        //}
    }

    public void randomMinMax(int min, int max) {

        System.out.println(random.nextInt(max) +min);
    }

}
