package base2;

import java.util.Scanner;

public class InputEX2 {
	public static void main(String[] args) {
		// �ǽ�
		// 1) �濪�� ����1, �濵�� ����2, �濵�� ������
		//    �������(A ~ F, +, - ����)�� �Է��� �޾� �����մϴ�.
		// 2) �濵�� ���� ������ ���� ������ �ڸ�Ʈ�� �Է��� �޾� �����մϴ�.
		
		// 3) �Է¹��� ������ �Ʒ��� ���� ����ϼ���.
		
		// # ��� ���� #
		// �߰����� ���
		// �濵�� ����1 : F, �濵�� ����2 : A
		// �濵�� ���� : C - ���������� ������ �� ���׿�.
		
		// ���� : ���� �������, ���ڰ� �ʿ��� ��Ȳ���� �ƴ��� �� �����غ��� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�濵�� ����1 ���� > ");
		char rank1 = sc.next().charAt(0);
		System.out.print("�濵�� ����2 ���� > ");
		char rank2 = sc.next().charAt(0);
		System.out.print("�濵�� ���� ���� > ");
		char rank3 = sc.next().charAt(0);
		System.out.print("���� �ڸ�Ʈ > ");
		sc.nextLine();
		String comment = sc.nextLine();
		System.out.println(
				"�濵�� ����1 : " + rank1 + ", �濵�� ����2 : " + rank2
				+ "\n�濵�� ���� : " + rank3 + " - " + comment);
		// �����ٰ� Ȯ���� �� ��쿡��....
		sc.close();
	}
}





