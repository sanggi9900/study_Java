package controlflow;

import java.util.Scanner;

public class LoopEX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0; // ��¥�� �̰� ������
		int num2 = 0; // ���������?
		while (true) {
			System.out.print("���� 2�� �Է� >> ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 < num2) {
				System.out.println("ù��°�� �۽��ϴ�.");
			}
			else {
				// ���ǹ��� ��Ȱ���ϴ� ���·� ���� ȿ�����̴�.
				break;
			}
		}
		System.out.printf("%d - %d = %d\n"
				, num1, num2, num1 - num2);
	}
}