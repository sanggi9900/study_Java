package ifstate;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		// ���ǹ� : �����Ͽ� ��󳻰� �޸� ó���ϱ� ���� ���
		// - ��������� ��� ���� �����ϰ� ó���ϴ� ��
		// - ������ ��� ���� �����ϰ� ó���� �� ����
		
		// �⺻����� : if + else
		// if : ���ǽ��� ����� true�� �� ������ �ڵ带 �����ֱ� ���� ���
		// else : ���ǽ��� ����� false�� �� ������ �ڵ带 �����ֱ� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ��ȣ�� �Ǻ��մϴ� >> ");
		int num = sc.nextInt();
		// - �� �� �ϳ��� ���� �� ����
		// - �����ڵ尡 �ϳ����̸� �߰�ȣ ��������
		if (num > 0) System.out.println("�� ������ ����Դϴ�~");
		else System.out.println("�� ������ ����� �ƴմϴ�~");
	}
}






