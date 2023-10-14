package runSapce;

import classSpace.Box;
import classSpace.Human;
import classSpace.IntBox;
import classSpace.WordBox;

public class UpcastEX {
	public static void main(String[] args) {
		// �ǽ�
		// 1) Box Ŭ������ "�������θ� ������ ����"
		//    ��� �̸����� ��ü�� �����ϼ���.
		// 2) IntBox Ŭ������ "������ �����ϴ� ����"
		//    ��� �̸����� ��ü�� �����ϼ���.
		//    - IntBox�� �����ڸ� ���� ����
		//      ������ �ȵ˴ϴ�. �����ϼ���.
		// 3) WordBox Ŭ������ "�ܾ �����ϴ� ����"
		//    ��� �̸����� ��ü�� �����ϼ���.
		//    - WordBox�� �����ڸ� ���� ������
		//      ���� �־�߸� �մϴ�. �����ϼ���.
		// 4) Human Ŭ������ "�谳��" ��� "�ڽ�������" ��ü��
		//    �����ϼ���.
		// 5) Human Ŭ���� ��ü�� ��� ���ڸ� ������ ���ȴ���
		//    Ȯ���ϼ���.
		Box box1 = new Box("�������θ� ������ ����");
		IntBox box2 = new IntBox("������ �����ϴ� ����");
		WordBox box3 = new WordBox("�ܾ �����ϴ� ����", "Apple");
		Human manager = new Human("�谳��","�ڽ�������", 0);
		
		manager.action(box1); // ���� Box�� ��ü�� �ٷ�� �� - �ƹ��� ��ȭ ���� 
		manager.action(box2); // ���� IntBox�� ���� Box�ν� �ٷ� -> ��ĳ����
		manager.action(box3); // ���� WordBox�� ���� Box�ν� �ٷ� -> ��ĳ����
		
		// �� : ������� ������� ��ü�� �̿��� ����..
		//    �θ� Ŭ������ �� �̿��ؾ�, ���� �޼��尡 ������
		System.out.println(box1.getState());
		System.out.println(box2.getState());
		System.out.println(box3.getState());
	}
}





