package forstatement;

import java.util.Scanner;

public class ForEX3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1) 3ȸ �ݺ�
		// 2) ���� �� ���� ��� 3ȸ ���Ͽ��� �ݺ� ����
		// 3) ID�� Ʋ���� ��й�ȣ�� �Է¹��� ����
		/*
		int count = 3;
		while (count > 0){
			System.out.println("ID �Է� >> ");
			String id = sc.next();
			if (!id.equals("User")) {
				System.out.println("WRONG ID !!!");
			}
			else {
				System.out.println("PW �Է� >> ");
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
			System.out.println("ID �Է� >> ");
			String id = sc.next();
			if (!id.equals("User")) {
				System.out.println("WRONG ID !!!");
				continue;
			}
			System.out.println("PW �Է� >> ");
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