package test;

import org.testng.annotations.Test;


import main.*;

public class MonthlySubscriptionTest {
	
	Household household;
	Category category;
	Item item1;
	Item item2;
	Item item3;
	
	
	@Test
	public void add() {
		household = new Household();
		item1 = new Newspaper("Newspaper", "ET", "Daily");
		item2 = new Newspaper("Newspaper", "ET", "Weekly");
		item3 = new Milk("Milk", "Amul", "Daily");
		
		item1.addCategory(new Category("Books"));
		item2.addCategory(new Category("Books"));
		
		household.addItems(item1, item2, item3);
		
	    System.out.println(household.getItem());
	    System.out.println(household.getSubscriptionCost());
	}

}
