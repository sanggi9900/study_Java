package forstatement;

import java.util.Scanner;

public class ForEX4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = -1;
		while (true) {
			System.out.print("�Է�Ƚ�� >> ");
			num = sc.nextInt();
			if (num < 0) System.out.println("���Է��ϼ���.");
			else break;
		}
		
		double result = 0;
		for (int x = 1; x <= num; x += 1) {
			System.out.print(x +"�� �Ǽ��� >> ");
			result += sc.nextDouble();
		}
		System.out.println("������ �� : " + result);
		
	}
}