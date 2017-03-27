
/**
 * Write a description of class TrafficLight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficLight
{
   String status;
   String [] statuses = {"rødt", "rødt og gult", "grønt", "gult"};
   //array er ikke brukt, men kan endre klassen slik at det blir tatt i bruk 
   // gjøre dette ved hjelp av array er en tilleggsoppgave på øvingen. 
   
   
   public TrafficLight(){
       this("rødt");  
    }  
    
   public TrafficLight(String status) {
       setStatus(status);
    }
    
   public void setStatus(String status) {
       this.status = status; 
    }
    
   public String getStatus() {
       return status; 
    }
   
    //Endrer trafikklyset i en fastsatt rekkefølge (basert på nåværende status). 
    
   public void change(){
       switch(status) {
           case "rødt": setStatus ("rødt og gult");
           break; 
           case "rødt og gult": setStatus("grønt"); 
           break; 
           case "grønt": setStatus("gult"); 
           break; 
           case "gult": setStatus("rødt"); 
           break; 
           default: setStatus("rødt"); //Bedre med rødt lys som default enn trafikkulykker ;) 
           
        }
    
    }
    
    
}