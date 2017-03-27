
/**
 * Write a description of class TryktBok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lydbok extends Bok
{
    int antallMinutter; 
    int antallDisker;
    String oppleser; 
    int antallRegistrert; 

    public Lydbok(int ISBN, String forfatter, String tittel, String forlag, int antallInne,
    int antallRegisrert, int antallMinutter, int antallDisker, String oppleser){
        super(ISBN, forfatter, tittel, forlag, antallInne); 
        setAntallRegistrert(antallRegistrert);
        setAntallMinutter(antallMinutter); 
        setAntallDisker(antallDisker); 
        setOppleser(oppleser); 

    }

     public String toString(){
        String retur = super.toString()  + antallRegistrert() + getAntallMinutter() + getAntallDisker() + 
        getOppleser();

        return retur; 
    }

    public void setAntallRegistrert(int antallRegistrert){
        this.antallRegistrert = antallRegistrert; 
    }

    public int antallRegistrert(){
        return antallRegistrert; 
    }

    public void setAntallMinutter(int antallMinutter){
        this.antallMinutter = antallMinutter; 
    }

    public void setAntallDisker(int antallDisker){
        this.antallDisker = antallDisker; 

    }

    public void setOppleser(String oppleser){
        this.oppleser = oppleser; 
    }

    public String getOppleser(){
        return oppleser; 
    }

    public int getAntallMinutter(){
        return antallMinutter; 
    }

    public int getAntallDisker(){
        return antallDisker; 
    }
}
