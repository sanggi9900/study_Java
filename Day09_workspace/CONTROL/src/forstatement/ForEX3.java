package forstatement;

import java.util.Scanner;

public class ForEX3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1) 3회 반복
		// 2) 전부 다 맞을 경우 3회 이하에서 반복 종료
		// 3) ID가 틀리면 비밀번호를 입력받지 않음
		/*
		int count = 3;
		while (count > 0){
			System.out.println("ID 입력 >> ");
			String id = sc.next();
			if (!id.equals("User")) {
				System.out.println("WRONG ID !!!");
			}
			else {
				System.out.println("PW 입력 >> ");
				String pw = sc.next();
				if (!pw.equals("it")) {
					System.out.println("WRONG PW ...");
				}
				else {
					break;
				}
				
			}
			count -= 1;
		}
		if (count == 0) System.out.println("LOGIN FAILED!");
		else System.out.println("LOGIN SUCCEED!");
		*/
		boolean result = false;
		for (int x = 3; x > 0; x -= 1) {
			System.out.println("ID 입력 >> ");
			String id = sc.next();
			if (!id.equals("User")) {
				System.out.println("WRONG ID !!!");
				continue;
			}
			System.out.println("PW 입력 >> ");
			String pw = sc.next();
			if (!pw.equals("it")) {
				System.out.println("WRONG PW ...");
				continue;
			}
			result = true;
			break;
		}
		if (result) System.out.println("LOGIN FAILED!");
		else System.out.println("LOGIN SUCCEED!");
	}
}
