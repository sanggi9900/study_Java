package runSpace;

import classSource.Box;

public class BASE1_EX {
	public static void main(String[] args) {
		// �ǽ�
		// - classSource��Ű���� Box Ŭ������ �����մϴ�.
		// �Ӽ� : ������ �̸�, ������ ����
		// ���� : ���ڿ���, ���ڴݱ�
		// �Ӽ��� ���� �տ� ���� public�� �ٿ��ּ���.
		// �Ʒ� �ڵ尡 ����˴ϴ�.
		Box box1 = new Box();
		box1.name = "������ ����";
		box1.state = false;
		// ��ü�� �޼���� �ܺο� ��ȣ�ۿ��� �ϰų�..
		// �ڱ��ڽ��� �ٲٴ� ���� ������
		// # Ŭ������ �޼����� Ư¡
		// - �ڱ��ڽſ� ���ؼ� ������ �̿��� ������
		// - �ʵ�� ������� ��ü�� �ʵ带 �ǹ���
		box1.open();
		System.out.println(box1.name + " " + box1.state);
		box1.close();
		System.out.println(box1.name + " " + box1.state);
	}
}



