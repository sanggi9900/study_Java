package part3;

import java.util.Scanner;

public class REF1 {
	public static int input() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	public static void input_arr1(int[] arr) {
		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = 100 + i;	
		}
	}
	public static int[] input_arr2() {
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = 100 + i;	
		} return arr;
	}
	public static int make_sum(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i += 1) {
			result += arr[i];	
		} return result;
	}
	
	public static void main(String[] args) {
		// ������ - ������ ������ ��
		// - �޼��忡 ��������� �� ���ǻ���
		// - ��ȯ�� ���� �� �ְ� ���� �� ����
		
		// �����ڷ������� ��򰡿� �����ϰų� �̿��� ���, ����(��ȯ/�Ű�����)�� ���� ���޹ް� �����Ѵ�.
		/*
		int num = input();
		System.out.println(num);
		*/
		// ������ڷ����� ��򰡿� �����ϰų� �̿��� ���, �̸�ǥ�� �ٿ��� �̿��ϴ� ����̴�.
		// - �����Ǵ� ��ġ�� �޼��� ���ΰ� �ƴ϶�, �޼��庸�� �� ���� �ܺο��� ������
		// 1) ��ȯ�� ���µ� ��ȯ�� - ����õ��� ������ �ִ� ��������� �ٷ� ������ �� ����
		int[] arr = new int[3];
		input_arr1(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// 2) ��ȯ������ ��°�� ��ȯ�� - ����ø� �ʿ��� ������ �� �� �ֵ��� ���ִ� ����
		int[] arr1 = input_arr2();
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		// 3) ��� ���������κ��� ����� �ϴ� �Ϳ� ���� ��ȯ���� �ٸ� ���� ������ �� ����
		int result1 = make_sum(arr);
		int result2 = make_sum(arr1);
		System.out.println(result1);
		System.out.println(result2);
	}
}









