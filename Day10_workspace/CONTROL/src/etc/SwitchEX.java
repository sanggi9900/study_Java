package etc;

import java.util.Scanner;

public class SwitchEX {
	public static void main(String[] args) {
		// ����ġ ��� : ���ÿ� �ش������� ���ߵ� ���
		// - if�� ������� �� ������ ���� : �������� �������� ������.
		// - �������� �������� ������ ������ �� �ִ� ������ ���� ����� �غ���.
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1, 2, 3, 4 >> ");
			int menu = sc.nextInt();
			// ����ġ�� ���ǻ��� : ��ġ���θ� ������� üũ��
			// - �������� ������ ���� �� �ִ� �� ����ü�� �䱸��
			//   ���� / ������ �ַ� �����
			if (menu== 4) {
				System.out.println("����!!!!");
				break;
			}
			else {
				// �ݵ�� �ܺο�, ���Ḧ ���� ���ǹ�/��ġ�� �غ��ϼž� ��
				switch(menu) {
				
				case 1:		// ��ӵ� ǥ��. �ڵ带 ������ ��ġ�� ǥ���ϱ� ���� �±�
					System.out.println("1�� ���!");
					break;	// ����ġ�� �߰��� �����Ű�� ������� ����
				case 2:
					System.out.println("2�� ���!!");
					break;
				case 3:
					System.out.println("3�� ���!!!");
					break;
				default:
					// default�� case���� ��ġ�ϴ� �͵��� ���� ���� �������̸�..
				    // ��� �־ �� �������
					System.out.println("�߸��� ����!!!!");
					break;
					// break�� �ظ��ϸ� �׻� ���� ��
				}
			}
		}
	}
}