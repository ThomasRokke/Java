
/**
 * Write a description of class Telephones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;
public class Telephones
{
    private HashMap<String, String> hasjkart;


    public Telephones() {
        hasjkart = new HashMap<String, String>();
    }
    
    public void addContact ( String name, String phone) {
        hasjkart.put(name, phone); //put legger til name og phone i "map". 
    }
    
    public String getPhone(String name) {
        return hasjkart.get(name);
    }
    
    public void removeContact (String name) {
        hasjkart.remove(name);
    }
}
