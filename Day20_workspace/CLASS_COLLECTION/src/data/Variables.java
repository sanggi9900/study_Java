package data;

public class Variables implements Comparable<Variables> {
	private int data1;
	private int data2;
	public Variables(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	public void set1(int value) {
		data1 = value;
	}
	public void set2(int value) {
		data2 = value;
	}
	public int get1() {
		return data1;
	}
	public int get2() {
		return data2;
	}
	public String toString() {
		return "("+data1+","+data2+")";
	}
	// compareTo : Comparable 인터페이스의 메서드
	// - equals보다 더 범용성이 좋은 메서드
	// - 반환값이 정수이기 때문에 주의해야 함
	// - 결과값에 따라서 순서가 결정되며, 조건식은 임의로 가능함
	public int compareTo(Variables that) {
		// 내가 더 빠른 경우  -1
		if (this.data1 < that.data1) return -1;
		// 같으면 0
		else if (this.data1 == that.data1) return 0;
		// 내가 더 느리면 1
		else return 1;
	}
}










