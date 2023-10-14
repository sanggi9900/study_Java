package oop5;

import myclass.GenBox;

public class GenericEX {
	public static void main(String[] args) {
		// ���� �ϴ� ��ӹ��
		// - �Ϲ� �θ� Ŭ���� + ���׸� �ڽ� Ŭ����
		// - ���׸� �θ� Ŭ���� + �Ϲ� �ڽ� Ŭ����
		// - ���׸��� ���׸��� �����ϰ� ���������� �� ����
		//      �� ���� �����Ǵ� ���� �̿��ϱ⸸ �ϰ� �������� ����
		
		GenBox<Integer> gBox1 = new GenBox<Integer>("��������");
		GenBox<String> gBox2 = new GenBox<String>("���ڿ�����");
		gBox1.showInfo(); // ����������(/��) ���� �ֽ��ϴ�.
		gBox2.showInfo(); // ���ڿ�������(/��) ���� �ֽ��ϴ�.
		gBox1.open(); // ����������(/��) ���ϴ�.
		gBox2.open(); // ���ڿ�������(/��) ���ϴ�.
		gBox1.showInfo(); // �������� : null
		gBox2.showInfo(); // ���ڿ����� : null
		gBox1.setData(100); // �������� - ���强��...
		gBox2.setData("Apple"); // ���ڿ����� - ���强��...
		gBox1.showInfo(); // �������� : 100
		gBox2.showInfo(); // ���ڿ����� : Apple
		gBox1.close(); // ����������(/��) �ݽ��ϴ�.
		gBox2.close(); // ���ڿ�������(/��) �ݽ��ϴ�.
		System.out.println("gBox1�� �� : " + gBox1.getData());
		// gBox1�� �� : null
		System.out.println("gBox2�� �� : " + gBox2.getData());
		// gBox2�� �� : null
	}
}