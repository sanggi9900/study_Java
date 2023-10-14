package base2;

import java.util.Scanner;

public class Base5 {
	public static void main(String[] args) {
		// Scanner : Ű���� �� ������ �о�鿩 ���� �غ����ִ� ��ü
		// - java.Util ��Ű���� ������
		// - �ʿ��� �� ����ϴ� �����̸�, �⺻������ �ȵ�
		// - �ҷ����� �ϰ�, import �� �̿��ؼ� ������
		// - �� java.System ��Ű���� �⺻���� �ҷ��ͼ� �νĵ�
		
		Scanner sc = new Scanner(System.in);	// Ű���� �Է��� �ν��ϵ��� �غ� ��
		// �Է±�Ģ : ���ͷ� �Է����� / �������� ������ ����, ����, ��
		System.out.print("�� ���� ������ �Է����ּ��� >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("��� : " + num1 + ", " + num2);
		
		System.out.print("�Ǽ� �Ѱ� �Է� >>");
		double value = sc.nextDouble();
		System.out.println("��� : " + value);
		
		// ���ڿ��� 2������ ������ 
		// �ܾ��Է�(next) : ��Ģ�� �Ȱ���
		System.out.print("�ܾ� �Է� >> ");
		String word = sc.next();
		
		// �����Է�(nextLine) : ���⸦ �ν����� ����. ���͸� �ν�
		// - ������ �ٸ� ������ �Է��� ������ ������ �޾�, �Է��� �ٷ� �����
		// - �Է��� �����ϱ� ���� �Է��ߴ� \n�� ���Ƽ� �߻���
		System.out.print("������ �Է����ּ��� >> ");
		sc.nextLine();	// �ٸ� �Է��� ���� ���� ���, �ѹ� �׳� ����
		String msg = sc.nextLine(); // �� �Է��� �۵��ϰ� ��
		
		System.out.printf("#%s#\n#%s#\n", word, msg);
		
		// ������ �Է��� �� �ȹ�����, �ʿ��ϸ� true / false�� �ν���
		System.out.print("������ >> ");
		boolean result = sc.nextBoolean();
		System.out.println("��� : " + result);
	}
}







