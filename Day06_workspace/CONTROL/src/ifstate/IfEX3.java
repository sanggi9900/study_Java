package ifstate;

import java.util.Scanner;

public class IfEX3 {
	// �ڵ��ϼ������ ���Ʒ� ����Ű�� ��� ���͸� ������ ���� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A. HELLO\nB.GOOD BYE\n>> ");
		char menu = sc.next().charAt(0);
		// �� : ���ڵ� �ᱹ �����̴� ũ�� �� ����������...
		//     ũ�� �񱳸� �ҰŸ�, ������ �� ������
		//     ���ڴ� ������ ���� ������ ��ġ/����ġ�� üũ�ϴ°� ����
		if (menu == 'A') System.out.println("HELLO");
		else if (menu == 'B') System.out.println("GOOD BYE");
		else System.out.println("�߸��� �Է�");
		
		System.out.println("���α׷� ����");
	}
}