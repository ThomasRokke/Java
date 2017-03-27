/**
 * Dette er en klokke. Den er en subklasse av Meter 
 * Den holder rede på minste tidsintervall klokken kan måle. 
 * Created by Thomas on 13.03.2017.
 */
public class Clock extends Meter {

    double tidsintervall; //minste tidsintervall klokken kan måle (i sekunder). 

    public Clock (String regnummer, Boolean istand,
                       String plasseringskode, double tidsintervall) {
        super(regnummer, istand, plasseringskode);
        setTidsintervall(tidsintervall);
    }
    
    public Clock(){
        super("default", false, "default"); 
        setTidsintervall(1); 
    }

    public void setTidsintervall(double tidsintervall){
        this.tidsintervall = tidsintervall;
    }

    public double getTidsintervall(){
        return tidsintervall;
    }

    @Override
    public String toString(){
        String retur = "Klokke\n"+"(Tidsintervall: "+ getTidsintervall()+ "s) \n" + super.toString();
        return retur;
    }
}
