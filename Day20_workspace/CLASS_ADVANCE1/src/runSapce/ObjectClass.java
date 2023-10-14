package runSapce;

import classSpace.TypeBox;

public class ObjectClass {
	public static void main(String[] args) {
		// Object Class - �ڹٿ��� Ŭ������ �����ϸ�, �ڵ����� ��ӵǴ� Ŭ����
		// - �����ϴ� ���� �Ұ����� Ŭ����
		// - java.lang��Ű���� ������( + �⺻���� ���� Ŭ����(WRAPPER CLASS)�� ���⿡ ���Ե� )
		// - Ŭ������ ��ü�� ������� �� �߰����� �޼������ ���� ��
		// - �� �޼������ �����ϰ� �������̵��ϸ� �پ��� ȿ���� ���� �� ����
		TypeBox<Integer> box1 = new TypeBox<Integer>("��������1", 100);
		TypeBox<Integer> box2 = new TypeBox<Integer>("��������2", 100);
		
		// 1) public String toString()
		// -> ��ü�� "����"�� ��ȯ��ų ���� ������ �� ����
		System.out.println(box1);
		System.out.println(box2);
		
		// 2) public boolean equals(Object that)
		// -> ��ü�� "��"�� �� ���� ����� �����Ͽ� �����
		System.out.println(box1.equals(box2));
	}
}