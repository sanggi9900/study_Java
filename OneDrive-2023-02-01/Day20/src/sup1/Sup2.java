package sup1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

class BodyData {
	private int age;
	private double weight;
	public BodyData(int age, double weight) {
		this.age = age;
		this.weight = weight;
	}
	public String toString() {
		return age + "(" + weight + ")";
	}
	public int getAge() { return age; }
}

public class Sup2 {
	public static void main(String[] args) {
		// java.util 패키지 - 편리한 도구 모음
		// 1) Scanner 클래스 -> System클래스의 입력을 편하게 쓸 수 있게 재포장한 것
		// 2) collection -> 객체들을 다루기 편하게 만들기 위한 자료구조
		//    -> Standard Template Library에 대응되는 것
		//    -> 정적 배열 / 동적 배열 / 리스트 / 트리구조
		// -> 정적배열 - 속도가 빠름. 크기가 고정되어 있음
		//    동적배열 - 속도가 빠름. 크기를 바꾸는 과정이 느림
		//    리스트 - 소용량은 빠르지만, 대용량은 느린 구조
		//    트리 - 대용량도 최대한 빠르게 처리가 가능하지만, 정교한 접근이 안됨
		// 1. ArrayList : 동적배열
		// 2. LinkedList : 리스트
		ArrayList<BodyData> aList = new ArrayList<BodyData>();
		LinkedList<BodyData> bList = new LinkedList<BodyData>();
		BodyData tmp1 = new BodyData(10,  99.9);
		BodyData tmp2 = new BodyData(18,  59.9);
		BodyData tmp3 = new BodyData(17,  13.9);
		aList.add(tmp1); bList.add(tmp1);
		aList.add(tmp2); bList.add(tmp2);
		aList.add(tmp3); bList.add(tmp3);
		System.out.println(aList);
		System.out.println(bList);
		aList.remove(1); // 0번부터 시작하는 인덱스를 지정하여 제거한다.
		System.out.println(aList);
		System.out.println(bList);
		
		// 컬렉션의 주 목적은 크기에 대해서 융통성있게 접근하고
		// 정렬된 상태를 이용하는게 목적
		// aList.sort(null);	// Comparable을 붙여놨을 경우만 가능
		// 없을 경우에는, Comparator를 익명객체로 만들어서 전달한다.

		// 3) java.util.Comparator<T> : 익명객체로 만드는 것을 기본으로 하는 인터페이스
		// - 대상 클래스에 getter가 없으면 재정의가 안됨
		Comparator<BodyData> comp = new Comparator<BodyData>() {
			public int compare(BodyData it, BodyData that) {
				return it.getAge() - that.getAge();
			}
		};
		bList.sort(comp);
		System.out.println(bList);
		
		// Comparable 인터페이스는 기본설정으로 생각하면 좋다(왜? 상속하니까)
		// Comparator는 예기치 못한 상황에 대응하는 방식이다(왜? 필요할 때 만드니까)

	}
}











