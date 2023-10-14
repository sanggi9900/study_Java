package base4;

public class Operator5 {
	public static void main(String[] args) {
		// 비트연산자 - 하드웨어 제어용
		// - 값이 실제로 저장된 구조를 알아야 함
		// - 정수에만 가능함
		
		// short : -32768 ~ +32767
		// 0(0) ~ 32767(32767), 32768(-32768) ~ 65535(-1)
		short value1 = 15; // 0000 0000 0000 1111
		short value2 = -3; // 1111 1111 1111 1101

		// 비트이동연산자 : <<, >>
		System.out.println("결과1-1 : " + (value1 << 1));
		System.out.println("결과1-2 : " + (value1 >> 1));

		// 무부호비트이동연산자 : <<<, >>>
		// 1111 1111 1111 1101 -> 1111 1111 1111 1110
		System.out.println("결과2-1 : " + (value2 >> 1));
		// 1111 1111 1111 1101 -> 0111 1111 1111 1110
		System.out.println("결과2-2 : " + (value2 >>> 1));
		
		// 비트 논리연산자 : &, |, ~, ^
		// -3 : 1111 1111 1111 1101
		// -4 : 1111 1111 1111 1100
		// 비트 논리곱 : 1이 둘 다 있으면 1
		System.out.println("결과3 : " + (value2 & -4));
		// 비트 논리합 : 1이 하나라도 있으면 1
		System.out.println("결과4 : " + (value2 | -4));
		// 비트 논리부정 : 모든 비트를 반전시킴
		System.out.println("결과5 : " + (~value2));		
		// 비트 배타논리합 : 서로 달라야만 1
		System.out.println("결과6 : " + (value2 ^ -4));
		
		// 주의사항 : 숫자 놀음으로 보시면 전혀 이해할 수 없는 규칙성/구조
	}
}






