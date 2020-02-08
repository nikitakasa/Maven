package maven;
public class Toffees extends Chocolates{
	public Toffees(int Chocolate_content, int weight, int price, String chocolate_name,String type) {

		super(Chocolate_content, weight, price, chocolate_name, type);

	}

	@Override
	void description() {
		System.out.println("Gems");
	}
}