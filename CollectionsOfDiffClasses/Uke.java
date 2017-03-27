
/**
 * Write a description of class Uke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uke
{
    public String weekDay(int ukedag) {
        String dag = "";
        switch(ukedag){
            case 1: dag = "Mandag";
            break;
            case 2: dag = "Tirsdag";
            break;
            case 3: dag = "Onsdag"; 
            break; 
        }
        String svar = dag + " (Den "+ukedag+" . dag i uka"; 
        return svar; 
    }
    
}