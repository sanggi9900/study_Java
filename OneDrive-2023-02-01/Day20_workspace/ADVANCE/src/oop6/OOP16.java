package oop6;

class Super {
	public Super() {}
	public void method1() { System.out.println("�θ�޼���1"); }
	public void method2() { System.out.println("�θ�޼���2"); }
}
class Sub extends Super {
	public Sub() { super(); }
	public void method2() { System.out.println("�ڽĸ޼���2"); }
	public void method3() { System.out.println("�ڽĸ޼���3"); }
}

public class OOP16 {
	public static void main(String[] args) {
		// ĳ���ý� ���ǻ��� : �޼��尡 �޶���
		Sub sub1 = new Sub();
		sub1.method1();
		sub1.method2();
		sub1.method3();
		// 1) �θ� Ŭ���� ���� �翬�� �� �� ����
		// 2) �ڽ� Ŭ���� ���� �� �� ����
		// 3) �������� ���� �ڽ�Ŭ������ �����θ� ���ȴ�
		// 4) �ش� �޼���(�ʵ�����)�� ����� �θ�Ŭ������ ������� ���󰣴�.
		Super sup1 = sub1;
		sup1.method1();
		sup1.method2();
	}
}



