package space2;

import space1.Human;

public class FinalEX {
	public static void main(String[] args) {
		// �ǽ�
		// �߻�Ŭ���� Body�� �������̽� Action�� �����ϰ�
		// �̸� ����� Human Ŭ������ �����ϼ���.
		// HumanŬ������ ������ ������ �����ڵ带 ���� �����ϼ���.
		
		// # BodyŬ����
		// - �ʵ� : �̸�, ����
		// - �޼��� : �̸��� ���̸� �޴� ������ / setter / getter
		//   - �����ڴ� �ϳ��� �غ��ϰ�, setter,getter��
		//    ��� �ʵ忡 ���ؼ� �غ��ϼ���.
		// # Action�������̽�
		// - �ʵ� : ����
		// - �޼��� : void greeting() / void introduce()
		Human person = new Human("���浿", 23);
		person.greeting(); // �ȳ��ϼ���~
		person.introduce(); // �� �̸��� ���浿�̰�, 23���Դϴ�.
	}
}