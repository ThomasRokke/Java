/**
 * Denne klassen er instrumentet termometer. Den er en subklasse av Meter. 
 * Den holder rede på høyeste og laveste temperatur den kan måle 
 * Created by Thomas on 13.03.2017.
 */
public class Thermometer extends Meter{

    double minCelcius; //laveste temperatur den kan måle
    double maxCelcius; //høyeste temperatur den kan måle; 

    public Thermometer(String regnummer, Boolean istand, String plasseringskode,
                       double minCelcius, double maxCelcius) {
        super(regnummer, istand, plasseringskode);
        setMinCelcius(minCelcius);
        setMaxCelcius(maxCelcius);
    }

    //En ikke-parametrisk konstruktør
    public Thermometer(){
        super("default", false, "default"); 
        setMinCelcius(0); 
        setMaxCelcius(0); 
    }

    public void setMinCelcius(double minCelcius){
        this.minCelcius = minCelcius;
    }

    public double getMinCelcius() {
        return minCelcius;
    }

    public void setMaxCelcius(double maxCelcius){
        this.maxCelcius = maxCelcius;
    }

    public double getMaxCelcius(){
        return maxCelcius;
    }

    @Override
    public String toString(){
        String retur = "\nTermometer\n"+"(Min- og maks temp: "+ getMinCelcius()+ " - "+ getMaxCelcius()+
                ")\n"+ super.toString(); //henter inn superklassen til toString metode 
        return retur;
    }


}
