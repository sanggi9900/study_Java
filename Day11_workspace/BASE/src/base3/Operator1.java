package base3;

public class Operator1 {
	public static void main(String[] args) {
		// ��������� : ���ڸ� ������� �� ���� �������� ������ ������
		// - ������� �Ұ�ȣ�� �����ּž� ��
		int num1 = 10;
		int num2 = 3;
		// ���� ������ ���� ����Ұ��� ����.
		// - ���ѻ����� ������ : ���������� �������
		System.out.println("���1 : " + (num1 + num2));
		System.out.println("���2 : " + (num1 - num2));
		System.out.println("���3 : " + (num1 * num2));
		System.out.println("���4 : " + (num1 / num2));
		System.out.println("���5 : " + (num1 % num2));

		// �������� ������ ���̸� ������ - �ڷ����� �����ؾ� ��
		double result1 = num1 / num2;	// �ڹ��� �ڵ�����ȯ�� Ư¡
		// int result2 = num1 / 3.1;		// - Ŀ���⸸ ��. �۾����� �ڵ�����ȯ�� ����
		
		// ����ȯ ������ : �ʿ��� ���·� ���� ������ 1ȸ������ �ٲ�
		int result2 = num1 / (int)3.1;	// ������������ ���� �ڷ����� ������ ���
		int result3 = (int)(num1 / 3.1);// �ݵ�� ����ȯ�� �����ϼž� ��
		System.out.println("���6 : " + result1);
		System.out.println("���7 : " + result2);
		
	}
}








