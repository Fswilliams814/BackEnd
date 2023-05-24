package gitdemo;

public class HowManyHamburgers {
	
	//instance variables go outside the main method
	private static final double HAMBURGER_COST = 13.95;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		//create a new object here so that you can call on it outside the main method
		new HowManyHamburgers().run();
		
		
		

	}
//this is now an instance method
	private void run() {
		// TODO Auto-generated method stub
		buyHamburgersWithCashOnHand(40.00);
		
	}
private void buyHamburgersWithCashOnHand(double cashOnHand) {
	// TODO Auto-generated method stub
	System.out.println(cashOnHand);
	int numHamburgers = (int)(cashOnHand/HAMBURGER_COST);
	System.out.printf("I bout %d hamburgers with $%.2f.%n", numHamburgers, cashOnHand);
	
}

}
