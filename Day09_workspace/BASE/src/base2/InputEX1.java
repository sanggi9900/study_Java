package base2;

import java.util.Scanner;

// ctrl + shift + o : �ʿ��� import �ڵ带 �ڵ����� ä����

public class InputEX1 {
	public static void main(String[] args) {
		// �ǽ�
		// ����, ����, ���� ������ �ϳ��� �Է��� �޾� �����ϰ�
		// �̸� �Ʒ��� ���� ����ϼ���.
		// ��¿���
		// ���� ������ 97.0���̰�, ���� ������ 98.2���Դϴ�.
		// ������ 100.0���Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� > ");
		double score1 = sc.nextDouble();
		System.out.print("���� ���� > ");
		double score2 = sc.nextDouble();
		System.out.print("���� ���� > ");
		double score3 = sc.nextDouble();
		System.out.println(
				"���� ������ " + score1 + "���̰�, ���� ������ " + score2 + "���Դϴ�.\n"
				+ "������ " + score3+"���Դϴ�."
				);
	}
}







