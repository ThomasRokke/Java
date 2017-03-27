public class TrafikklysMain{
    
    public void mainMethod(){
       
        Trafikklys lyskryss = new Trafikklys(); 
        
        for(int i = 0; i < 7; i++){
            System.out.println("Trafikklyset viser "+lyskryss.getStatus()); 
            System.out.println("lyskrysset skifter status...");
            lyskryss.change(); 
            
        }
        
        
    }
    
}