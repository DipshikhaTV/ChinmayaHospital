package test;

import java.text.ParseException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import main.*;

public class ChinmayaHospitalTest {
	
	ChinmayaHospital chinmayaHospital;
	
	
	@Test
    public void verifyAllPatient() {
    //Arrange
	chinmayaHospital  = new ChinmayaHospital("Bangalore", "2021-06-01", "2021-06-30");
	Patient patient1  = new Patient("Gita","Bangalore",10,"2021-06-05");
	Patient patient2  = new Patient("Rita","Bangalore",10,"2021-06-09");
	Patient patient3  = new Patient("Sita","Mysore",10,"2021-06-09");
	Patient patient4  = new Patient("Pita","Mysore",10,"2021-06-18");
	Patient patient5  = new Patient("Mita","Mysore",10,"2021-07-01");  
	//Act
	chinmayaHospital.addPatient( patient1, patient2, patient3, patient4, patient5);
    //Assertion
    List<Patient> patientList =  chinmayaHospital.getPatientList();
    for ( Patient patient : patientList) {
		  Assert.assertTrue(patient  instanceof Patient);
		  }
 	 
     }
	
	@Test
    public void verifyLocalPatientSize() {
    //Arrange
	chinmayaHospital  = new ChinmayaHospital("Bangalore", "2021-06-01", "2021-06-30");
	Patient patient1  = new Patient("Gita","Bangalore",10,"2021-06-05");
	Patient patient2  = new Patient("Rita","Bangalore",10,"2021-06-09");
	Patient patient3  = new Patient("Sita","Mysore",10,"2021-06-09");
	Patient patient4  = new Patient("Pita","Mysore",10,"2021-06-18");
	Patient patient5  = new Patient("Mita","Mysore",10,"2021-07-01");  
    //Act
	chinmayaHospital.addPatient( patient1, patient2, patient3, patient4, patient5);
	//Assertion
    Assert.assertEquals(chinmayaHospital.getLocalPatient().size(),2);
 		
     }
	
	@Test
    public void verifyOutStationPatientSize() {
    //Arrange
	chinmayaHospital  = new ChinmayaHospital("Bangalore", "2021-06-01", "2021-06-30");
	Patient patient1  = new Patient("Gita","Bangalore",10,"2021-06-05");
	Patient patient2  = new Patient("Rita","Bangalore",10,"2021-06-09");
	Patient patient3  = new Patient("Sita","Mysore",10,"2021-06-09");
	Patient patient4  = new Patient("Pita","Mysore",10,"2021-06-18");
	Patient patient5  = new Patient("Mita","Mysore",10,"2021-07-01");  
    //Act
    chinmayaHospital.addPatient( patient1, patient2, patient3, patient4, patient5);
	//Assertion
    Assert.assertEquals(chinmayaHospital.getOutStationPatient().size(),3);
 		
     }
	
	@Test
    public void verifyLocalPatient() {
    //Arrange
	chinmayaHospital  = new ChinmayaHospital("Bangalore", "2021-06-01", "2021-06-30");
	Patient patient1  = new Patient("Gita","Bangalore",10,"2021-06-05");
	Patient patient2  = new Patient("Rita","Bangalore",10,"2021-06-09");
	Patient patient3  = new Patient("Sita","Mysore",10,"2021-06-09");
	Patient patient4  = new Patient("Pita","Mysore",10,"2021-06-18");
	Patient patient5  = new Patient("Mita","Mysore",10,"2021-07-01");  
	//Act
    chinmayaHospital.addPatient( patient1, patient2, patient3, patient4, patient5);
    //Assertion
    List<Patient> patientList =  chinmayaHospital.getLocalPatient();
 	for ( Patient patient : patientList) {
 		  Assert.assertTrue(patient.getPatientCity().
 				  equals(chinmayaHospital.getHospitalCity()));
 		  }
     }
	
	@Test
    public void verifyOutStationPatient() {
    //Arrange
    chinmayaHospital  = new ChinmayaHospital("Bangalore", "2021-06-01", "2021-06-30");
	Patient patient1  = new Patient("Gita","Bangalore",10,"2021-06-05");
	Patient patient2  = new Patient("Rita","Bangalore",10,"2021-06-09");
	Patient patient3  = new Patient("Sita","Mysore",10,"2021-06-09");
	Patient patient4  = new Patient("Pita","Mysore",10,"2021-06-18");
	Patient patient5  = new Patient("Mita","Mysore",10,"2021-07-01");  
    //Act
    chinmayaHospital.addPatient( patient1, patient2, patient3, patient4, patient5);
    //Assertion
 	 List<Patient> patientList =  chinmayaHospital.getOutStationPatient();
 	 for ( Patient patient : patientList) {
 		  Assert.assertTrue(!patient.getPatientCity().
 				  equals(chinmayaHospital.getHospitalCity()));
 		  }
     }
	
	@Test
    public void verifyLocalPatientsVistPercentage() throws ParseException {
    //Arrange
	chinmayaHospital  = new ChinmayaHospital("Bangalore", "2021-06-01", "2021-06-30");
	Patient patient1  = new Patient("Gita","Bangalore",10,"2021-06-05");
	Patient patient2  = new Patient("Rita","Bangalore",10,"2021-06-09");
	Patient patient3  = new Patient("Sita","Mysore",10,"2021-06-09");
	Patient patient4  = new Patient("Pita","Mysore",10,"2021-06-18");
	Patient patient5  = new Patient("Mita","Mysore",10,"2021-07-01");  
	 //Act
	 chinmayaHospital.addPatient( patient1, patient2, patient3, patient4, patient5);
     //Assertion
 	 Assert.assertEquals(chinmayaHospital.getLocalPatientsVistPercentage1(),50.0);
     }
	
	@Test
    public void verifyOutStationPatientsVistPercentage() throws ParseException {
    //Arrange
	chinmayaHospital  = new ChinmayaHospital("Bangalore", "2021-06-01", "2021-06-30");
    Patient patient1  = new Patient("Gita","Bangalore",10,"2021-06-05");
    Patient patient2  = new Patient("Rita","Bangalore",10,"2021-06-09");
    Patient patient3  = new Patient("Sita","Mysore",10,"2021-06-09");
    Patient patient4  = new Patient("Pita","Mysore",10,"2021-06-18");
    Patient patient5  = new Patient("Mita","Mysore",10,"2021-07-01");  
	 //Act
    chinmayaHospital.addPatient( patient1, patient2, patient3, patient4, patient5);
	 //Assertion
 	 Assert.assertEquals(chinmayaHospital.getOutStationPatientsVistPercentage1(),50.0);
     }

}
