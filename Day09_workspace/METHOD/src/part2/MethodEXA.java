package part2;

import java.util.Scanner;

public class MethodEXA {
	// ��������
	// 1) �������� �ϳ� �Է��� �ް�, �� ���� Ȧ������ ¦������ ���θ� ��ȯ�ϴ�
	//    ���� �޼��带 �����ϼ���.
	//    �޼������ function1�� �մϴ�.
	// 2) �������� �ϳ� �Է��� �ް�, �� ������ ����� ������ ���Ͽ� ��ȯ�ϴ�
	//    ���� �޼��带 �����ϼ���.
	//    �޼������ function2�� �մϴ�.
	public static boolean function1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¦Ȧ�Ǻ��� >> ");
		int num = sc.nextInt();
		return num % 2 == 0;
	}
	public static int function2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������ ���� ���� >> ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i<=num;i+=1) {
			if (num % i == 0) count += 1;
		} return count;
	}
	public static void main(String[] args) {
		// ���� �ڵ�
		boolean result = function1();
		System.out.println("��� : " + result);
		
		int count = function2();
		System.out.println("��� : " + count + "��");
	}
}