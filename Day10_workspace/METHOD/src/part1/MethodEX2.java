package part1;

import java.util.Scanner;

public class MethodEX2 {
	// �̸� �����ϴ� �޼��带 �����ϼ���.
	// �޼���� �Է��� ���������� ���� ���ؼ� ��ȯ�մϴ�.
	public static int getSum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� ���� �Է� >> ");
		int num = sc.nextInt();
		
		int result = 0;
		for (int i = ((num > 0) ? num : -num) ; i > 0; i -= 1) {
			result += i;
		}
		
		return ((num > 0) ? result : -result);
	}
	
	public static void main(String[] args) {
		int result1 = getSum();
		int result2 = getSum();
		System.out.println("ù��° �� : " + result1);
		System.out.println("�ι�° �� : " + result2);
	}
}