package tech1;

import test.Sample1;

public class Static1 {
	public static void main(String[] args) {
		// static Ű���� : ��ü�� ������ �ʾƵ� �� �� �ִ� �ʵ�/�޼���
		// - ��ü�� ������ ������ ���ǰ�, ��ü���� ���� �����ϴ� ������ ����
		// static �������(�ʵ�)
		// - �� ��ü�� �޼��忡�� �̿��ϴµ� �ƹ��� ��������
		// - ���� ������ �ؾ� �� ���� �����ؾ� �Ѵ�.
		// static ����޼���(�޼���)
		// - static �ʵ带 �̿��ϱ� ���� �޼���
		// - static ����� �ƴ� ���� ����ϸ� �ȵ�
		Sample1 sam1 = new Sample1(100);
		Sample1.check();
		Sample1 sam2 = new Sample1(150);
		Sample1.check();
		Sample1 sam3 = new Sample1(150);
		Sample1.check();
	}
}