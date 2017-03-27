
/**
 * Write a description of class TryktBok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryktBok extends Bok
{
    int antallSider; 
    int antallRegistrert;
    public TryktBok(int ISBN, String forfatter, String tittel, String forlag, int antallInne, 
    int antallSider, int antallRegistrert){
        super(ISBN, forfatter, tittel, forlag, antallInne); 
        setAntallSider(antallSider); 
        setAntallRegistrert(antallRegistrert); 

    }

    public String toString(){
        String retur = super.toString() + getAntallSider() + getAntallRegistrert(); 

        return retur; 
    }

    public void setAntallSider(int antallSider){
        this.antallSider = antallSider; 
    }

    public void setAntallRegistrert(int antallRegistrert){
        this.antallRegistrert = antallRegistrert; 

    }

    public int getAntallSider(){
        return antallSider; 
    }

    public int getAntallRegistrert(){
        return antallRegistrert; 
    }
}
