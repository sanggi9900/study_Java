package sup1;

import java.util.Comparator;

class Sample {
	private int data;
	public Sample(int data) { this.data = data; }
	public int getData() { return data; }
}

public class Sup3 {
	public static void main(String[] args) {
		// 람다식 : 익명객체를 만들기 위한 또다른 문법
		// - 메서드가 하나밖에 없는 함수명 인터페이스에 대해서만 해야 한다
		Comparator<Sample> comp1 = new Comparator<Sample>() {
			public int compare(Sample it, Sample that) {
				return it.getData() - that.getData();
			}
		};
		// - "메서드만 바로 만들어 쓴다" 라고 생각하는게 좋음 
		Comparator<Sample> comp2 = 
				(Sample it, Sample that) -> {
					return it.getData() - that.getData();
				};
		System.out.println(comp1);
		System.out.println(comp2);
	}
}





