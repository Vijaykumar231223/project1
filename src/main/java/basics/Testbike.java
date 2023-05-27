package basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Testbike {
	
	public static void main(String[] args) {
		
		ApplicationContext cont=new ClassPathXmlApplicationContext("ioc1.xml");
		Bike b=(Bike) cont.getBean("mybike");
		b.price();
	}

}
