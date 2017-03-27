import java.util.Random;
public class Lotto {

    public void lotto(){
        int [] tall = new int [7];

        Random rand = new Random(); 
        
        int index = 0; 

        while(index < 7) {
            boolean match = false;

            int nummer = rand.nextInt(34)+1; 
            for(int j = 0; j < 7; j++) {
                if(tall[j] == nummer){
                    match = true;

                }
            }
            if(!match){
                tall[index] = nummer;
            }
            index++;
            if(match){
                index = index - 1; 
            }
        }
    }

}