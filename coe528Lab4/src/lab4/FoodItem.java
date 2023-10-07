package lab4;

/**
 *
 * @author ivan wang 501086429
 */
public class FoodItem extends FoodComponent {
    
    //initialize instance variable
    private double price;
    
    //constructor
    public FoodItem(String name, double price)
    {
        super(name);
        this.price = price;
    }
    
    //getter for price
    public double getPrice()
    {
        return price;
    }
    
    public void print(int level)
    {
        for(int i = 0; i < level; i++)
        {
            System.out.print("\t");
        }
        System.out.println("FoodItem: " + getName() + ", " + getPrice());
    }
}
