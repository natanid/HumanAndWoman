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

	@Override
	public String toString() {
		return "Woman [beauty=" + beauty + ", isBeauty()=" + isBeauty() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getGold()=" + getGold() + ", getMoney()=" + getMoney() + ", isLove()=" + isLove()
				+ ", getGender()=" + getGender() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public void work(){
		
		System.out.println("I am a housekeeper");
	}
	
	public void cleanDishes(){
		
		System.out.println("Dishes is clean now");
	}
	
}
