package part2;

import java.util.Scanner;

public class ArrayEX4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// �������� : �ڹ��� �迭�� ������ �ڵ����� 0���� �ʱ�ȭ��
		int[] arr = new int[8]; 
		System.out.print("8�� ������ ������ �Է��ϼ���.\n>>");
		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = sc.nextInt();
		}
		// �迭�� ���� ���� �� �ְ�, ��ġ������ ���� �� ����
		int max = 0;
		int min = 0;
		// ��ġ����(�ε���)�� ���뼺�� �� ����
		for (int i = 1; i < arr.length; i += 1) {
			if (arr[max] < arr[i]) max = i;
		}
		for (int i = 1; i < arr.length; i += 1) {
			if (arr[min] > arr[i]) min = i;
		}
		System.out.printf("���� ���� ���� : %d��° %d��\n", max + 1, arr[max]);
		System.out.printf("���� ���� ���� : %d��° %d��\n", min + 1, arr[min]);
	}
}