package base4;

import java.util.Scanner;

public class OperatorEX3 {
	public static void main(String[] args) {
		// �ǽ�����3
		// - ���� �ǽ��� ����� ��Ű���� �����ϰ�, �ҽ������� �غ��ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		// 1) ���� 2���� �Է��� �޾Ƽ� ù��°�� �Է��� ������ �ι�°�� �Է��� ��������
		//   �� ū�� �´��� ���θ� ����ϼ���.
		System.out.print("���� 2�� �Է� >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("���1 : " + (num1 > num2));

		// 2) ���� 2���� �Է��� �޾Ƽ� �� ���ڰ� ���� ���� �������� ���θ� ����ϼ���.
		System.out.print("����1 �Է� >> ");
		char ch1 = sc.next().charAt(0);
		System.out.print("����2 �Է� >> ");
		char ch2 = sc.next().charAt(0);
		System.out.println("���2 : " + (ch1 == ch2));
		
		// 3) �Ǽ����� �ϳ� �Է��� �޾� �����ο� �Ǽ��η� ������ �����ϰ�
		//    �����ο� �Ǽ����� ���� 1���� �۰ų� ������ ���θ� ����ϼ���.
		System.out.print("�Ǽ��� > ");
		double value = sc.nextDouble();
		System.out.println("���3 : " + ((int)value * (value % 1)  <= 1));
		
		sc.close();
	}
}





