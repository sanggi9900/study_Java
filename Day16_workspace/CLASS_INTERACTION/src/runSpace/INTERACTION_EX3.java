package runSpace;

import classSpace.Robot;

public class INTERACTION_EX3 {
	public static void main(String[] args) {
		// ��ȣ�ۿ� : ���� ������ ��ü������ ��ȣ�ۿ�
		Robot rob1 = new Robot();
		Robot rob2 = new Robot();
		rob1.show(); rob2.show();
		
		// rob1 ����
		// -> ���濡�� 10��ŭ�� �������� ������
		rob1.punchTo(rob2);
		// rob2 �̹�
		// -> �������κ��� 10��ŭ�� �������� �Ծ���
		
		rob1.show(); rob2.show();
		rob2.punchTo(rob1);
		
		rob1.show(); rob2.show();
	}
}