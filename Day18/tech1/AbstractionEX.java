package tech1;

import myClass.Doctor;
import myClass.Patient;

public class AbstractionEX {
	public static void main(String[] args) {
		// �߻�Ŭ������ ��ӹ޾Ҵٰ� �ؼ�, ��ӹ��� Ŭ������ �� ��
		// ������ ���� �ҷ��� �ʿ�� ������ ����...
		// �߻�Ŭ������ �� Ŭ�������� ���ȴ�.
		Doctor doc1 = new Doctor("��ġ��", "����");
		Patient pat1 = new Patient("��ȯ��", "����");
		doc1.introduce();
		doc1.report();
		pat1.introduce();
		pat1.report();
		// ��ĳ������ �ʿ��� ���� �ݵ�� import�� �ҷ��;� �Ѵ�.
	}
}