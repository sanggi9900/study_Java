package whilestate;

import java.util.Scanner;

public class WhileEXA {
	public static void main(String[] args) {
		// while �߰�����
		// ���� 2���� �Է��� �޾Ƽ� ù��°�� �ι�°�� ���� ���� ����ϴ� �ݺ�����
		// �����ϼ���.
		// ��, 2��° ������ 0�� ��쿡�� �ݺ��� ����˴ϴ�.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���� 2�� �Է� >> ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if (num2 != 0) {
				System.out.println("��� : " + (num1 / num2));
			}
			else {
				System.out.println("����");
				break;
			}
		}
	}
}