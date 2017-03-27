
/**
 * Abstract class Animal - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Animal
{
    // instance variables - replace the example below with your own
    private int regNummer;
    private boolean free; 
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public Animal(int regNummer, boolean free){
        setRegNummer(regNummer); 
        setFree(free); 
        
    }
    
    public void setRegNummer(int regNummer) {
        this.regNummer = regNummer; 
    }
    
    public void setFree(boolean free) {
        this.free = free; 
    }
    
    public int getRegNummer(){
        return regNummer; 
    }
    
    public boolean getFree(){
        return free; 
    }
}
