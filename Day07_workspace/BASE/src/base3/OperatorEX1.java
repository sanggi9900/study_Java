package base3;

import java.util.Scanner;

public class OperatorEX1 {
	public static void main(String[] args) {
		// �ǽ�1
		// 3���� �Ǽ��� �Է��� �޾� �����ϰ�
		// 3���� �Ǽ������� ����� ����ϼ���.
		// �Ҽ��� 2�ڸ������� ����մϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("3���� �Ǽ� > ");
		double value1 = sc.nextDouble();
		double value2 = sc.nextDouble();
		double value3 = sc.nextDouble();
		
		System.out.println( "��� : " + ((value1 + value2 + value3) / 3) );
		
		// printf : ���Ĺ��� ������� ��ȯ�� ���
		System.out.printf( "��� : %.2f\n", (value1 + value2 + value3) / 3 );
		
		// Math.round : �ݿø��޼���
		double avg = (value1 + value2 + value3) / 3;
		System.out.println( "��� : " +  (Math.round(avg * 100)/100.0) );
		
		// String.format : ���Ĺ��ڸ� ������� ��ȯ�� ���ڿ��� �غ��ϴ� �޼���
		System.out.println( "��� : " +  String.format("%.2f", avg) );
			
	}
}