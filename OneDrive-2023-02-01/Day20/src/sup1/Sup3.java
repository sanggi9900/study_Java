package sup1;

import java.util.Comparator;

class Sample {
	private int data;
	public Sample(int data) { this.data = data; }
	public int getData() { return data; }
}

public class Sup3 {
	public static void main(String[] args) {
		// ���ٽ� : �͸���ü�� ����� ���� �Ǵٸ� ����
		// - �޼��尡 �ϳ��ۿ� ���� �Լ��� �������̽��� ���ؼ��� �ؾ� �Ѵ�
		Comparator<Sample> comp1 = new Comparator<Sample>() {
			public int compare(Sample it, Sample that) {
				return it.getData() - that.getData();
			}
		};
		// - "�޼��常 �ٷ� ����� ����" ��� �����ϴ°� ���� 
		Comparator<Sample> comp2 = 
				(Sample it, Sample that) -> {
					return it.getData() - that.getData();
				};
		System.out.println(comp1);
		System.out.println(comp2);
	}
}




