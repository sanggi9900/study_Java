package tech1;

import myClass.Drivable;
import test.AbsHuman;

public class AnonymousEX {
	public static void main(String[] args) {
		AbsHuman ghost = new AbsHuman("����") {
			public void introduce() {
				System.out.println("�ȳ��ϼ���. " + "���ǹٸ� " + name +"�Դϴ�.");
			}
			public void report() {
				System.out.println("���� ������� ������ ��ġ�� �����ϴ�.");
			}
		};
		ghost.introduce();
		ghost.report();
		Drivable sled = new Drivable() {
			public void showInfo() { System.out.println("�������"); }
			public void drive() { System.out.println("������� : ���"); }
			public void stop() { System.out.println("������� : ������ ������ϴ�."); }
		};
		sled.drive();
		sled.stop();
	}
}