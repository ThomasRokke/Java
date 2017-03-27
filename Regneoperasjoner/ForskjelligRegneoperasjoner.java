
/**
 * Write a description of class Terningkast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForskjelligRegneoperasjoner
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Terningkast
     */
    public ForskjelligRegneoperasjoner()
    {
        // initialise instance variables

    }

    /**
     * Ganger 5 med alle tall mellom 10 og 95. 
     */
    public void multipliesOfFive()
    {
        int five = 5;
        int multiplier = 10;
        while((multiplier >= 10) && (multiplier<=95))
        {
            System.out.println(five*multiplier);
            multiplier++;
        }
    }

    /**
     * Legger sammen tall fra 1 til 10.
     */

    public void addValuesFromOneToTen()
    {
        int start = 1;
        int sum = 0;
        while(start<=10)
        {
            sum = sum + start;
            start++;
        }
        System.out.println(sum);
    }

    public void addValuesBetweenDefined(int a, int b)
    {
        int start = a;
        int slutt = b;
        int tall = a;
        int sum = 0;
        while((tall>=start)&&(tall<=slutt))
        {
            sum = sum + tall;
            tall++;
        }
        System.out.println(sum);
    }

    
    
    
    }
