package space2;

import space1.Throwable;
import space1.AbsBox;
import space1.ValueBox;

public class InterfaceClass {
	public static void main(String[] args) {
		// �������̽� : ��Ī�� �������̽��̰�, Ŭ����(class)�� ���� �� �ϳ�
		//          �ʵ尡 �������� �ʴ� �߻� Ŭ����
		// - ��ü�� ���(��ȣ�ۿ���)�� ���Ͻ�����
		// - ��ĳ���� ������ ������ �ø� �� ����
		
		// ���ǻ��� : �������̽��� �ʵ�� �����ʵ��̴� ����
		ValueBox box1 = new ValueBox("����", 100);
		box1.underThrow();
		box1.overThrow();
		
		AbsBox box2 = box1;
		box2.printInfo();
		
		Throwable box3 = box1;
		box3.underThrow();
	}
}





