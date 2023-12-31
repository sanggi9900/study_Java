package part2;

public class OverloadEX4 {
	public static void showNumber(int n1) {
		showNumber(1, n1);
	}
	public static void showNumber(int n1, int n2) {
		showNumber(n1, n2, 1);
	}
	public static void showNumber(int n1, int n2, int n3) {
		if (n3 == 0) System.out.println("출력할 값이 없습니다.");
		else if (n1 > n2 && n3 > 0) System.out.println("출력할 값이 없습니다.");
		else if (n2 > n1 && n3 < 0) System.out.println("출력할 값이 없습니다.");
		else {
			// n1 <= n2 && n3 > 0 || n1 >= n2 && n3 < 0
			for (int a = n1; a <= n2; a += n3) {
				System.out.print( " " + a );
			} System.out.println(" 출력종료");
		}
	}
	
	public static void main(String[] args) {
		showNumber( 0 );
		showNumber( 10, 9 );
		showNumber( 10, 9, 2 );
		showNumber( 10, 20, -2 );
	}
}
