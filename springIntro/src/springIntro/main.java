package springIntro;

public class main {

	public static void main(String[] args) {
		
		CustomerManager Manager = new CustomerManager(new MySqlcustomerDal());
		Manager.add();

	}
	
	//IoC - Inversion of control
	//Dependency Injection
	
	
}
