/**
 * Denne vekten er en subklasse av Meter.
 * Vi definerer hva som er den minste og største vekten den kan måle. 
 * 
 * Created by Thomas on 13.03.2017.
 */
public class Weight extends Meter{

    double minWeigth; //minimum vekt
    double maxWeigth; //maks vekt

    public Weight(String regnummer, Boolean istand, String plasseringskode,
                  double minWeigth, double maxWeigth) {
        super(regnummer, istand, plasseringskode);
        setMinWeigth(minWeigth);
        setMaxWeigth(maxWeigth);

    }

    //En ikke-parametrisk konstruktør
    public Weight(){
        super("",true, "");
        setMinWeigth(0);
        setMaxWeigth(0);
    }

    public void setMinWeigth(double minWeigth){
        this.minWeigth = minWeigth;
    }

    public double getMinWeigth(){
        return minWeigth;
    }

    public void setMaxWeigth(double maxWeigth){
        this.maxWeigth = maxWeigth;
    }

    public double getMaxWeigth(){
        return maxWeigth;
    }

    @Override
    public String toString(){
        String retur = "Vekt\n"+"(Måleintervall: "+ getMinWeigth()+ " - "+ getMaxWeigth()+
                ")\n"+ super.toString(); //henter inn superklassen sin toString metode 
        return retur;
    }
}
