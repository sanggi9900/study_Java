package base2;

import java.util.Scanner; // ctrl + shift + o

public class Base6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ���� �Է� - �������� ����. ���ڿ�(�ܾ�) �Է��� �����Ͽ� ������
		// �� ���ڿ��� � ���� ������ �������� �ν��ϰ� ����
		// -> �ϳ��ۿ� ���� ���ڿ��� ���ڴ�
		System.out.print("��ũ�� �Է����ּ��� >> ");
		// 1) sc.next()�� ���� ���� ���� ���ڿ����� �غ� ��
		// 2) �׷��� �غ�� ���ڿ��� ���� �޼��� charAt�� ��
		// 3) charAt(0) : 0�� �ε���(ù��°)�� ���ڷμ� ������
		char rank = sc.next().charAt(0);
		
		System.out.println("��ũ : " + rank);
		// �ڹ��� ���� �ڷ����� ���ڿ��� ��/�м��� ���ؼ� �غ��ϴ� �Ϳ� �����
		
		sc.close();
		
		// Scanner�� �� �� ������ �� : resource leak
		// 1) Ű����� �Էµ� ���� �ν��ϴ� System.in�� ���
		//    ���Ƿ� sc.close() ó���� �ϸ� �ȵ�
		//    -> �ƿ� �����ϰų�...�� ���ٰ� �Ǻ��Ǵ� �������� close�� ��
		// 2) ���Ϸκ��� �о���� ��� �ݵ�� sc.close() ó���� �ؾ� ��
		//    ���ϸ�, �ش� ���Ͽ� ���� ����/����/�̵����� ��� ���ܵ�
	}
}





