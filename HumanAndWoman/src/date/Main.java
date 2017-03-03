package date;

public class Main {

	public static void main(String[] args) {
		
		Job job = new Job("superman", 12000);
				 
		Human man = new Man(300, "aaa");
		
		Gold gold = new Gold(5000);
		
		man.setMoney(man.getMoney() + job.getPayment());
		man.setMoney(man.getMoney()- gold.getPrice());
		System.out.println(man.getMoney());
		
		Human woman = new Woman("bbb", 200, true);
		
		
	}
	
}
