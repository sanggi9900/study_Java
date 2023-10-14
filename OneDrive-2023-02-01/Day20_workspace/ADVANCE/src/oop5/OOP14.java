package oop5;

class Cat {
	private String name;
	public Cat() { name = "고양이"; }
	public void meow() { System.out.println(name + " : 냐오오오옹!"); }
	// Object 클래스의 toString 메서드 오버라이딩
	// - 객체를 그냥 "사용"하면 이 메서드가 호출되어서 사용된다.
	public String toString() {
		return name;
	}
}
class Dog {
	private String name;
	public Dog() { name = "강아지"; }
	public void bark() { System.out.println("왈왈왈!"); }
	public String toString() {
		return name;
	}
}
public class OOP14 {
	public static void main(String[] args) {
		// java.lang.Object 클래스
		// - 모든 클래스의 최상위 부모클래스. 빼면 문제가 발생하니 빼면 안됨
		// - 직접 "상속하는" 코드를 작성할 필요없이 자동으로 상속되는 클래스
		// - 이 클래스가 상속되기 때문에, 어떤 클래스로 객체를 만들던, 동일한 메서드가 존재하게 됨
		
		// Object 클래스의 역할이 뭔데?
		// - 상속 측면에서는 동일하게 사용할 수 있는 메서드를 제공한다.
		// - 서로 다른 클래스로 만들어진 객체여도, 동일하게 취급할 수 있게 해준다.
		//   제대로 쓸려면, 오버라이딩/오버로딩이 필수이다.
		Cat cat = new Cat();
		Dog dog = new Dog();
		String word = "문자열";
		cat.meow();
		dog.bark();
		// String name = cat; toString은 이걸 가능하게 해주지 않는다.
		System.out.println(cat + " " + dog + " " + word);
	}
}

