package tech1;

class Rock {
	protected String name;
	public Rock() { name = "��"; }
	public String toString() { return name; }
}
interface Action {
	void shoot();
}
abstract class ActionClass {
	protected Rock rock;
	public ActionClass(Rock rock) {
		this.rock = rock;
	} 
	public abstract void shoot();
}














public class Anonymous {
	public static void EX1() {
		Action rock = new Action() {
			// 1. �ʵ� �߰� ����. ����� private.
			String name = "��";
			public void shoot() {
				System.out.println(name + "�� �������ϴ�!");
			}
			// 2. �޼��� �߰� ����. ����� private.
			// - �����ε� ����� �ȵ�
			// - ������ �ٸ� �޼��忡�� ȣ���ؾ� ��
			/*
			public void shoot(int num) {
				System.out.println("��!!!!");
				System.out.println(data1);
				System.out.println(data2);
			}
			*/
		};
		rock.shoot();
	}
	public static void EX2() {
		Rock uglyRock = new Rock() {
			// �����ڴ� �߰��� �� ����
			// �̸��� ���� ���ڽ� Ŭ�����ڸ� �ǽð�����
			// �����ϱ� ������ ������� �״�� ���󰣴�.
			public String toString() {
				return "������ " + name;
			}
		};
		System.out.println(uglyRock);
	}
	public static void main(String[] args) {
		// �������̽��� ���뼺�� �������� ��Ȥ �߻�Ŭ������
		// �������̽�ó�� ���� ���� ��쵵 �ִ�.
		Rock uglyRock = new Rock();
		
		ActionClass rock = new ActionClass(uglyRock) {
			public void shoot() {
				System.out.println(rock + "�� �������!");
			}
		};
		rock.shoot();
	}
}











