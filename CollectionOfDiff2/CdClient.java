import java.util.ArrayList;
/**
 * Write a description of class CdClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CdClient
{
    public void mainMethod() {
        
        Cd cd1 = new Cd("Nummer: 001", "Sofia", "Julesanger", 2016); 
        Cd cd2 = new Cd("Nummer: 001", "Sofia og Marthe", "Juletrall", 2016);
        Cd cd3 = new Cd("Nummer: 001", "Marthe", "Trall fra dusjen", 2016);
        Cd cd4 = new Cd("Nummer: 001", "Sofia og Marthe", "Fyllatrall", 2016);
        Cd cd5 = new Cd("Nummer: 001", "Sofia", "Moans's", 2016);
        
        ArrayList<Cd> CdList = new ArrayList<Cd>(); 
        
        CdList.add(cd1);
        CdList.add(cd2);
        CdList.add(cd3);
        CdList.add(cd4);
        CdList.add(cd5);
        
        System.out.println(cd1.toString());
        System.out.println(cd2.toString());
        System.out.println(cd3.toString());
        System.out.println(cd4.toString());
        System.out.println(cd5.toString());
    }
}
