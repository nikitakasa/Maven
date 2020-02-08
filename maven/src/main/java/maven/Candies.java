package maven;

public class Candies extends Chocolates{
	public Candies(int Chocolate_content, int weight, int price, String chocolate_name,String  type) {
        super(Chocolate_content, weight, price, chocolate_name, type);
       
    }

    @Override
    void description() {
   System.out.println("Candies");
    }
}
