package ifstate;

import java.util.Scanner;

public class IfEXB {
	// ��������
	// ���Կ� ���θ� �ֹ����� �� ������ ���� ������ ����ϴ� �ڵ带 �ϼ���.
	// 100�� �̸��� �������� �����ϴ�.
	// 200�� �̸��� �������� 15%�Դϴ�.
	// 300�� �̸��� �������� 30%�Դϴ�.
	// 300�� �̻��� �������� 35%�Դϴ�.
	// ������ ���� ������ 900���Դϴ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է��ϼ��� > ");
		int count = sc.nextInt();
		
		int cost = count * 900;
		if (count >= 300) cost *= 0.65;
		else if (count >= 200) cost *= 0.7;
		else if (count >= 100) cost *= 0.85;
				
		System.out.println("���� ���� : " + cost + "��");
	}
}







