package date;

public class Main {

	public static void main(String[] args) {

		Job job = new Job("superman", 12000);

		Human man = new Man(300, "anton");

		Gold gold = new Gold(5000);

		man.setMoney(man.getMoney() + job.getPayment());
		man.setMoney(man.getMoney() - gold.getPrice());
		System.out.println(man.getMoney());
		man.setGold(gold);
		System.out.println("man's gold = " + man.getGold());

		Woman woman = new Woman("marichka", 200, true);
		if (woman.isBeauty()) {
			woman.setGold(man.getGold());
			man.setGold(null);
		}
		System.out.println("man's gold = " + man.getGold());
		System.out.println("woman's gold = " + woman.getGold());
	}

}
