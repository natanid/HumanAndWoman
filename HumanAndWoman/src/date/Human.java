package date;

public class Human {

	private String name;
	private int age;
	private Gold gold;
	private int money;
	private boolean love;
	private Gender gender;
	
	
	public Human(String name, int money) {

		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gold getGold() {
		return gold;
	}

	public void setGold(Gold gold) {
		this.gold = gold;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean isLove() {
		return love;
	}

	public void setLove(boolean love) {
		this.love = love;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void work() {
		System.out.println("I work");
	}

	public void cook() {
		System.out.println("I cook");
	}
	
	public void eat() {
		System.out.println("I eat");
	}

	public void singSong() {
		System.out.println("I Sing a Song");
	}
}
