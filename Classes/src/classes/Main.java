package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//referance type
			/*CustomerManager customerManager=new CustomerManager();
			customerManager.add();
			customerManager.delete();
			customerManager.update();
			
			int sayi1=10;
			int sayi2=20;
			sayi2=sayi1;
			sayi1=30;
			System.out.println(sayi2);
		
			
			int[] sayilar1= {1,2,3};
			int[] sayilar2= {4,5,6};
			
			sayilar2=sayilar1;
			sayilar1[0]=10;
			System.out.println(sayilar2[0]);*/
		
		
		Product product=new Product(1,"laptop","2500");
		/*product.id=1;
		product.name="laptop";
		product.price="25";*/
		
		
		//product.setId(1);
		
		//System.out.println(product.getId());
		
		
		//ProductManager productManager=new ProductManager();
		//productManager.add(product);
		
		Customer customer=new Customer();
		customer.id=1;
		
		EmployeeManager employeeManager=new EmployeeManager();
		employeeManager.add();
		
		
	}

}
