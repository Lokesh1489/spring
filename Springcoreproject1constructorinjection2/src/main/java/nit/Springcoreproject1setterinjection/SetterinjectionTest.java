package nit.Springcoreproject1setterinjection;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterinjectionTest {

	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource(
				"src/main/java/com/nt/cfgs/ApplicationContext.xml");

		XmlBeanFactory factory = new XmlBeanFactory(res);
		 System.out.println("--------------");

		Object object = factory.getBean("wmg");

		WishMessageGenerator generator = (WishMessageGenerator) object;
        System.out.println("--------------");
		
		String message = generator.generateMessage("  loki");
		System.out.println("wish message is :" + message);
		 System.out.println("--------------");

	}

}
