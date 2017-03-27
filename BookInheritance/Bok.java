
/**
 * Write a description of class Bok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bok
{
    // instance variables - replace the example below with your own
    private int ISBN;
    private String forfatter;
    private String tittel; 
    private String forlag; 
    private int antallInne;
    
   
    

    
    public Bok(int ISBN, String forfatter, String tittel, String forlag, int antallInne)
    {
       setISBN(ISBN); 
       setForfatter(forfatter);
       setTittel(tittel);
       setForlag(forlag);
       setAntallInne(antallInne); 
    }

    public String toString(){
        String retur = getISBN() + getForfatter() + getTittel() + getForlag() + getAntallInne();
        
        return retur; 
    }
    
    
    
    public void setISBN(int ISBN){
        this.ISBN = ISBN; 
    }
    
    public int getISBN(){
        return ISBN; 
    }
    
    public void setForfatter(String forfatter){
        this.forfatter = forfatter; 
    }
    
    public String getForfatter(){
        return forfatter;
    }
    
    public void setTittel (String tittel) {
        this.tittel = tittel; 
    }
    
    public String getTittel(){
        return tittel; 
    }
    
    public void setForlag(String forlag){
        this.forlag = forlag; 
    }
    
    public String getForlag(){
        return forlag; 
    }
    
    public void setAntallInne(int antallInne){
        this.antallInne = antallInne;
    }
    
    public int getAntallInne(){
        return antallInne;
    }
}
