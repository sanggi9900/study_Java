package part2;

import java.util.Scanner;

public class ArrayEX3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �迭�� ũ�Ⱑ �ٲ� ������ �Ǿ�� �Ѵ�
		// -> ũ�Ⱑ �ݿ��� �� �ִ� ������ ���� �ݿ��ؾ� ��
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print((i+1)+"�� �� >> ");
			arr[i] = sc.nextInt();
		}
		
		int result = 0;
		for (int i = 0; i < arr.length; i += 1) {
			result += arr[i];
		}
		
		System.out.print("�� : ");
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n��  : " + result);
		System.out.printf("���  : %.1f\n", result / (double)arr.length);
	}
}