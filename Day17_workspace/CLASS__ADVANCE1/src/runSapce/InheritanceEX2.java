package runSapce;

import classSpace.Doctor;
import classSpace.Human;

public class InheritanceEX2 {
	public static void main(String[] args) {
		// �ǽ�
		// - Human Ŭ������ ����ؼ� Doctor Ŭ������ �����ϼ���.
		// 0) age �ʵ�� 0���� �����ϰ�, roll �ʵ�� "�ǻ�"�� �����˴ϴ�.
		// 1) �ʵ�� "�������"�� �߰��˴ϴ�.
		//    �������� �����ϰ����� part��� �ϼ���.
		// 2) getName�� �������̵��ؼ� <�ǻ� XXX> ���·� ��ȯ�մϴ�.
		// 3) getRoll�� �������̵��ؼ� <������� : XXX> ���·� ��ȯ�մϴ�.
		// 4) greeting�� �����ε��ؼ� Human ��ü�� �޾Ƽ� �� �̸��� �о
		//    �λ縦 �ϵ��� �����ϼ���.
		Doctor kim = new Doctor("����", "�Ϲݿܰ�");
		Human pat = new Human("�ο���", "ȯ��", 59);
		kim.greeting(); // �ȳ��ϼ���~
		kim.greeting(pat); // �ο��ִ� �ȳ��ϼ���. �����Դϴ�.
		System.out.println(kim.getName()); // �ǻ� ����
		System.out.println(kim.getRoll()); // ������� : �Ϲݿܰ�
	}
}