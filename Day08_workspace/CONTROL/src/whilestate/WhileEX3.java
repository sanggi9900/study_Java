package whilestate;

import java.util.Scanner;

public class WhileEX3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			// ���ڿ��� ��ġ���η� �޴��� ������ ���
			// - ��Ȯ�ϰ� ��ġ���� ������ ����� ������ ���� ����
			// - �����ϰ� ����, ���ο��� �ݺ��� �۵��ϱ� ������ ������
			System.out.print("���ұ�? ");
			String menu = sc.next();
			if (menu.equals("��ħ")) {
				System.out.println("Good Morning!");
			}
			else if (menu.equals("����")) {
				System.out.println("Good Afterning!!");
			}
			else if (menu.equals("����")) {
				System.out.println("Good Evening!!!");
			}
			else if (menu.equals("����")) {
				System.out.println("Bye Bye ~ !");
				break;
			}
			else System.out.println("WRONG INPUT ... ");
		}
	}
}