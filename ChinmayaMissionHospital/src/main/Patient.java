package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient {
	
	private String patientName;
	private String patientCity;
	private int visitCount;
	String visitDate;
	
	public Patient(String patientName,String patientCity, int visitCount, String visitDate){
    	this.patientName = patientName;	
        this.patientCity = patientCity;
        this.visitCount  = visitCount;
        this.visitDate   = visitDate;
     }
	
	public String getPatientName() {
		return patientName;
	}
	
	public String getPatientCity() {
		return patientCity;
	}

	public int getVisitCount() {
		 return visitCount;
		
	}
	
	public Date getVisitDate() throws ParseException {
		Date visitDate1=new SimpleDateFormat("yyyy-MM-dd").parse(visitDate);
		return visitDate1;
	}

	
	

}
