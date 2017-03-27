
/**
 * Generer 7 tilfeldige tall mellom 1 og 34.
 * @author Thomas Røkke 
 * @version (a version number or a date)
 */
import java.util.Random;

public class Lotto
{

    public Lotto()
    {}

    public void method(int [] randomNumbers, int ant, int rand) { //må spørre veiledere. 
        Random tilfeldig = new Random();
        for(int i = 0; i < ant; i++) {
            int index = 0;
            boolean seen = false;
            int next = tilfeldig.nextInt(rand+1); 
            for (int j = 0 ; j != i ; j++) {
                if (randomNumbers[j] == next) {
                    seen = true;
                    break;

                    
                }
                else if(!seen) {
                    randomNumbers[i] = next;
                }
            }
        }

    }

    public void mainMethod() {
        int dimensjon = 7; //hvor mange tall det skal være 
        int [] etArray = new int[dimensjon]; //lager et int array. 
        method(etArray, dimensjon, 34); // fylle med 10 tilfeldige tall mellom 0 og 100. 

        for(int i = 0; i < etArray.length; i++) {
            System.out.println((i+1)+": "+etArray[i]);
        }
    }

    public void unikMethod(int [] randomNumbers, int ant, int rand) {
        Random tilfeldig = new Random();
        for(int i = 0; i < ant; i++) {
            
            randomNumbers[i] = tilfeldig.nextInt(rand+1); 

        }

    }

    public void mainMethodUnik() {
        int dimensjon = 7; //hvor mange tall det skal være 
        int [] etArray = new int[dimensjon]; //lager et int array. 
        unikMethod(etArray, dimensjon, 34); // fylle med 10 tilfeldige tall mellom 0 og 100. 

        for(int i = 0; i < etArray.length; i++) {

            System.out.println((i+1)+": "+etArray[i]);
        }
    }
}
