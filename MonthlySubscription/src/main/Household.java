package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Household {
	
	List<Item> itemsList;
	
	public Household(){
		itemsList = new ArrayList<Item>();
	}
	
	public void addItems(Item... item) {
		itemsList.addAll(Arrays.asList(item));
	}
	
	public List<Item> getItem(){
		return itemsList;
	}
	
	public List<Double> getPrice(Item item) {
		List<Double> weekdayPrice = new ArrayList<>();
		if(item instanceof Newspaper) {
				if(item.getItemBrand().equals("TOI")) {
					Collections.addAll(weekdayPrice, 3.0, 3.0, 3.0, 3.0, 3.0, 5.0, 6.0);
		         } 
		        else if(item.getItemBrand().equals("Hindu")) {
			        Collections.addAll(weekdayPrice, 2.5, 2.5, 2.5, 2.5, 2.5, 4.0, 4.0);
		         }
		        else if(item.getItemBrand().equals("ET")) {
			        Collections.addAll(weekdayPrice, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 10.0);
		        }
		        else if(item.getItemBrand().equals("BM")) {
		 	        Collections.addAll(weekdayPrice, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5);
		        }
		       else if(item.getItemBrand().equals("HT")) {
			       Collections.addAll(weekdayPrice, 2.0, 2.0, 2.0, 2.0, 2.0, 4.0, 4.0);
		        }
		    }
		
		return weekdayPrice;
		
	}
	
	public List<Double> getSubscriptionCost() {
		List<Double> costList = new ArrayList<>();
 		Calendar calendar = Calendar.getInstance();
		for(Item item : getItem()) {
			double itemPrice = 0;
		    if(item.getItemFrequency().equals("Daily")) {
		    	for(Double d : getPrice(item)) {
		        	 itemPrice = itemPrice + d;
			     }
					 itemPrice =  itemPrice * 4;
     		}
		   	else if (item.getItemFrequency().equals("Weekly")){
				int day = calendar.get(Calendar.DAY_OF_WEEK);
				itemPrice = getPrice(item).get(day) * 4;
     		}
				costList.add(itemPrice);
	    }
		return costList;
	}

}
