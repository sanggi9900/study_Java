package ifstate;

import java.util.Scanner;

public class IfEX1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� >> ");
		int value = sc.nextInt();
		if (value >= 0) {
			System.out.println("�Էµ� �� : " + value);
		}
		else {
			System.out.println("�Էµ� �� : " + value + "\n�����Դϴ�.");
		}
		// if + else�� ���� : �ߺ�����
		// - �ߺ����� ���߿� �� �� ���� ���ǹ��� �����.
		// - �� �� ������ ������
		// # if �ܵ���� : �ߺ� ���Ÿ� �ϴٺ��� ������
		// - if / else �� �� �ϳ����� �� ���� ����
		// - "�߰�" �� �������� ������ ������ �� ����
		System.out.println("�Էµ� �� : " + value);
		if (value < 0) {
			System.out.println("�����Դϴ�.");
		}
	}
}








