import java.util.*; 
/**
 * Klassen meter. Meter er superklassen til de forskjellige måleinstrumentene
 * i naturfagsundervisningen. 
 * 
 * Denne klassen er en abstract klasse, siden det aldri skal opprettes objekter av 
 * superklassen. 
 * 
 * 
 * 
 * Created by Thomas on 13.03.2017.
 */
public abstract class Meter implements Comparable <Meter> {

    String regnummer; //et unikt registreringsnummer
    Boolean istand; //om instrumentet er i orden
    String plasseringskode; 


    public Meter(){
        this("ukjent", false, "ukjent");  
    }
    
    public Meter(String regnummer, Boolean istand, String plasseringskode){
        setregnummer(regnummer);
        setIstand(istand);
        setPlasseringskode(plasseringskode);
    }

    
    public int compareTo(Meter meter){
     int result = getRegnummer() .
        compareTo(meter.getRegnummer());
     return result;
    }
    
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Meter)) return false;
        if(obj == this) return true;
        Meter meter = (Meter) obj;
        return meter.regnummer.equals(regnummer);
    }

    public void setregnummer(String regnummer){
        this.regnummer = regnummer;
    }

    public String getRegnummer(){
        return regnummer;
    }

    public void setIstand(boolean istand) {
        this.istand = istand;
    }

    public boolean getIstand() {
        return istand;
    }
    public String tilstand(){
        String tilstand = "";
        if(getIstand() == true){
            tilstand = "i orden";
        }
        else{
            tilstand = "i uorden";
        }
        return tilstand;
    }

    public void setPlasseringskode(String plasseringskode) {
        this.plasseringskode = plasseringskode;
    }

    public String getPlasseringskode(){
        return plasseringskode;
    }

    public String toString(){
        String retur = "Regnummer: "+getRegnummer() +
                "\nPlassering: "+getPlasseringskode() +
                "\nStatus: "+tilstand()+"\n"; 
        return retur;
    }



}
