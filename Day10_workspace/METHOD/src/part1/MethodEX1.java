package part1;

import java.util.Scanner;

public class MethodEX1 {
	// �⺻ �޼���� ���������� ���簡 ���� ����
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 �Է� >> ");
		int n1 = sc.nextInt();
		System.out.print("����2 �Է� >> ");
		int n2 = sc.nextInt();
		
		System.out.println("�� : " + (n1 + n2));
		System.out.println("�� : " + (n1 - n2));
		System.out.println("�� : " + (n1 * n2));
		
		// ����
		if (n2 == 0) System.out.println("�� : ����Ұ�");
		else System.out.println("�� : " + (n1 / n2));
		
		// ����1) ���� �̿��ϱ�
		String result = "";
		if (n2 == 0) result = "����Ұ�";
		else result = result + (n1 / n2);
		System.out.println("�� : " + result);
		
		// ����2) ���� �����ڸ� �̿��� : ���� ��� �غ�����
		System.out.println( "�� : " + ( (n2 == 0) ? "����Ұ�": (n1/n2) ) ); 
	}
	public static void main(String[] args) {
		calculator();
	}
}








