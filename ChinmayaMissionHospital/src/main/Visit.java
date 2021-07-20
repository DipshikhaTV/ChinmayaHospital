package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {
	
	 
	private String visitDate;
	
	public Visit(String visitDate){
        this.visitDate   = visitDate;
     }
	
	public Date getVisitDate() throws ParseException {
		Date visitDate1=new SimpleDateFormat("dd/MM/yyyy").parse(visitDate);
		return visitDate1;
	}

}
