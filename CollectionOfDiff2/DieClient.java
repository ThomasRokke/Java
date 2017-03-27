
/**
 * Write a description of class DieClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DieClient
{
    public void start(){ 
        Die terning = new Die();
        Scanner input = new Scanner(System.in);

        System.out.print("Hvor mange ganger skal terningen kastes?");
        int antall = input.nextInt();
        int resultat;
        System.out.println("Skal nå kaste " + antall + " ganger:");
        for(int i=0; i<antall; i++) {
            
            System.out.print("Kast "+(i+1)+": "); //Tar pluss 1 på i, grunnet 0 er 1ste kast i loop.
            terning.roll();
            System.out.println(terning.getValue());
        }
        
    }
}
