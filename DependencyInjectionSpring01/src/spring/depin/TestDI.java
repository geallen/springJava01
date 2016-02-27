package spring.depin;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class TestDI {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ClassA classA = (ClassA)context.getBean("ClassA");
		classA.print("merhaba ben gamze sen. sen kimsin?");
		
		/*ClassB classB = new ClassB();
		classA.setClassB(classB);
		classA.print("Merhaba ben gamze sen");*/
	}
}
