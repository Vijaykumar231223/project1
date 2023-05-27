package basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMobile {
	
	public static void main(String[] args) {
		
		
		// by using beanfactory container
//		ClassPathResource resource=new ClassPathResource("ioc1.xml");
//		BeanFactory b=new XmlBeanFactory(resource);
//		Mobile mobile= (Mobile)b.getBean("mymobile");
//		mobile.Musicplayer();
		
		
		//by using application context container
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
		Mobile mobile=(Mobile) context.getBean("mymobile");
		mobile.Musicplayer();
	}

}
