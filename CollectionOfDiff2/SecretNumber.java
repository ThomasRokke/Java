
/**
 * Et lite spill.
 * Her skal bruker gjette hvilket nummer maskinen tenker på.
 * Skal kunne telle opp hvor mange ganger vi bruker på å gjette riktig.
 * @author Thomas Røkke
 * @version 24.10.2016
 */
import java.util.Random;
public class SecretNumber
{
    // instance variables - replace the example below with your own
    private int number;
    private Random random; //Random er klassen Random. mens random er variabel.

    public SecretNumber(){
        random = new Random();
        newStart();
    }

    public boolean rightGuess(int number){
        if (this.number == number) {
            return true;
        }
        return false; //Hvis det ikke stemmer, får det return false.
    }

    public String highOrLow(int number) { //this.number == klassens varaibel
        if(number > this.number) {
         return "For høyt ";   
        }
        return "For lavt "; //hvis number er under det hemmelige tallet, så returnerer den for lavt.
        //En else setning hadde vært redundant. 

    }

    public void newStart() {
        number = random.nextInt(100) + 1;    
    }
}
