package ifstate;

import java.util.Scanner;

public class If02 {
	public static void main(String[] agrs) {
		// if�� ���� : ���ǹ� ���ο� ���ǹ� �ۼ��ϱ�
		// - �ڷ��� ó���� �� �� �ϳ��� ������ �� ����
		// - else�ʿ� �ۼ��Ͽ� �÷���� ��
		//   -> �̷��� else if�� ����� �� ����
		// - ���� �Ŀ� �̻��� ��� ���� ���ġ�� �ʿ���
		//   -> ����� ���� ���� ���� ���� ���� ���� üũ�Ѵ�.
		//   -> ���� ������� ���� ���� üũ�ϰ� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int score = sc.nextInt();

		// ä�� ���𰡸� �ɷ�����, ���ǹ��� �����ϴ� ���� ����
		// - �������� else�� �ֳ�? ����? �� ���� �ߺ����Ű� ������
		char rank = '\0';
		     if (score >= 90) rank = 'A';
		else if (score >= 80) rank = 'B'; 
		else if (score >= 70) rank = 'C';	
		else if (score >= 60) rank = 'D'; 
		else                  rank = 'F';
		System.out.println(rank + "���");
		// ������ �޶����� F���� üũ�ص� ����. �� ���ǽ��� �޶���
		     if (score < 60) rank = 'F';
		else if (score < 70) rank = 'D';
		else if (score < 80) rank = 'C';
		else if (score < 90) rank = 'B'; 
		else                 rank = 'A';
		System.out.println(rank + "���");
	}
}






