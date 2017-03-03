package date;

public class Woman extends Human{

	private boolean beauty;
	
	public Woman(String name, int money, boolean beauty) {
		super(name, money);
		this.beauty = beauty;
	}

	public boolean isBeauty() {
		return beauty;
	}

	public void setBeauty(boolean beauty) {
		this.beauty = beauty;
	}

	public void work(){
		
		System.out.println("I am a housekeeper");
	}
	
	public void cleanDishes(){
		
		System.out.println("Dishes is clean now");
	}
	
}
