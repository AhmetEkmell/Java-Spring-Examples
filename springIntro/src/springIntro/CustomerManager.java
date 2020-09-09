package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	//constructor injection (sektör bunu daha çok kullanýyor)
	//public CustomerManager(ICustomerDal customerDal) {
		//this.customerDal = customerDal;
	//}

	
	//setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// is kurallari
		customerDal.add();
	}
	
}
