
/**
 * Write a description of class Die here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random; 
public class Die
{
    // instance variables - replace the example below with your own
    private int verdi;
    private Random random;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        verdi = 0; 
        random = new Random(); //oppretter en ny random kalsse. random er vår variable for det.             
    }
    
    public void roll() {
        verdi = random.nextInt(6) + 1; 
        //Gir verdier mellom 1 og 6. 
    }
    
    public int getValue() {
       return verdi;
    }
  
    public void randomAF() {
        int tilfeldig;
        tilfeldig = random.nextInt();
        System.out.print(tilfeldig);
    }
}
