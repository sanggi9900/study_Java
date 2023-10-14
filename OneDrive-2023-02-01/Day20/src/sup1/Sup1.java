package sup1;

class Data implements Comparable<Data> {
	private String name;
	private int age;
	public Data(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() { return name; }
	public int getAge() { return age; }
	public int compareTo(Data that) {
		int result = this.age - that.age;
		if (result < 0) return 1; 		// ������� ��ȯ -> ��������
		else if (result > 0) return -1; // �������� ��ȯ -> ��������
		else return 0;					// ���� ���� ��� -> ���� �ٲ��� ����
	}
}

public class Sup1 {
	public static void main(String[] args) {
		// API : Application Programming Interface
		// -> ���α׷����� ȣȯ�ǵ��� �غ�Ǿ��ִ� �������̽�
		// 1) java.lang.System - �����(Ű������ ���������, ���������)
		// 2) java.lang.String - ���ڿ� Ŭ����
		// 3) java.lang.Wrapper - �����ڷ����� Ŭ������ �ֱ� ���� Ŭ����
		// 4) java.lang.Object - �ڹ��� ��� ���� ���ϰ� �ٷ�� ���� Ŭ����
		// 5) java.lang.Comparable<T> : ������ �����ϱ� ���� �������̽�
		Data[] arr = new Data[5];
		for (int i = 0; i<arr.length; i += 1) {
			arr[i] = new Data("" + i, 10 + i);
		}
		System.out.println(arr[4].compareTo(arr[0]));
		System.out.println(arr[0].compareTo(arr[4]));
		
	}
}



