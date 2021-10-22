package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Traingle traingle1 = (Traingle) context.getBean("tri-super");
		System.out.println(traingle1);
		System.out.println();
		Traingle traingle2 = (Traingle) context.getBean("tri");
		System.out.println(traingle2);
		System.out.println();

		Traingle traingle3 = (Traingle) context.getBean("traingle");
		System.out.println(traingle3);

		/*
		 * Circle circle = (Circle) context.getBean("circle"); circle.draw();
		 */
//		
//		MyRombus rombus = (MyRombus) context.getBean("myRombus");
//		rombus.hello();
//		Polygon poly1 = (Polygon) context.getBean("poly-super");
//		poly1.draw();
//		System.out.println();
//		Polygon poly2 = (Polygon) context.getBean("poly");
//		poly2.draw();
	}
}