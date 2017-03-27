import java.util.Random; 
public class Lotto1{

    public int[] main(){
        int[] rekke = new int [7]; 
        Random rand = new Random();
        int index = 0; 
        while(index < 7){
            Boolean match = false;
            int tall = rand.nextInt(34)+1;

            for(int i = 0; i < 7; i++){
                if(tall == rekke[i]){
                    match = true; 

                }

            }

            if(!match){
                rekke[index] = tall;

            }
            index++;
            if(match){
                index = index -1;
            }

        }
        return rekke;
    }
    
    
}