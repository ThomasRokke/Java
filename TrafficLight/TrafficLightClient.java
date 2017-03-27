
/**
 * Write a description of class TrafficLightClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficLightClient
{
    public void method(){

        TrafficLight lights = new TrafficLight(); 

        for(int i = 0; i < 5; i++) {
            System.out.println("Trafikklyset viser "+lights.getStatus());
            lights.change(); 
            System.out.println("Trafikklyset skifter status.."); 

        }
    }
}
