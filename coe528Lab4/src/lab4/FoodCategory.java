package lab4;
import java.util.*;
/**
 *
 * @author ivan wang 501086429
 */
public class FoodCategory extends FoodComponent {
    
    //initialize instance variable
    private ArrayList<FoodComponent> foodComp = new ArrayList<>();
    
    //constructor
    public FoodCategory(String name)
    {
        super(name);
    }
    
    //method to add food component to category
    public void add(FoodComponent comp)
    {
        foodComp.add(comp);
    }
    
    //method to remove food component from category
    public void remove(FoodComponent comp)
    {
        foodComp.remove(comp);
    }
    
    public double getPrice()
    {
        double price = 0;
        for (FoodComponent comp : foodComp)
        {
            price += comp.getPrice();
        }
        return price;
    }
    
    public void print(int level)
    {
        for(int i = 0; i < level; i++)
        {
            System.out.print("\t");
        }
        System.out.println("FoodCategory" + " (" + getName() + ", " + getPrice() + ") " + "contains:");
        for(FoodComponent comp : foodComp)
        {
            comp.print(level + 1);
        }
    }
}
