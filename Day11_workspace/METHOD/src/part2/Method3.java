package part2;

import java.util.Scanner;

public class Method3 {
	// 3) �Ű������� �ִ� �޼���
	// - �Ű����� �ڸ����� void�� ä�� �� ����. ����� �� ����.
	// - �Ű������� �߰������ν� �ʿ��� ���� ������� ���ְ� ���� �� ����.
	// - ���� �ҷ����� �뵵�� �ƴ϶�, ���� ����ޱ� ���� �޼����� �����̴� ����.
	public static void test(int num1, int num2) {
		if (num2 == 0) System.out.println("����Ұ�");
		else System.out.println("��� : " + (num1 % num2));
	}
	public static void main(String[] args) {
		// ȣ�� : �޼����(�ʿ��� ��1, ��2, ��3, ...);
		test(10, 4);
		// �Ű������� �ִ� �޼���� �Է��� �ź��ϴ� ���� �ƴ϶�, ������ �� �ְ� ���ִ� ��
		// -> �ڷῡ ���ؼ� ���뼺�� �ο��ϰ� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2�� �Է� >> ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		test(n1 + n2, n1 - n2);
	}
}



