package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
		
		
		//CustomerManager Manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		//Manager.add();

	}
	
	//IoC - Inversion of control
	//Dependency Injection
	
	
}
