package runSpace;

import classSource.Bird;

public class BASE12_Review {
	public static void main(String[] args) {
		// �ǽ�
		// Bird Ŭ������ �����ϼ���.
		// Ư�� : �̸� / ���� / ���� �ִ��� �ƴ��� ����
		// ���� : �̷� / ���� / ����
		// �Ʒ��� �ڵ尡 ����˴ϴ�.
		Bird sparrow = new Bird();
		sparrow.setName("±±��");
		sparrow.setSpec("����");
		sparrow.setStat(false);
		System.out.println(
				sparrow.getName() + " " + sparrow.getStat()
				);	// ±±�� false
		sparrow.takeoff();	// �̷�
		sparrow.fly();		// ���� ��
		System.out.println(
				sparrow.getName() + " " + sparrow.getStat()
				);	// ±���� true
		sparrow.landing();	// ����
		sparrow.fly();		// ���� ���� ���� ���� �ʽ��ϴ�.
	}
}
