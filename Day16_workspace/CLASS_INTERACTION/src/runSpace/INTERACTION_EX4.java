package runSpace;

import classSpace.Box;

public class INTERACTION_EX4 {
	public static void main(String[] args) {
		// ���� ������ Ŭ�������� ��ȣ�ۿ�2
		// - ������ �����ϴ� ��ü������ ���
		//   ����ν� ����ϴ� ��찡 ����
		// ���� ������(Copy Constructor)
		// - ��ü�� �����Ͽ� �����ϱ� ���� ������
		// - �ʵ尡 �������� ��쿡�� "����"��
		Box box1 = new Box("�̻��������");
		Box box2 = new Box(box1);
		System.out.println(box1.getName());
		System.out.println(box2.getName());
		System.out.println(
				box1.getName() == box2.getName()
				);
	}
}






