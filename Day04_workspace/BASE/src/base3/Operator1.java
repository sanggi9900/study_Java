package base3;

public class Operator1 {
	public static void main(String[] args) {
		// 산술연산자 : 숫자를 대상으로 할 때는 수학적인 연산을 지시함
		// - 연산식은 소괄호로 묶어주셔야 함
		int num1 = 10;
		int num2 = 3;
		// 값의 종류에 따른 연산불가는 없음.
		// - 제한사항은 존재함 : 정수끼리는 정수결과
		System.out.println("결과1 : " + (num1 + num2));
		System.out.println("결과2 : " + (num1 - num2));
		System.out.println("결과3 : " + (num1 * num2));
		System.out.println("결과4 : " + (num1 / num2));
		System.out.println("결과5 : " + (num1 % num2));

		// 연산결과가 여러번 쓰이면 저장함 - 자료형에 주의해야 함
		double result1 = num1 / num2;	// 자바의 자동형변환의 특징
		// int result2 = num1 / 3.1;		// - 커지기만 함. 작아지는 자동형변환은 없음
		
		// 형변환 연산자 : 필요한 형태로 값의 종류를 1회성으로 바꿈
		int result2 = num1 / (int)3.1;	// 연산결과값보다 작은 자료형에 저장할 경우
		int result3 = (int)(num1 / 3.1);// 반드시 형변환을 적용하셔야 함
		System.out.println("결과6 : " + result1);
		System.out.println("결과7 : " + result2);
		
	}
}









