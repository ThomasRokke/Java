
/**
 * Write a description of class GroceryItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroceryItem
{
    // instance variables - replace the example below with your own
    private String name;
    private int pricePerUnit;
    private int quantity;
    private int cost;

    /**
     * Constructor for objects of class GroceryItem
     */
    public GroceryItem()
    {
        // initialise instance variables
        name = name;
        pricePerUnit = pricePerUnit;
        quantity = quantity;
        cost = cost;
    }

    public GroceryItem(String Name, int Price, int Quantity)
    {
        name = Name;
        pricePerUnit = Price;
        quantity = Quantity;
    }

    public void setName(String Name)
    {
        name = Name; 
    }

    public void setPricePerUnit(int Price)
    {
        pricePerUnit = Price;
    }

    public int getCost()
    {
        cost = quantity * pricePerUnit;
        return cost;

    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return pricePerUnit;
    }

}
