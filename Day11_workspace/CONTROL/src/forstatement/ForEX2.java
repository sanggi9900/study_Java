package forstatement;

import java.util.Scanner;

public class ForEX2 {
	public static void main(String[] args) {
		// ������ - ������� ���׿����� �ϳ��� �и��Ͽ� ������������ ��ȯ
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print("��� �Է� >> ");
			num = sc.nextInt();
			if (num > 0 ) {
				System.out.println("�ùٸ� ���Դϴ�.");
				break;
			}
		}
		int result = 0;
		while (num > 0) {
			result += num;
			num -= 1;
		} System.out.println("while�� �̿��� �� : " + result);
		
		// �ٸ� ������� �Է��� ����
		int num1 = 0;
		while (num1 <= 0) {
			System.out.println("��� �Է� >> ");
			num1 = sc.nextInt();
		} System.out.println("�ùٸ� ���Դϴ�.");
		
		int result1 = 0;
		for (int x = num1; x > 0; x -= 1) {
			result1 += x;
		} System.out.println("for�� �̿��� �� : " + result1);		
	}
}