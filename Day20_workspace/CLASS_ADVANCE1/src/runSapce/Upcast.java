package runSapce;

import classSpace.Doctor;
import classSpace.Human;

public class Upcast {
	public static void EX1() {
		// UPCASTING : �ڽ� ��ü�� �θ� ���������� ����ϱ�
		Doctor doc1 = new Doctor("��浿", "��οܰ�");
		Doctor doc2 = new Doctor("�����", "�����ܰ�");
		Human pat1 = new Human("�����", "ȯ��", 32);
		
		Human pat2 = doc2; // ��ĳ���� �ڵ� : �θ� �������� = �ڽİ�ü
		// �������̵��� �޼���� �������̵��� ������ �״�� ������
		System.out.println(pat2.getName());
		System.out.println(pat2.getRoll());
		// DoctorŬ�������� �߰��� �޼���� ����� �� ���� ��
		pat2.greeting();
		// + ��Ű���� ��������� �����ϰ� �����ϸ�
		//   �޼����� ������ �� �����ϰ� ������ �� ����
		doc1.greeting(doc2);
		// -> �� ���� ���� �����ε����ε� ��ü�� �ٷ� �� �ְ� ��
	}
	
	public static void EX2() {
		// DOWNCASTING : �׷��� ����ϴ� ��ü�� �ٽ� ���� ���·� ������Ű��
		Human person = new Doctor("����", "�Ϲݿܰ�");
		// UPCASTING�� �θ�/�ڽ�Ŭ������ ������ �����ϴ� �ݸ�...
		// DOWNCASTING�� ������ �������� ����
		Doctor doc = (Doctor)person;
		System.out.println(doc.getName());
		
		// ��ü�� ���ʷ� ������� ��ġ�� ������
		// - Upcasting�� ������� ��ġ���� �ٸ� �޼���(����)���� �̵���ų ��
		//   �� �޼��忡�� �� ���� ������ ���� ��ġ�� �ٽ� �ǵ��� �´�.
		// - Downcasting�� �ٸ� ������ ������� ���� �� ��ġ�� �ڸ���ƾ� �� ��
		//   �ش� ��ġ���� ���� ������ �����ؾ� �� �� �߻��Ѵ�.
	}
	
	public static void main(String[] args) {
		// ����� ���� ���ǵ� Ŭ������ ������� ��ü�� ĳ����
		// UPCASTING : �ڽ� ��ü�� �θ� ���������� ����ϱ�
		EX1();
		// DOWNCASTING : �׷��� ����ϴ� ��ü�� �ٽ� ���� ���·� ������Ű��
		EX2();
	}
}





