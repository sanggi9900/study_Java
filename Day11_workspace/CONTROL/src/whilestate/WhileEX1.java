package whilestate;

import java.util.Scanner;

public class WhileEX1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �Է¹��� ���� ���� ���� �Ǻ��ؼ� �˷��� ������ ������
		// ���� ȿ�������� �۵���
		int num1 = 0;
		while (num1 % 2 == 0) {
			System.out.print("Ȧ�� �Է� >> ");
			num1 = sc.nextInt();
		}
		System.out.println("�غ�� �� : " + num1);
		
		// �Է¹��� ���� ���� �Ǻ��ؼ� ������� ������ ������
		// �Ʊ��ϱ� ��Ȱ����
		int num2 = 0;
		while (true) {
			System.out.print("Ȧ�� �Է� >> ");
			num2 = sc.nextInt();
			if (num2 % 2 != 0) break;
			// else System.out.println("Ȧ���� �Է����ּ��� / �߸� �ԷµǾ����ϴ�.");
		}
		System.out.println("�غ�� �� : " + num2);
	}
}