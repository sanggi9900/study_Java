package base3;

import java.util.Scanner;

public class Operator3 {
	public static void main(String[] args) {
		// ���迬����
		int num1 = 10;
		int num2 = 3;
		System.out.println("���1 : " + (num1 >  num2));
		System.out.println("���2 : " + (num1 >= num2));
		System.out.println("���3 : " + (num1 <  num2));
		System.out.println("���4 : " + (num1 <= num2));
		System.out.println("���5 : " + (num1 == num2));
		System.out.println("���6 : " + (num1 != num2));
		
		// ���ǻ���1 - �����ڷ����� ����
		System.out.println("A" == "A");
		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();	// ����ô� �޼��带 ���ؼ� ���ؾ߸� ��
		String word2 = sc.next();	// �����ڷδ� ���� �� ����
		System.out.println(word1 == word2);
		
		// ���ǻ���2 - ���迬���ڴ� ���ӻ�� �Ұ�
		// - �Ǽ� ������ ���� �������˿��� �����ϰ� ����
		// int x = 10;
		// System.out.println( 5 < x < 20 );
		
		// ���������� - �������� �ϳ��� ��ġ�� ���� ������
		
		// 1) ������ && : ���ǽĵ��� �����ϴ� ������ ��
		// - ex) ���ݺ񱳻���Ʈ����, �귣��� ��Ÿ �ٸ� �ɼ��� ���ÿ� �˻��� ��
		int x = 10;
		System.out.println( x > 5 && x < 20 );
		
		// 2) ������ || : ���ǽĵ��� �ϳ��̻� �����ϴ� �͵�
		// - ex) ���� �ɼ� ������ ���� �ٸ� �͵��� ���ÿ� �˻��� ��
		System.out.println( x > 5 || x < 20 );
		
		// 3) ���������� ! : ���ǽ��� ��Ȱ��
		boolean result = x > 5 && x < 20;
		System.out.println(result);
		System.out.println(!result); // x <= 5 || x >= 20
	}
}





