package runSpace;

import classSpace.Box;
import classSpace.Human;

public class ActionEX2 {
	public static void main(String[] args) {
		// �ǽ�
		// Human Ŭ������ action �޼��带 �����ϼ���.
		// 1) ������ ���¸� �о ���ų� �ݴ� �޼���
		// 2) ������ ���� Ư�� ��°�� ������ ���ų� �ݴ� �޼���
		// 1)�� 2)�� �����ε��Դϴ�.
		// ���� action �޼����� �̸����� �����ϼ���.
		
		// �����ڵ�
		Human manager = new Human("������", "�ڵ鷯",31);
		Box box1 = new Box();
		Box[] drawers = new Box[4];
		for (int i = 0; i < drawers.length; i += 1) {
			drawers[i] = new Box((i+1)+"�� ����");
		}
		// box1�� ���� ���۰�� ����
		System.out.println(box1.getState());
		manager.action(box1);
		System.out.println(box1.getState());
		manager.action(box1);
		System.out.println(box1.getState());
		
		// drawers �߿��� ������ ��� ���� ���� ����
		System.out.println(drawers[2].getState());
		manager.action(drawers, 2);
		System.out.println(drawers[2].getState());
		manager.action(drawers, 2);
		System.out.println(drawers[2].getState());
		
		// �߸��� �����̴� ���� �Ǹ� �ȵ�
		manager.action(drawers, 5);
		manager.action(drawers, -1);
		
	}
}





