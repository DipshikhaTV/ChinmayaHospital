package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Item {
	
	private String itemName;
	private String itemBrand;
	private String itemFrequency;
	private List<Category> categoryList;
	
	public Item(String itemName, String itemBrand, String itemFrequency){
		this.itemName = itemName;
		this.itemBrand = itemBrand;
		this.itemFrequency = itemFrequency;
		categoryList = new ArrayList<Category>();
	}
	
	public String getItemName() {
		return itemName;
	}
	  
	public String getItemBrand() {
		return itemBrand;
	}
	
	public String getItemFrequency() {
		return itemFrequency;
	}
	
	
	public void addCategory(Category category) {
		categoryList.add(category);
	}
	
	public List<Category> getCategoryList(){
		return categoryList;
	}
	
//	public List<Double> getPrice() {
//		List<Double> weekdayPrice = new ArrayList<>();
//		if(getItemName().equals("Newspaper")) {
//		if(getItemBrand().equals("TOI")) {
//			Collections.addAll(weekdayPrice, 3.0, 3.0, 3.0, 3.0, 3.0, 5.0, 6.0);
//		} 
//		else if(getItemBrand().equals("Hindu")) {
//			Collections.addAll(weekdayPrice, 2.5, 2.5, 2.5, 2.5, 2.5, 4.0, 4.0);
//		}
//		else if(getItemBrand().equals("ET")) {
//			Collections.addAll(weekdayPrice, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 10.0);
//		}
//		else if(getItemBrand().equals("BM")) {
//			Collections.addAll(weekdayPrice, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5);
//		}
//		else if(getItemBrand().equals("HT")) {
//			Collections.addAll(weekdayPrice, 2.0, 2.0, 2.0, 2.0, 2.0, 4.0, 4.0);
//		}
//		}
//		return weekdayPrice;
//		
//	}
}
