package base3;

import java.util.Scanner;

public class OperatorEX2 {
	public static void main(String[] args) {
		// �ǽ�2
		// - �Ǽ����� �ϳ��� �Է��� �޾Ƽ�
		// �����ο� �Ǽ��θ� ������ �������ó�� ����ϼ���.
		
		// �������(3.98 �Է½�)
		// ������ : 3
		// �Ǽ��� : 0.98
		// # �Ǽ��δ� �Ҽ����� �� ���� ���� �� �ְ�, �״�� ����Ͻø� �˴ϴ�.
		// # ���� -> �Ǽ� ����ȯ : 3 -> 3.0
		// # �Ǽ� -> ���� ����ȯ : 3.9999999 -> 3
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǽ� �ϳ� �Է� >> ");
		double value = sc.nextDouble();
		System.out.println("������ : " + (int)value);
		System.out.println("�Ǽ���1 : " + (value % 1) );
		System.out.println("�Ǽ���2 : " + (value - (int)value));
		
	}
}









