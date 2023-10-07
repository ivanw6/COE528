package lab1;

/**
 *
 * @author ivan wang 501086429
 */
public abstract class Passenger {

    //initialize instance variables
    private String name;
    private int age;

    /**
     * Passenger Constructor
     *
     * @param name
     * @param age
     */
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * getter
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * getter
     *
     * @return age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * setter
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @param p
     */
    protected abstract double applyDiscount(double p);
}
