package oop6;

class Super {
	public Super() {}
	public void method1() { System.out.println("부모메서드1"); }
	public void method2() { System.out.println("부모메서드2"); }
}
class Sub extends Super {
	public Sub() { super(); }
	public void method2() { System.out.println("자식메서드2"); }
	public void method3() { System.out.println("자식메서드3"); }
}

public class OOP16 {
	public static void main(String[] args) {
		// 캐스팅시 주의사항 : 메서드가 달라짐
		Sub sub1 = new Sub();
		sub1.method1();
		sub1.method2();
		sub1.method3();
		// 1) 부모 클래스 것은 당연히 쓸 수 있음
		// 2) 자식 클래스 것은 쓸 수 없음
		// 3) 재정의한 것은 자식클래스의 것으로만 사용된다
		// 4) 해당 메서드(필드포함)의 사용은 부모클래스의 접근제어를 따라간다.
		Super sup1 = sub1;
		sup1.method1();
		sup1.method2();
	}
}




