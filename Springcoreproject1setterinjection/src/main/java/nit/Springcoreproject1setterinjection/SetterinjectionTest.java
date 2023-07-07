package nit.Springcoreproject1setterinjection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterinjectionTest {

	public static void main(String[] args) {
		//FileSystemResource res = new FileSystemResource(
				//"src/main/java/com/nt/cfgs/ApplicationContext.xml");
				DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
				XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");

	//	XmlBeanFactory factory = new XmlBeanFactory(res);
		 System.out.println("--------------");

		//Object object = factory.getBean("wmg");

		//WishMessageGenerator generator = (WishMessageGenerator) object;
		WishMessageGenerator generator = factory.getBean("wmg",WishMessageGenerator.class);
        System.out.println("--------------");
		
		String message = generator.generateMessage("lokesh");
		System.out.println("wish message is :" + message);
		 System.out.println("--------------");

	}

}
