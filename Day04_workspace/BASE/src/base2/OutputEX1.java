package base2;

public class OutputEX1 {
	public static void main(String[] args) {
		// 실습문제
		// 아래와 같이 나오도록 변수를 선언하고 초기화한 다음 출력하세요.
		String name = "고길동";
		int age = 43;
		String hobby = "둘리 괴롭히기";
		
		// 이름 : <변수에 저장된 값1>
		// 나이 : <변수에 저장된 값2>세
		// 취미 : <변수에 저장된 값3>
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age + "세");
		System.out.println("취미\t: " + hobby);
		// <값1>의 나이는 <값2>세이고, 취미는 <값3>입니다.
		System.out.printf("%s의 나이는 %d세이고, 취미는 %s입니다.\n", name, age, hobby);
	} 
}







