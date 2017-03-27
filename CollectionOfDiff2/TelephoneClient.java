
/**
 * Write a description of class TelephoneClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TelephoneClient
{
   
    public void start () {
        Telephones contacts = new Telephones();
        
        contacts.addContact("Thomas", "48172981");
        contacts.addContact("Sofia", "48175381");
        contacts.addContact("Tom", "48164981");
        contacts.addContact("Anders", "48175481");
        contacts.addContact("Geir", "48322981");
        contacts.addContact("Arild", "48172531");
        
        String name = "Geir";
        System.out.println("Finner "+name+ " sitt telefonnummer... ... ...");
        System.out.println(name+ " sitt telefonnummer er: "+ contacts.getPhone(name));
    }
    
   
}
