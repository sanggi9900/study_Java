package ifstate;

import java.util.Scanner;

public class IfEXA {
	// 추가문제1
	// 양수 하나를 입력을 받습니다. 입력을 받은 양수에 대해
	// 2부터 5까지의 정수중에서 약수가 있는지 여부를 판별하여 모두 출력하세요.
	// # 0이하의 값이 들어오면 판별하지 않습니다.
	
	// # 결과예시1( -5 입력시 )
	// 0이하의 값은 판별 대상이 아닙니다.
	
	// # 결과예시2( 4 입력시 )
	// 2는 맞습니다.
	// 3은 아닙니다.
	// 4는 맞습니다.
	// 5는 아닙니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 판별해볼 양수 >> ");
		int num = sc.nextInt();
		// 제일 먼저 필요없는 것을 걸러내는 선택을 수행
		// - 이 때 다양한 결과가 많이 나오는 쪽을 else로 몰아서 구성 
		if (num <= 0) System.out.println("0이하의 값은 판별 대상이 아닙니다.");
		else {
			// 내부에서 값에 대한 판별을 진행
			// if ~ else는 2지선다 선택
			// else if 는 이러한 if ~ else를 다시 종속문으로 추가 
			// else if가 늘어날수록 선택지가 늘어나지만, 종속되었으니 하나만 실행됨
			if (num % 2 == 0) System.out.println("2는 맞습니다.");
			else System.out.println("2는 아닙니다.");
			
			if (num % 3 == 0) System.out.println("3는 맞습니다.");
			else System.out.println("3는 아닙니다.");
			
			if (num % 4 == 0) System.out.println("4는 맞습니다.");
			else System.out.println("4는 아닙니다.");
			
			if (num % 5 == 0) System.out.println("5는 맞습니다.");
			else System.out.println("5는 아닙니다.");

		}
	}
}



