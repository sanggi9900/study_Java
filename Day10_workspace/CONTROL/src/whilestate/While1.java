package whilestate;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		// while�ݺ��� ����1 : ���ѹݺ�
		// - ���� ��ȭ�� �����̾�߸� �ݺ�Ƚ���� ������ �� ����
		// - ������ �Է¹޾ƾ߸� ������
		// 1) �ܺο� ������ �ִ� - �ݺ� ������
		// - ���� ���ϴ� ���� ��� �ޱ� ���� ���Է�
		// - if�� ����ϴ� ������� �����Ͽ� ������
		Scanner sc = new Scanner(System.in);
		int num = 1;	// ���ǻ��� : ������ �̸� �غ��� ��, �ʿ���� ������ �ʱ�ȭ�� �ؾ� ��
		while (num > 0) {
			System.out.print("0������ ������ �Է��ϼ��� >> ");
			num = sc.nextInt();
		}
		System.out.println("��� : " + num);
		
		// 2) ���ο� ������ �ִ� - �ݺ� ��
		// - "�޴�"�� ������ �� ����ϴ� �ݺ���
		// - �ڵ� ������ �ݺ������ϰ�, �ݺ��� ����Ǹ� ���α׷� ����
		while (true) { // true ����� : �ݺ��� ������ ���۽�Ű�� ���� ���ǽ�
			System.out.print("1. ���� / 2. ����\n>> ");
			int menu = sc.nextInt();
			if (menu < 1 || menu > 2) System.out.println("�߸��� �Է�...\n");
			else if (menu == 1) System.out.println("����!\n");
			else {
				// ������� break : �ݺ��� ���ӹ��ܰ迡�� �����Ű�� ���� ���
				// - ���ǹ��� ���� ��� ��
				System.out.println("����...\n");
				break;
			}
		}
	}
}





