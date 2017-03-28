import java.util.*;
/**
 * MeterArchive er et arkiv som tar vare på og behandler objekter fra Meter klassen. 
 * Her opprettes det en ArrayList, samt at det er metoder for å legge til, slette, endre på objektene i listen. 
 * 
 * Created by Thomas Røkke on 13.03.2017.
 */
public class MeterArchive {

    ArrayList<Meter> utstyrListe; //Et array der vi lagrer instrument objektene.

    public MeterArchive(){
        utstyrListe = new ArrayList<Meter>();
    }

    //Legger til et instrument i instrument arrayet 
    public void addMeter(Meter meter){
        utstyrListe.add(meter);
    }

    //Sorterer inneholder i utstyrListe i stigende rekkefølge basert på regnummer
    public void sort(){
        Collections.sort(utstyrListe); 
    }

    //Henter et objekt basert på regnummer gitt i parameter 
    public Meter getMeter(String regnr){

        boolean match = false; //finner metoden en match. 
        System.out.println("\nHenter instrument med regnummer: "+regnr);

        for(Meter m : utstyrListe){
            if(m.regnummer.equals(regnr)){ 

                // System.out.println("Henter instrument med regnummer "+regnr+":"); 

                match = true; 

                // System.out.println(m);
                return m;   
            }

        }
        if(!match){

            System.out.println("Ukjent regnummer!\n"); 
        }

        return null; 
    }
   
    
    //Sletter objekt med matchende regnumer
    public boolean delete(String regnr){
        boolean slettet = false; 
        System.out.println("\nSletter instrument med regnummer: "+regnr);

        for(int i  = 0; i < utstyrListe.size(); i++) {
            if(utstyrListe.get(i).regnummer.equals(regnr)){

                utstyrListe.remove(i); 
                slettet =  true; 
                System.out.println(regnr+" er slettet"); 
            }

        }
        if(!slettet){ //Hvis det ikke ble slettet i for-loopen er regnummer ukjent
            System.out.println("Ukjent regnummer"); 
        }

        return slettet; 
    }

    //Endrer lokasjon på objektet med gitt regnummer til en gitt ny lokasjon. 
    public boolean changeLocation(String regNr, String nyLoc){
        
        System.out.println("\nEndrer lokasjon på instrument med regnummer: "+regNr);  
        
        boolean changed = false; //holder styr på om lokasjonen ble endret 
        
        for(Meter m : utstyrListe) { 
            if (m.regnummer.equals(regNr)){ //hvis m sitt regnummer == parameter regNr                     
                m.setPlasseringskode(nyLoc);
                changed = true;
            }

        }
        
        if(changed){
            System.out.println("Endret!"); 
        }
        else{
            System.out.println("Ukjent regnummer!"); 
        }
        
        return changed;

    }

    public boolean changeStatus(String regNr){
        
        boolean changed = false;
        
        for(Meter m : utstyrListe){
            if( m.regnummer.equals(regNr)){ //hvis m sitt regnummer == parameter regNr   
                
                boolean status = m.getIstand(); //finner nåværende tilstand 
                
                //Hvis status == true blir den nye oppdaterte tilstanden false, og vica versa. 
                if(status){ //               
                    m.setIstand(false); //setter tilstanden til false. 
                }

                else{
                    m.setIstand(true); //setter tilstanden til true. 
                }

                changed = true;
                
                System.out.println("Setter instrument med regnummer "+regNr+" til "+m.tilstand()); 
                System.out.println(m.toString()); 

            }

        }
        if(!changed){ //Hvis den aldri ble edret så må (i følge logikken) det være ukjent regnummer
            System.out.println("Ukjent regnummer"); 
        }
        return changed;
    }

    public void showAll(){

        for(Meter m : utstyrListe){
            System.out.println(m.toString());
        }
    }
    
    /*
    pubic ArrayList<Meter> findOutOfOrder() {
        ArrayList<Meter> res = new ArrayList<Meter>(); 
        for (int i = 0; i < utstyrListe.size(); i++) {
            Meter m = utstyrListe.get(i);
            if(!m.getIstand()) {
                
            }
        }
    }
    */
    
}
