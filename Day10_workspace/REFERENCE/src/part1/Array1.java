package part1;

public class Array1 {
	public static void main(String[] args) {
		// 참조 변수 : 무조건 공유만 되는 변수 - 원시 변수와의 차이점은 저장공간의 크기.
		// - 원시변수는 모두 저장공간의 크기가 지정되어 있음
		//   값은 그 저장공간 내부에 변환되어서 보관되어 있음
		// - 값은 불러올 때, 다른 곳에 저장할 때 그대로 복사하여 가져옴
		// -> 지나치게 거대한 것은 복사 과정자체가 오래걸려 느려짐
		// -> 복사를 위해선 같은 크기의 공간이 하나 더 필요함
		
		// 자료구조 : 변수의 묶음 -> 복사하면 느림
		// - 이를 더 안전하게 공유하기 위한 기술을 "참조"라고 함
		// - 자료형만 정확하게 맞춰주면 이를 자동으로 연결시켜서 쓸 수 있게 해줌
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = arr1; // 참조는 복사하는 구조가 아님
		System.out.printf("%d, %d\n", arr1[0], arr2[0]);
		arr1[0] = 200;	// 변수만 준비하면 되기 때문에 편하지만
		System.out.printf("%d, %d\n", arr1[0], arr2[0]);
		arr2[0] = 300;	// 공유된다는 것을 까먹으면 안됨
		System.out.printf("%d, %d\n", arr1[0], arr2[0]);
		
		// 참조변수는 해당 저장공간을 해석하는 방법을 제공하고...
		// 1) 필드와 2) 메서드를 이용하여 대상을 다룬다.
		// 필드는 값을 바로 읽어오는 변수를 의미하며
		// 메서드는 코드이다.
		for (int i = 0; i < arr1.length; i += 1) {
			System.out.printf("%d번째 정수 : %d, %d\n", i + 1, arr1[i], arr2[i]);
		}
		// 참조들은 따로 설정해놓지 않으면 hash code라는 관리번호가 튀어나옴
		// - 참조들은 기본적으로 출력해봤자 쓸모없음
		System.out.println(arr1);
		
		// 참조변수들이 공유하는 것이 필요가 없을 경우에는...null을 저장하여 공유를 끊는다.
		arr1 = null;
		arr2 = null;
		// - 자바는, 공유가 모두 끊긴 대상이 존재하면, 자동으로 제거(동적할당해제)시켜줌
		// - 자바의 GC(Garbage Collector)가 이를 처리해줌
	}
}













