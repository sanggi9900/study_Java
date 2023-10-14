package oop5;

class Cat {
	private String name;
	public Cat() { name = "������"; }
	public void meow() { System.out.println(name + " : �Ŀ�������!"); }
	// Object Ŭ������ toString �޼��� �������̵�
	// - ��ü�� �׳� "���"�ϸ� �� �޼��尡 ȣ��Ǿ ���ȴ�.
	public String toString() {
		return name;
	}
}
class Dog {
	private String name;
	public Dog() { name = "������"; }
	public void bark() { System.out.println("�пп�!"); }
	public String toString() {
		return name;
	}
}
public class OOP14 {
	public static void main(String[] args) {
		// java.lang.Object Ŭ����
		// - ��� Ŭ������ �ֻ��� �θ�Ŭ����. ���� ������ �߻��ϴ� ���� �ȵ�
		// - ���� "����ϴ�" �ڵ带 �ۼ��� �ʿ���� �ڵ����� ��ӵǴ� Ŭ����
		// - �� Ŭ������ ��ӵǱ� ������, � Ŭ������ ��ü�� �����, ������ �޼��尡 �����ϰ� ��
		
		// Object Ŭ������ ������ ����?
		// - ��� ���鿡���� �����ϰ� ����� �� �ִ� �޼��带 �����Ѵ�.
		// - ���� �ٸ� Ŭ������ ������� ��ü����, �����ϰ� ����� �� �ְ� ���ش�.
		//   ����� ������, �������̵�/�����ε��� �ʼ��̴�.
		Cat cat = new Cat();
		Dog dog = new Dog();
		String word = "���ڿ�";
		cat.meow();
		dog.bark();
		// String name = cat; toString�� �̰� �����ϰ� ������ �ʴ´�.
		System.out.println(cat + " " + dog + " " + word);
	}
}
