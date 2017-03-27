import java.util.ArrayList; 
/**
 * Write a description of class BokLager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BokLager
{
    private ArrayList<Bok> bokListe;
    
    public BokLager(){
        bokListe = new ArrayList<Bok>(); 
    }
    
    public void addBok(Bok bok){
        bokListe.add(bok); 
    }
    
    public void printAll(){
        for(Bok b : bokListe){
            System.out.println(b); 
        }
    }
    
    public void printForfattere(){
        for(Bok b: bokListe){
            System.out.println(b.getForfatter()); 
        }
    }
}
