package part1;

import java.util.Scanner;

public class Method2 {
	// 2) ��ȯ���� �����ϴ� �޼��� : ����(�޸�, �ٸ� �޼��� ����, ����)�� ����ϴ� �޼���
	// - 2�� �̻��� �Ұ����ϱ� ������, ���� ��ġ�� �ִ� �ϳ��� ������ ��
	public static boolean getResult() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID > ");
		String id = sc.next();
		if (!id.equals("USER")) return false;
		else {
			System.out.print("PW > ");
			String pw = sc.next();
			if (!pw.equals("1234")) return false;
			else return true;
		}
	}
	
	public static void main(String[] args) {
		// �޼���� ��򰡿� ���ӵ� ����� ����
		// - �װͰ� ������ ������ �����Ǹ� �ȵ�
		// - �⺻�����
		//   �ش� �޼��忡�� ������ ���� �̿��� �� ���ٴ� ������ ������
		//   -> ��ȯ���� ���� �̸� �ذ����ְ�, �̸� ���� return�� �̿���
		//   �ܺο� �����ϴ� ���� �����ͼ� �̿��� �� ���ٴ� ������ ������
		boolean result = false;
		for (int i = 1; i <= 3; i += 1) {
			result = getResult();
			if (result) break;
			else System.out.println("LOGIN ����!");
		}
		System.out.println(result + "�� �̿��� ������ ������ ������");
	}
}



