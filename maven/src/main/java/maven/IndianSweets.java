package maven;

public class IndianSweets extends Sweets
{

    public IndianSweets(int sugar_content, int weight, int price, String sweetname, String type) {
		super(sugar_content, weight, price, sweetname, type);
	}
    @Override
    void description() {
        System.out.println("I am Gulab jamun i like to be in Brown colour");
    }

}