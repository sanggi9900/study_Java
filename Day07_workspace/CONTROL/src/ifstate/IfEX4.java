package ifstate;

import java.util.Scanner;

public class IfEX4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번 성적 >> ");
		double score1 = sc.nextDouble();
		System.out.print("2번 성적 >> ");
		double score2 = sc.nextDouble();
		System.out.print("3번 성적 >> ");
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
			char rank = '\0'; // '\0' == NULL == 정수0
		
			if (avg >= 90) rank = 'A';
			else if (avg >= 80) rank = 'B';
			else if (avg >= 70) rank = 'C';
			else rank = 'F';
		
			System.out.printf(
				"평균 : %.1f점( %c랭크 )\n"
				+ "1번차이 : %.1f\n"
				+ "2번차이 : %.1f\n"
				+ "3번차이 : %.1f\n", avg, rank, score1 - avg,  score2 - avg, score3 - avg
				);
		}
		else System.out.println("잘못된 점수입니다.\n");
	}
}






