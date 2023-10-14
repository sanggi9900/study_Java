package oop5;

import myclass.Box;
import myclass.GenBox;

public class SupEX {
	public static void main(String[] args) {
		// Box Ŭ������ ���ؼ� �����ϼ���.
		// - toString�� �������̵��� �Ͽ� �Ʒ��� �ڵ尡 �����ϵ��� ���弼��.
		Box box1 = new Box("���ڿ� ���� ����");
		GenBox<Box> box2 = new GenBox<Box>("���ڸ� ��� ����");
		
		System.out.println("box1 : " + box1);	// box1 : ���ڿ� ���� ����
		System.out.println("box2 : " + box2);	// box2 : ���ڸ� ��� ����
		
		box2.open();		// ���ڸ� ��� ������(/��) �������ϴ�.
		box2.setData(box1);	// ���ڸ� ��� ���� - ���强��...
		box2.showInfo();	// ���ڸ� ��� ���� : ���ڿ� ���� ����
	}
}