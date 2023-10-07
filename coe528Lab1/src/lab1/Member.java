package lab1;

/**
 *
 * @author ivan wang 501086429
 */
public class Member extends Passenger {

    //initialize instance variables
    private int yearsOfMembership;

    /**
     * Member Constructor
     * 
     * @param yearsOfMembership
     * @param name
     * @param age
     */
    public Member(int yearsOfMembership, String name, int age) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    /**
     * getter
     *
     * @return years of being a member
     */
    public int getYearsOfMembership() {
        return this.yearsOfMembership;
    }

    /**
     * setter
     *
     * @param yearsOfMembership
     */
    public void setYearsOfMemberShip(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }

    /**
     * applyDiscount Override
     *
     * @param p
     * @return Varying discount amount depending on years of being a member
     */
    @Override
    protected double applyDiscount(double p) {
        if (yearsOfMembership > 5) {
            return p * 0.5;
        } else if (yearsOfMembership > 1 && yearsOfMembership < 5) {
            return p * 0.9;
        } else {
            return p;
        }
    }
}
