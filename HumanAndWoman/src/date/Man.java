package date;

public class Man extends Human {

	private int power;
	private Gold gold;
//	private int money;
	private boolean love;
	private String name;
	private Job job;

	public Man(int money, String name) {
		super(name, money);
//		this.money = money;
//		this.name = name;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		
		this.job = job;
	}

	public Gold getGold() {
		return gold;
	}

	public void setGold(Gold gold) {
		
		this.gold = gold;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Man [power=" + power + ", gold=" + gold + ", love=" + love + ", name=" + name + ", job=" + job
				+ ", getJob()=" + getJob() + ", getGold()=" + getGold() + ", getPower()=" + getPower() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getMoney()=" + getMoney() + ", isLove()=" + isLove()
				+ ", getGender()=" + getGender() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void fixing() {

		System.out.println("I've fixed an item");
	}
	
	public void addManMoney(int money, int payment){
		money = money + job.getPayment();
		}
}
