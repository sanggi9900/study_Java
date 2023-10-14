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
		System.out.println(name + " : �߿�������!");
	}
}
class Dog extends Animal implements ActionList {
	public Dog(String name, String symp) {
		super(name, symp);
	}
	public void action1() {
		System.out.println(name + " : �пп�!");
	}
}







public class Interface2 {
	// 1. �θ� �߻�Ŭ���� Animal���� ��ĳ����
	public static void heal(Animal that) {
		System.out.println(that.getSym());
		that.setSym("ġ����");
		System.out.println(that.getSym());
	}
	// 2. �������̽� ActionList���� ��ĳ����
	public static void act(ActionList that) {
		that.action1();
	}
	// +@ : �������̽��� ��ĳ���õ� ���� �ٸ� �θ� ���� �̿��ҷ���
	//      �ٿ�ĳ���� ������ ���ľ� �Ѵ�.
	public static void test(ActionList that) {
		// A instanceof B;
		// A -> ��ü�� ��ġ�Ѵ�.
		// B -> Ŭ������ ��ġ�Ѵ�.
		if (that instanceof Cat) {
			Cat cat = (Cat)that;
			cat.action1();
		}
		else if (that instanceof Dog) {
			Dog dog = (Dog)that;
			dog.action1();
		}
		else {
			System.out.println("�̰� �ٷ� �� �����....");
		}
	}
	public static void main(String[] args) {
		// �߻�Ŭ������ ���ѻ���
		// - �ʹ� ���� �޼��带 �����ϸ� ��ĳ���õǾ
		//   �޼������ ���Ѿ��� ���ȴ�.
		Cat cat1 = new Cat("������", "����");
		Dog dog1 = new Dog("������", "����");
		heal(cat1);
		heal(dog1);
		// �������̽��� �޼����� �и��� ���������ش�.
		act(cat1);
		act(dog1);
		test(cat1);
		test(dog1);
	}
}













