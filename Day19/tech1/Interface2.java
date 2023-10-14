package tech1;
abstract class Animal {
	protected String name;
	protected String symptom;
	public Animal(String name, String symptom) {
		this.name = name;
		this.symptom = symptom;
	}
	public String getSym() {
		return symptom;
	}
	public void setSym(String state) {
		symptom = state;
	}
}
interface ActionList {
	public void action1();
}
class Cat extends Animal implements ActionList {
	public Cat(String name, String symp) {
		super(name, symp);
	}
	public void action1() {
		System.out.println(name + " : 야오오오옹!");
	}
}
class Dog extends Animal implements ActionList {
	public Dog(String name, String symp) {
		super(name, symp);
	}
	public void action1() {
		System.out.println(name + " : 왈왈왈!");
	}
}







public class Interface2 {
	// 1. 부모 추상클래스 Animal로의 업캐스팅
	public static void heal(Animal that) {
		System.out.println(that.getSym());
		that.setSym("치료중");
		System.out.println(that.getSym());
	}
	// 2. 인터페이스 ActionList로의 업캐스팅
	public static void act(ActionList that) {
		that.action1();
	}
	// +@ : 인터페이스로 업캐스팅된 것은 다른 부모 것을 이용할려면
	//      다운캐스팅 과정을 거쳐야 한다.
	public static void test(ActionList that) {
		// A instanceof B;
		// A -> 객체를 배치한다.
		// B -> 클래스를 배치한다.
		if (that instanceof Cat) {
			Cat cat = (Cat)that;
			cat.action1();
		}
		else if (that instanceof Dog) {
			Dog dog = (Dog)that;
			dog.action1();
		}
		else {
			System.out.println("이건 다룰 수 없어요....");
		}
	}
	public static void main(String[] args) {
		// 추상클래스의 제한사항
		// - 너무 많은 메서드를 제공하면 업캐스팅되어도
		//   메서드들이 제한없이 사용된다.
		Cat cat1 = new Cat("개냥이", "감기");
		Dog dog1 = new Dog("고아지", "감기");
		heal(cat1);
		heal(dog1);
		// 인터페이스를 메서드의 분리를 실현시켜준다.
		act(cat1);
		act(dog1);
		test(cat1);
		test(dog1);
	}
}














