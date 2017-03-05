package date;

public class Gold {

	private int price;
	private String goldType;

	public Gold(int price) {
		this.price = price;
	}

	public Gold(String goldType) {
		this.goldType = goldType;
	}

	public Gold(int price, String goldType) {
		this.price = price;
		this.goldType = goldType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getGoldType() {
		return goldType;
	}

	public void setGoldType(String goldType) {
		this.goldType = goldType;
	}

	@Override
	public String toString() {
		return "Gold [price=" + price + "]";
	}

	
}
