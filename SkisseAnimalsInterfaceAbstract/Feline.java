
/**
 * Abstract class Feline - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Feline extends Animal
{
    // instance variables - replace the example below with your own
    private String race; 
    
    public Feline(int regNummer, boolean free, String race) {
        super(regNummer, free); 
        setRace(race); 
    }
    
    public String getRace(){
        return race;
    }
    
    public void setRace(String race) {
        this.race = race; 
    }
}
