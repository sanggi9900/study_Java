package ifstate;

import java.util.Scanner;

public class IfEXA {
	// �߰�����1
	// ��� �ϳ��� �Է��� �޽��ϴ�. �Է��� ���� ����� ����
	// 2���� 5������ �����߿��� ����� �ִ��� ���θ� �Ǻ��Ͽ� ��� ����ϼ���.
	// # 0������ ���� ������ �Ǻ����� �ʽ��ϴ�.
	
	// # �������1( -5 �Է½� )
	// 0������ ���� �Ǻ� ����� �ƴմϴ�.
	
	// # �������2( 4 �Է½� )
	// 2�� �½��ϴ�.
	// 3�� �ƴմϴ�.
	// 4�� �½��ϴ�.
	// 5�� �ƴմϴ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Ǻ��غ� ��� >> ");
		int num = sc.nextInt();
		// ���� ���� �ʿ���� ���� �ɷ����� ������ ����
		// - �� �� �پ��� ����� ���� ������ ���� else�� ���Ƽ� ���� 
		if (num <= 0) System.out.println("0������ ���� �Ǻ� ����� �ƴմϴ�.");
		else {
			// ���ο��� ���� ���� �Ǻ��� ����
			// if ~ else�� 2������ ����
			// else if �� �̷��� if ~ else�� �ٽ� ���ӹ����� �߰� 
			// else if�� �þ���� �������� �þ����, ���ӵǾ����� �ϳ��� �����
			if (num % 2 == 0) System.out.println("2�� �½��ϴ�.");
			else System.out.println("2�� �ƴմϴ�.");
			
			if (num % 3 == 0) System.out.println("3�� �½��ϴ�.");
			else System.out.println("3�� �ƴմϴ�.");
			
			if (num % 4 == 0) System.out.println("4�� �½��ϴ�.");
			else System.out.println("4�� �ƴմϴ�.");
			
			if (num % 5 == 0) System.out.println("5�� �½��ϴ�.");
			else System.out.println("5�� �ƴմϴ�.");

		}
	}
}


