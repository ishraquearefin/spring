package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {

	public static void main(String[] args) {
		//load the spring configured file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		Coach theCoach = context.getBean("mycoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		
		//close the configure file
		context.close();
		
		
		

	}

}
