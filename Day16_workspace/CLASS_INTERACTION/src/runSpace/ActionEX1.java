package runSpace;

import classSpace.Box;

public class ActionEX1 {
	public static void main(String[] args) {
		// �ǽ�1
		// 1) Box Ŭ������ ���� �� �ִ�, ũ�� 8¥�� �迭�� �����ϼ���.
		// 2) �� �迭�� 8�� �����̰�, �������� ������ ������ �����ؼ� �־��ּ���.
		// 3) �� ������ n�� �����̶�� �̸����� �ٿ��ֽø� �˴ϴ�.
		//    8���̴� 1������ 8������ ��ȣ�� �ٽ��ϴ�.
		// 4) ��� ������ �����ּ���.
		// 5) ��� ������ ���� �������� ����ϼ���.
		
		// �迭 ���� : �迭 ��ü�� ���������, ������ ��������� ����
		Box[] drawer = new Box[8];
		// NullPointerException
		// - ������ ���� ���� ��ü�� ������ �� �� �߻��ϴ� ����(����)
		// - ��ü�� ����/���� ���� �����غ��� ��
		
		// ���� ���� �� �̸� ���̱�
		for (int i = 0; i < drawer.length; i += 1) {
			drawer[i] = new Box((i + 1) + "�� ����");
		}
		// ���� ���� ��� : �� ����� �׽�Ʈ����
		for (int i = 0; i < drawer.length; i += 1) {
			if (drawer[i] == null) System.out.println("����!");
			else System.out.println(drawer[i].getName() + " " + drawer[i].getState());
		}
		// ���� ���� : ���� �ڵ� ������ nullüũ�� �ʿ���� ��찡 ����
		//          �ٸ� �޼���� �ѱ�� ���, nullüũ�� ����Ǿ�� ��
		for (int i = 0; i < drawer.length; i += 1) {
			if (drawer[i] != null && !drawer[i].getState()) drawer[i].open();
		}
		// ���� ���� ���
		for (int i = 0; i < drawer.length; i += 1) {
			if (drawer[i] == null) System.out.println("����!");
			else System.out.println(drawer[i].getName() + " " + drawer[i].getState());
		}
	}
}