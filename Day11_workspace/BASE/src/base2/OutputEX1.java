package base2;

public class OutputEX1 {
	public static void main(String[] args) {
		// �ǽ�����
		// �Ʒ��� ���� �������� ������ �����ϰ� �ʱ�ȭ�� ���� ����ϼ���.
		String name = "���浿";
		int age = 43;
		String hobby = "�Ѹ� ��������";
		
		// �̸� : <������ ����� ��1>
		// ���� : <������ ����� ��2>��
		// ��� : <������ ����� ��3>
		System.out.println("�̸�\t: " + name);
		System.out.println("����\t: " + age + "��");
		System.out.println("���\t: " + hobby);
		// <��1>�� ���̴� <��2>���̰�, ��̴� <��3>�Դϴ�.
		System.out.printf("%s�� ���̴� %d���̰�, ��̴� %s�Դϴ�.\n", name, age, hobby);
	} 
}






