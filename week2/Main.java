package week2;

public class Main {

	public static void main(String[] args) {
//		CustomerManager customerManager = new CustomerManager();
//		customerManager.Add();
//		customerManager.Remove();
//		customerManager.Update();

//		DortIslem dortIslem = new DortIslem();
//		int sonuc = dortIslem.Topla(3, 4);
//		System.out.println(sonuc);
//		
		Product product1 = new Product(1, "Yeni Laptop", "Asus Laptop", 3000, 2, "Siyah");
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("Kýrmýzý");
		product.getKod();

		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		System.out.println(product1.getKod());

		// methodOverloading
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.Topla(2, 3));
		System.out.println(dortIslem.Topla(2, 3, 5));

		// inheritance
		Customer customer = new Customer();
		Employee employee = new Employee();

		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

		// inheritanceDemo
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.Hesapla();

		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
		
		
	}

}
