package base4;

public class Operator4 {
	public static void main(String[] args) {
		// 대입연산자 : 우측을 좌측에 복사해주는 연산자
		// - 원시의 경우, 각 자료형의 크기를 기준으로 더 커지거나 같은 크기면
		//   복사하여 저장할 수 있음
		// 1 Byte(boolean)
		// 2 Byte(short, char, byte)
		// 4 Byte(int, float)
		// 8 Byte(long, double)
		int num1 = 100;
		long num2 = num1;	// 더 큰 정수이니 가능
		float fnum1 = num1;	// 실수가 정수보다 더 큼
		
		// - 큰 놈이 작은 놈으로는 형변환없이는 들어갈 수 없음
		double fnum2 = 3.14;
		// long num3 = fnum2; 형변환 필요 -> long num3 = (long)fnum2;
		// int num3 = fnum2; 형변환 필요 -> int num3 = (int)fnum2;
		// - 비원시는 대입연산으로는 복사되지 않으니 주의
		//   할려면 메서드를 이용해야만 가능함
		
		// 복합대입연산자 : 특정 조합의 연산식을 줄여 쓰는 연산자
		// - 누적용도로만 사용하게 됨
		// - 변수 = 변수 + @ -> 변수 += @
		// - 원리만 이해하면 따로 외워서 쓰는 노력을 들일 필요가 없음
		int num4 = 100;
		num4 += 5; // num4 = (int)(num4 + 5);
		System.out.println("num4 : " + num4);
		// 앞에 형변환이 붙어 있으니 주의
		num4 += 3.14; // num4 = (int)(num4 + 3.14);
		System.out.println("num4 : " + num4);
		
		// 증감연산자 : 1씩 증가/감소하는 연산자
		num4++; // num4 += 1 -> num4 = num4 + 1
		System.out.println("num4 : " + num4);
		num4--; // num4 -= 1 -> num4 = num4 - 1
		System.out.println("num4 : " + num4);
		
		// 실제 용도 : 다른 연산식에 섞어쓰는 응용연산 용도
		int result1 = num4++ +5; // 후치 : 다른 연산부터 먼저하고 증가
		System.out.printf("%d, %d\n", result1, num4);
		int result2 = ++num4 +5; // 전치 : 먼저 증가후 다른 연산 진행
		System.out.printf("%d, %d\n", result2, num4);
		
	}
}






