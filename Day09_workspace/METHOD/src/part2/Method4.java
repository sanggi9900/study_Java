package part2;

import java.util.Scanner;

public class Method4 {
	// 4) ��ȯ�� �Ű������� �ִ� �޼��� : ��ȯ�� ���� �� ���ǻ��� + �Ű������� ���� �� ���ǻ���
	// - ���� ���� ����� ���� �޼���
	// - �Ű������� �ڵ��� ������ �ٲٴ� �ɼ�ó�� ���� �� ����
	// - ��ȯ�� �ڵ��� ���ۿ��θ� üũ�� �� �ִ� ���°����� ���� �� ����
	public static boolean program(int n1, int n2, boolean option) {
		// option �Ű������� ���� �Է¿��� ����
		if (option) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ���� �����ϰ� �Է� >> ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		if (n2 == 0) {
			System.out.println("����Ұ�");
			return true;	// ������ �߻��ؼ� true�� ��ȯ
		}
		else {
			System.out.println("��� : " + (n1 / n2));
			return false;	// ������ ��� false�� ��ȯ
		}
	}
	
	public static void main(String[] args) {
		program(15, 7, false);
		program(15, 0, false);
		while (true) {
			if (program(0, 0, true)) break;
		}
	}
}