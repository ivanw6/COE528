package lab1;

/**
 *
 * @author ivan wang 501086429
 */
public class NonMember extends Passenger {

    /**
     * NonMember Constructor
     *
     * @param name
     * @param age
     */
    public NonMember(String name, int age) {
        super(name, age);
    }

    /**
     * applyDiscount Override
     *
     * @param p
     * @return a 10% discount if passenger's age is above 60, no discount
     * otherwise
     */
    @Override
    protected double applyDiscount(double p) {
        if (getAge() > 65) {
            return p * 0.9;
        } else {
            return p;
        }
    }
}
