package runSpace;

import classSource.Box2;

public class BASE2_EX {
	public static void main(String[] args) {
		// �ǽ�
		// 1) Box2 Ŭ������ �ʵ�� ��� public�Դϴ�.
		//  ������� �����ؼ� ����� �����ϼ���.
		
		// 2) Box2 Ŭ������ �ʵ忡 ���� setter�� getter��
		//   �����ϰ� �̸� �̿��Ͽ� ���� �����ϰ� ����ϼ���.
		Box2 box2 = new Box2();
		box2.setName("������� ����� ����");
		box2.setState(false);
		System.out.println(
				box2.getName()
				+ " " +
				box2.getState()
				);
		box2.open();
		System.out.println(
				box2.getName()
				+ " " +
				box2.getState()
				);
	}
}