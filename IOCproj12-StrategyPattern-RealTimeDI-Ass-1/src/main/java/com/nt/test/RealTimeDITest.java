package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PatientVO;

public class RealTimeDITest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = null, addrs = null, pamt = null, rate = null, time = null;
		if (sc != null) {
			System.out.println("Enter customer name:");
			name = sc.next();
			System.out.println("Enter customer address:");
			addrs = sc.next();
			System.out.println("Enter customer principle amount:");
			pamt = sc.next();
			System.out.println("Enter rate of intrest:");
			rate = sc.next();
			System.out.println("Enter customer months:");
			time = sc.next();
		}
		PatientVO vo = new PatientVO();
		vo.setCname(name);
		vo.setCadd(addrs);
		vo.setPamt(pamt);
		vo.setRate(rate);
		vo.setTime(time);
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		MainController controller = factory.getBean("controller", MainController.class);
		try {
			String resultMsg = controller.processCustomer(vo);
			System.out.println(resultMsg);
		} catch (Exception e) {
			System.out.println("problem in customer registration::" + e.getMessage());
			e.printStackTrace();
		}

	}

}
