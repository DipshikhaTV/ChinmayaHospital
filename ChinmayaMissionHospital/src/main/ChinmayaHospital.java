package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ChinmayaHospital {
	
	private String hospitalCity;
	private List<Patient> allPatient;
	private String fromDate;
	private String toDate;
	//Patient patient;
	//Visit visit;
	
	public ChinmayaHospital(String hospitalCity, String fromDate, String toDate){
    	this.hospitalCity = hospitalCity;	
    	this.fromDate = fromDate;
    	this.toDate = toDate;
     }
	
	
	public String getHospitalCity() {
		return hospitalCity;
	}
	
	public Date fromDate() throws ParseException {
		Date fromDate1=new SimpleDateFormat("yyyy-MM-dd").parse(fromDate);
		return fromDate1;
	}
	
	public Date toDate() throws ParseException {
		Date toDate1=new SimpleDateFormat("yyyy-MM-dd").parse(toDate);
		return toDate1;
	}
	
	public void addPatient(Patient... patient) {
		allPatient = new ArrayList<Patient>();
		allPatient.addAll(Arrays.asList(patient));
	}
	
	public List<Patient> getPatientList() {
		return allPatient;
	}
	
	public List<Patient> getLocalPatient() {
		return getPatientList()
				.stream()
				.filter(p -> p.getPatientCity().equals(getHospitalCity()))
				.collect(Collectors.toList());
	}
	
	public List<Patient> getOutStationPatient() {
		return getPatientList()
				.stream()
				.filter(p -> !p.getPatientCity().equals(getHospitalCity()))
				.collect(Collectors.toList());
	}
	
	public int getAllPatientVisitCountWithinDateRange() throws ParseException {
		int totalVisitOfAllPatient = 0;
		for(Patient patient : getPatientList()) {
			if(patient.getVisitDate().after(fromDate()) 
					&& patient.getVisitDate().before(toDate()))
			totalVisitOfAllPatient++;
		}
		return totalVisitOfAllPatient;
	}
	

	public double getLocalPatientsVistPercentage1() throws ParseException {
		int totalVisitOfLocalPatient = 0;
		double percentOfLocalPatient;
		for(Patient patient : getLocalPatient()) {
			if(patient.getVisitDate().after(fromDate()) 
					&& patient.getVisitDate().before(toDate())) {
				totalVisitOfLocalPatient++;
			}
		}
		percentOfLocalPatient = (totalVisitOfLocalPatient*100)
				/getAllPatientVisitCountWithinDateRange();
		return percentOfLocalPatient;
	}
	
	public double getOutStationPatientsVistPercentage1() throws ParseException {
		int totalVisitOfOutStationPatient = 0;
		double percentOfOutStationPatient;
		for(Patient patient : getOutStationPatient()) {
			if(patient.getVisitDate().after(fromDate()) 
					&& patient.getVisitDate().before(toDate())) {
			   totalVisitOfOutStationPatient++;
			}
		}
		percentOfOutStationPatient = (totalVisitOfOutStationPatient*100)
				/getAllPatientVisitCountWithinDateRange();
		return percentOfOutStationPatient;
	}
	
//	public int getAllPatientVisitCount() {
//	int totalVisitOfAllPatient = 0;
//	for(Patient patient : getPatientList()) {
//		totalVisitOfAllPatient = totalVisitOfAllPatient + 
//				patient.getVisitCount();
//	}
//	return totalVisitOfAllPatient;
//}
//	public double getLocalPatientsVistPercentage() {
//		int totalVisitOfLocalPatient = 0;
//		double percentOfLocalPatient;
//		for(Patient patient : getLocalPatient()) {
//			totalVisitOfLocalPatient = totalVisitOfLocalPatient + 
//					patient.getVisitCount();
//		}
//		percentOfLocalPatient = (totalVisitOfLocalPatient*100)/getAllPatientVisitCount();
//		return percentOfLocalPatient;
//	} 
//	public double getOutStationPatientsVistPercentage() {
//		int totalVisitOfOutStationPatient = 0;
//		double percentOfOutStationPatient;
//		for(Patient patient : getOutStationPatient()) {
//			totalVisitOfOutStationPatient = totalVisitOfOutStationPatient + 
//					patient.getVisitCount();
//		}
//		
//		percentOfOutStationPatient = (totalVisitOfOutStationPatient*100)/getAllPatientVisitCount();
//		return percentOfOutStationPatient;
//	}
	

}
