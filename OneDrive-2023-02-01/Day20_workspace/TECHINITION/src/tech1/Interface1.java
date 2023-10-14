package tech1;

abstract class Phone {
	protected String model;
	public abstract void powerOn();
	public abstract void powerOff();
}
// interface ��Ī ���� ������
interface HowTo {
	// 1. ������ �غ� �Ұ��ϴ� ����
	// 2. �ʵ�� �����ʵ��̰�, public static�̴�.
	// 3. abstract�� �Ⱥٿ��� �߻�޼��尡 ��.
	int count = 0;
	public default void call(String num) {
		System.out.println(num+"���� ��ȭ�մϴ�.");
	}
	public default void sms(String num) {
		System.out.println(num+"���� �����մϴ�.");
	}
	public void ai();
	public static void check() {
		System.out.println("���� : " + count);
	}
}

class Galaxy extends Phone implements HowTo {
	public Galaxy(String name) {
		model = name;
	}
	public void powerOn() {
		System.out.println("�����÷ΰ��� ��Ÿ��~");
	}
	public void powerOff() {
		System.out.println("�����÷ΰ��� �����~");
	}
	public void ai() {
		System.out.println("�򽺺�~!");
	}
}
class IPhone extends Phone implements HowTo {
	public IPhone(String name) {
		model = name;
	}
	public void powerOn() {
		System.out.println("���÷ΰ��� ������ �ִٰ� ����~");
	}
	public void powerOff() {
		System.out.println("���÷ΰ��� ������ �ִٰ� ����~");
	}
	public void ai() {
		System.out.println("�ø���~!");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		// �߻�Ŭ���� - ������ �ʵ带 �����ϴ� ���� �� ����
		//         - �޼���� �ʿ� �ּ����� ������ ���۸� ����
		/*
		Phone p1 = new Galaxy("������S22");
		Phone p2 = new IPhone("������13 mini");
		p1.powerOn();
		p2.powerOn();
		p1.powerOff();
		p2.powerOff();
		*/
		// �������̽� - ������ ��ȣ�ۿ������ �߰��ϱ� ���� Ŭ����
		//         - �ʵ�� �ּ������θ� �����ϰ�...
		//           �޼��带 �����ϰ� �� �� �ְ� �����Ѵ�.
		Galaxy p1 = new Galaxy("������S22");
		IPhone p2 = new IPhone("������13 mini");
		p1.call("010-1111-2222");
		p2.call("010-2222-3333");
		p1.sms("��浿");
		p2.sms("���浿");
		p1.ai();
		p2.ai();
		
		// �������̽��� static �޼���� ��ü���� ����
		// - �Ϲ����� ��������� ����� ���� �ذ�����
		HowTo.check();
	}
}

















