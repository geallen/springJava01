package spring.depin;

public class ClassA {

	private ClassB classB;
	
	public ClassB getClassB(){
		return classB;
	}
	
	public void setClassB(ClassB classB){
		this.classB = classB;
	}
	
	public void print(String msg){
		classB.print(msg);
	}
}
