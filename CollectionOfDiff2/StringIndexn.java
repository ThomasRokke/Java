
/**
 * Write a description of class StringIndexn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class StringIndexn
{
    public void stringIndex() {
        String emne = "PGR100";
        System.out.println(emne);

        char ch = emne.charAt(2);
        //2 er hvilken char som ligger på plass 2. hei = h0 e1 i2. dvs index 2 = i. 
        System.out.println(ch);

    }    
    public void method(int [] randomNumbers, int ant, int rand) {
        Random tilfeldig = new Random();
        for(int i = 0; i < ant; i++) {
            randomNumbers[i] = tilfeldig.nextInt(rand); 
        }

    }
}