    import java.util.Random;
public class MoodSwings{

    String humør; 
    int tilstand;
    public MoodSwings(){
        this("Sint",0);
    }

    public MoodSwings(String humør, int tilstand){
        this.humør = humør;
        this.tilstand = tilstand;
    }

    public void mainMethod(){
        System.out.println("Now it's the time of the month again... :("); 
        System.out.println("As you know the mood can be quite unstable"); 
        System.out.println("This is a recording of the crazy mood swings you might expect"); 
        
        print();  
 
        
        
        
    }
    
    public void print(){
        System.out.println("Girlfriend mood be like...");
        for(int i = 0; i < 10; i++){
            random();
            mood();
            System.out.println((i+1) +" "+humør);
        }
        System.out.println("And that's just in one hour.."); 
    }

    public void random(){
        Random rand = new Random();
        int random = 0;
        random = rand.nextInt(10)+1;
        tilstand = random;
    }

    public void mood(){
        switch(tilstand){
            case 1: humør = "Sint!";
            break;
            case 2: humør = "Trist";
            break;
            case 3: humør = "Content";
            break;
            case 4: humør = "Glad"; 
            break;
            case 5: humør = "Stressa";
            break;
            case 6: humør = "Lattermild";
            break;
            case 7: humør = "Irritert"; 
            break;
            case 8: humør = "Rastløs";
            break; 
            case 9: humør = "Avslappet";
            break;
            case 10: humør = "Slem"; 
            break; 

        }
    }

}