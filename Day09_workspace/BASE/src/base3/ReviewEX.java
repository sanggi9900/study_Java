package base3;

import java.util.Scanner;

public class ReviewEX {
	public static void main(String[] args) {
		// ��������
		// 1) ȭ�鿡 ���̴� �ҽ��ڵ带 ���� ��Ű�� �� �ҽ������� �����ϼ���.
		// 2) �̸��� ����, ����, ���� ������ ������ �Է��� �޾� ������ �����մϴ�.
		// 3) ����� ���� �Ʒ� �������ó�� ����ϼ���.
		
		// # ������� - ���Ĺ��ڸ� �̿��� ĭ���� �����ؼ� �����մϴ�.
		// ����ǥ - ���浿
		// ���� :  98��
		// ���� : 100��
		// ���� :   5��
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� > ");
		String name = sc.next();
		System.out.print("���� ���� > ");
		int kor = sc.nextInt();
		System.out.print("���� ���� > ");
		int eng = sc.nextInt();
		System.out.print("���� ���� > ");
		int mat = sc.nextInt();
		
		System.out.printf(
				"����ǥ - %s\n"
				+ "���� : %3d��\n"
				+ "���� : %3d��\n"
				+ "���� : %3d��\n",
				name, kor, eng, mat);
		
	}
}










