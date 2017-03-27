import java.util.ArrayList; 
public class CdClient{
    
    public CdClient() {
    }
    
    public void mainMethod(){
        
       Cd cd1 = new Cd("001", "Kurt Nilsen", "Julesang", 2001); 
       Cd cd2 = new Cd("002", "Hans Zimmer", "Filmmusikk", 1993);
       Cd cd3 = new Cd("003", "Øystein Sunde", "Visetrall", 2005); 
       
       ArrayList<Cd> Liste = new ArrayList<>(); 
       
       Liste.add(cd1);
       Liste.add(cd2);
       Liste.add(cd3); 
       
       for(Cd arr : Liste) {
           System.out.println(arr);
        }
       
        
    }
    
    
    
}