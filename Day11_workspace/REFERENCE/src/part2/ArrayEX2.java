package part2;

import java.util.Scanner;

public class ArrayEX2 {
	public static void main(String[] args) {
		char[]  arr = new char[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print((i + 1) + "�� ���� : ");
			arr[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < arr.length; i += 1) {
			System.out.printf("index : %d, char : %c\n", i, arr[i]);
		}
	}
}
