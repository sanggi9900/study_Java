package ifstate;

import java.util.Scanner;

public class If03 {
	// ctrl + space : �ڵ��ϼ���� ���
	// - ���뱸�� ������, �̸� ȣ���� �� ����
	// - 1) main : ���θ޼��� �ڵ��ϼ� ���뱸
	// - 2) sysout : Sytem.out.println()
	
	// main ���� ctrl + space
	public static void main(String[] args) {
		// sysout ���� ctrl + space
		// System.out.println();
		
		// MAIN MENU - �������� ���Ƿ� �غ��ϰ�, �̸� ���� �� �ְ� ������ִ� ��
		// - �������� ��������?
		// 1) ���� : 1, 2, 3 �� �ԷµǾ��� �� ������ ���� ���ǹ����� ����
		// 2) ���� : 'A', 'B', 'C' �� ������ ������ �����ϴ� ����
		// 3) ���ڿ� : �ܾ ���� ������ �޸��ϴ� ����
		
		// # �� �Է��ϸ� ���� �Ǵ��� �˷���� ��
		System.out.print("1. ���� / 2. ����\n>> ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if (menu <= 0 || menu >= 3) System.out.println("�߸��� �Է��Դϴ�.");
		else {
			if (menu == 1) System.out.println("1�� �Է����� �� ����Ǵ� �ڵ�");
			else System.out.println("2�� �Է����� �� ����Ǵ� �ڵ�");
		}
	}
}







