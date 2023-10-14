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
		// java.util ��Ű�� - ������ ���� ����
		// 1) Scanner Ŭ���� -> SystemŬ������ �Է��� ���ϰ� �� �� �ְ� �������� ��
		// 2) collection -> ��ü���� �ٷ�� ���ϰ� ����� ���� �ڷᱸ��
		//    -> Standard Template Library�� �����Ǵ� ��
		//    -> ���� �迭 / ���� �迭 / ����Ʈ / Ʈ������
		// -> �����迭 - �ӵ��� ����. ũ�Ⱑ �����Ǿ� ����
		//    �����迭 - �ӵ��� ����. ũ�⸦ �ٲٴ� ������ ����
		//    ����Ʈ - �ҿ뷮�� ��������, ��뷮�� ���� ����
		//    Ʈ�� - ��뷮�� �ִ��� ������ ó���� ����������, ������ ������ �ȵ�
		// 1. ArrayList : �����迭
		// 2. LinkedList : ����Ʈ
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
		aList.remove(1); // 0������ �����ϴ� �ε����� �����Ͽ� �����Ѵ�.
		System.out.println(aList);
		System.out.println(bList);
		
		// �÷����� �� ������ ũ�⿡ ���ؼ� ���뼺�ְ� �����ϰ�
		// ���ĵ� ���¸� �̿��ϴ°� ����
		// aList.sort(null);	// Comparable�� �ٿ����� ��츸 ����
		// ���� ��쿡��, Comparator�� �͸���ü�� ���� �����Ѵ�.

		// 3) java.util.Comparator<T> : �͸���ü�� ����� ���� �⺻���� �ϴ� �������̽�
		// - ��� Ŭ������ getter�� ������ �����ǰ� �ȵ�
		Comparator<BodyData> comp = new Comparator<BodyData>() {
			public int compare(BodyData it, BodyData that) {
				return it.getAge() - that.getAge();
			}
		};
		bList.sort(comp);
		System.out.println(bList);
		
		// Comparable �������̽��� �⺻�������� �����ϸ� ����(��? ����ϴϱ�)
		// Comparator�� ����ġ ���� ��Ȳ�� �����ϴ� ����̴�(��? �ʿ��� �� ����ϱ�)

	}
}










