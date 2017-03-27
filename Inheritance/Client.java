import java.util.*; 
/**
 * 
 * Created by Thomas on 13.03.2017.
 */
public class Client {

    
    public void mainMethod(){
       
        //oppretter klassen MeterArchive
        MeterArchive arkiv = new MeterArchive();
        
        //Legger inn i arraylisten som holder på Meter objekter, samt deklarerer instrumentene. 
        arkiv.addMeter(new Weight("V1000", true, "R101H1", 0.01, 10.0)); 
        arkiv.addMeter(new Weight("V1001", true, "R101H2", 0.1, 100.0)); 
        arkiv.addMeter(new Weight("V100", true, "R101H3", 1.0, 1000.0)); 
        arkiv.addMeter(new Thermometer("T2000", false, "R101H4", 0.01, 100.0)); 
        arkiv.addMeter(new Thermometer("T2001", false, "R101H5", 1.0, 200.0)); 
        arkiv.addMeter(new Clock("K3000", true, "R101H6", 0.0001));  
        arkiv.addMeter(new Clock("K3001", true, "R101H7", 0.01));
        arkiv.addMeter(new Clock("K3002", false, "R101H8", 1.0));
   
        //Sorterer arrayList basert på regnummer
        arkiv.sort(); 
        
        //Printer ut en oversikt over alle instrumenter
        System.out.println("Oversikt over alle instrumenter: \n");
        arkiv.showAll();

        //Slett objekt med registreringnummer "T2007"
        arkiv.delete("T2007");

        //Endre lokasjonen til objektet som inneholder den gitte regnr til den gitte nye lokasjon.
        arkiv.changeLocation("T2001", "R101H6");

        //Printer ut en ny og oppdatert oversikt over alle instrumenter
        System.out.println("\nOversikt over alle instrumenter nå:");
        arkiv.showAll();
        
        
        //Hent og skriv ut objektet med matchende registreringsnummer
        System.out.println(arkiv.getMeter("T2001")); 
      
        
        //Endrer statusen til objektet med matchende registreringnummer.
        //Var det i orden, så blir det nå i uorden, og omvendt.
        arkiv.changeStatus("T2001"); 
       

    }


}
