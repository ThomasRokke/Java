
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    private GroceryItem objekt1;
    private GroceryItem objekt2;
    private String displayString;


   
   /**
    * @param - Name1  - Navnet til første produkt
    * @param - Price1 - Prisen til første produktet 
    * @param - Name2  - Navnet til først produktet
    * @param - Price2 - Prisen til første produktet
    */
    public void clientMethod(String Name1, int Price1, int Quantity1, String Name2, int Price2, int Quantity2)
    {
    
        objekt1 = new GroceryItem(Name1,Price1,Quantity1);
        objekt2 = new GroceryItem(Name2,Price2,Quantity2);
        
        
        System.out.println("Varens navn: "+objekt1.getName());
        System.out.println("Varens pris: "+objekt1.getPrice());
        System.out.println("Antall: "+objekt1.getQuantity());
        System.out.println("Varens navn: "+objekt2.getName());
        System.out.println("Varens pris: "+objekt2.getPrice());
        System.out.println("Antall: "+objekt2.getQuantity());
        
        int sum;
        sum = (objekt1.getPrice()*objekt1.getQuantity()) + (objekt2.getPrice()*objekt2.getQuantity());
        
        System.out.println("Varene: "+objekt1.getName()+" og "+objekt2.getName()+" koster tilsammen: "+sum+" kroner");
     }
    
   
    
}
