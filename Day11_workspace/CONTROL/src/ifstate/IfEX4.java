package ifstate;

import java.util.Scanner;

public class IfEX4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�� ���� >> ");
		double score1 = sc.nextDouble();
		System.out.print("2�� ���� >> ");
		double score2 = sc.nextDouble();
		System.out.print("3�� ���� >> ");
		double score3 = sc.nextDouble();
		
		boolean result = true;
		result = result && score1 >= 0;
		result = result && score1 <= 100;
		result = result && score2 >= 0;
		result = result && score2 <= 100;
		result = result && score3 >= 0;
		result = result && score3 <= 100;
		if ( result ) {
			double avg = (score1 + score2 + score3) / 3;
			char rank = '\0'; // '\0' == NULL == ����0
		
			if (avg >= 90) rank = 'A';
			else if (avg >= 80) rank = 'B';
			else if (avg >= 70) rank = 'C';
			else rank = 'F';
		
			System.out.printf(
				"��� : %.1f��( %c��ũ )\n"
				+ "1������ : %.1f\n"
				+ "2������ : %.1f\n"
				+ "3������ : %.1f\n", avg, rank, score1 - avg,  score2 - avg, score3 - avg
				);
		}
		else System.out.println("�߸��� �����Դϴ�.\n");
	}
}





