package lab4;

/**
 *
 * @author ivan wang 501086429
 */
public abstract class FoodComponent {
    
    //initalize instance variable
    private String name;
    
    //constructor
    public FoodComponent(String name) {
        this.name = name;
    }
    
    //getter
    public String getName() {
        return name;
    }
    
    //abstract methods that will be used in subclasses
    public abstract double getPrice();
    
    public abstract void print(int level);
}
