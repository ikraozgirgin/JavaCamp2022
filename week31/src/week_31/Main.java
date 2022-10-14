package week_31;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Company company= new Company();
		company.setTaxNumber("100000");
		company.setCompanyNumber("1589648");
		
		
		CustomerManager customerManager = new CustomerManager(new Company(), new TeacherCreditManager());
		customerManager.giveCredit();
		
		
		
		Person person = new Person();
		person.setId(1);
		person.setFirstName("Ýkra");
		person.setLastName("Özgirgin");
		person.setNationalIdentity("123456");
		
		
		
		
		
	}
	

}
