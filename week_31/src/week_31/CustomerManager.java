package week_31;

public class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Müşteri kaydedildi: ");
	}
	
	public void delete() {
		System.out.println("Müşteri silindi: ");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		creditManager.save();
		System.out.println("Kredi verildi.");
	}
	
	
}
