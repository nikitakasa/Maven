package maven;

public class DryFruitSweets extends Sweets{

	public DryFruitSweets(int sugar_content, int weight, int price, String sweetname, String type) {
		super(sugar_content, weight, price, sweetname, type);
	}

	@Override
	void description() {
		System.out.println("Dry fruit sweets");
		
	}
	
}