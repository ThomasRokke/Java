
/**
 * I dette minispillet gjetter bruker et tall mellom 1 og 100. 
 * 
 * @author Thomas Røkke
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GuessClient
{   
    public void Start()
    {
        boolean startPåNytt = false;
        boolean start = true;
        

        while(startPåNytt || start){
            start = false;
            Scanner input = new Scanner (System.in);
            SecretNumber secretNumber = new SecretNumber();

            System.out.println("Gjett det hemmelige tallet");
            System.out.println("1 - 100");
            boolean ferdig = false;
            int forsøk = 1; //Setter til 1 - siden forsøk 1 = 1 og ikke 0. 

            while(!ferdig) {
                System.out.print("Hva gjetter du? : ");
                int forslag = input.nextInt(); //Brukeren sitt tall "detter" inn i variablen forslag

                if(secretNumber.rightGuess(forslag)){
                    ferdig = true;
                }
                else {
                    String retur = secretNumber.highOrLow(forslag);
                    System.out.println(retur+" prøv igjen");
                    forsøk++;
                }

            }
            System.out.println("Gratulerer, du har gjettet riktig. Du brukte "+forsøk+" forsøk.");
            System.out.println("Vil du forsøke på nytt? Skriv Ja, hvis du vil prøve på nytt, eller Nei hvis du vil avslutte.");
            
            
            String svar = input.next().toLowerCase();
            
   
            if(svar.equals("ja")){
                //if(input.next().toLowerCase().equals("ja")) { fikk ikke til å funke...
                startPåNytt = true;
                
            }
            else if(svar.equals("nei")){
                System.exit(0);
            }
            else if (!svar.equals("ja")||!svar.equals("nei")) {
                System.out.println("svar ikke gjenkjent");
                
            }
        }
    }
}