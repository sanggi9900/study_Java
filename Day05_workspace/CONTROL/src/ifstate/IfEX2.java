package ifstate;

import java.util.Scanner;

public class IfEX2 {
	public static void main(String[] args) {
		// ��Ű�� ���� �߰����� �ʰ� ���� ���� �Ϳ�
		// �״�� �̾ �ۼ��մϴ�.
		// �ҽ����ϸ� �߰��Ͻð�
		// PDF 2�� ���� Ǯ�����.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǽ��� 2�� >> ");
		double value1 = sc.nextDouble();
		double value2 = sc.nextDouble();
		
		int order = 0;
		double max_value = 0;
		double diff = 0;
		// �ߺ����Ž� ���ǻ��� : if�� if������ �� �� ����
		// -> if�� if�� ���� ����� ���� �ְ�, �ȵ� �� ����
		if (value1 > value2) {
			order = 1;
			max_value = value1;
			diff = value1 - value2;
		}
		else {
			order = 2;
			max_value = value2;
			diff = value2 - value1;
		}
		System.out.printf("%d��°�� �Է���\n"
				+ "%.1f�� %.1f��ŭ �� Ů�ϴ�.\n", order, max_value, diff);
	}
}