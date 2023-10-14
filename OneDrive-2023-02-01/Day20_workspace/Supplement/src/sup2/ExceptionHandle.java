package sup2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {
	// �ʵ�� Sanner�� �غ��ϸ� �� �� ���������� ������ �� �ִ�.
	public static Scanner sc = new Scanner(System.in);

	// �޼���� �и��ؼ� throws��Ű�� �� �� ȿ�������� ������ �� �ִ�.
	// - ���ܸ� �����ؼ� catch�ϵ��� ������ �� ����
	public static int test(int n1, int n2) throws ArithmeticException  {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		// Exception : ����.
		// �̹� ������ ���α׷��� �����Ǵ� ���� �����ϱ� ���� �غ��� ����ü��
		// ������ ũ�� 3������ �̷����
		// 1) try : �����ϴ� ������ ������
		// 2) catch : ������ ������ �߻��� ���ܸ� �����ϰ�
		//            �׿� �����Ǵ� �ڵ带 ������
		// 3) finally : ���������� ���ȴ� ���� �������ϱ� ���� �ڵ屸��
		//              ����°����ؼ� �ַ� �����Ͽ� �����
		//              ������ ����Ǵ� �ڵ��.
		
		// �����1. ���������� �ľ��� �ذ��ϰ�, ����ó���� ������
		// �����2. �ܺο������� �ذ��� �ȵǸ�, ����ó���� �������� ������
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int result = test(num1, num2);
			System.out.println("��� : " + result);
		}
		// ���ǻ��� - Exception Ŭ������ ���� ���ο� �ɸ� �ȵ�
		//         ���� ������ ������ �ȵ� ��쿡�� ���� �������� �߰��Ѵ�.
		catch(InputMismatchException e) {
			// ���� ��ü�� �����ϰ�, �̸� ����� �� ������
			// �� �� ������ �߻����� ���� Ȯ���� �� �ִ�.
			System.out.println("����1 : " + e);
		}
		catch(ArithmeticException e) {
			// ���� ��ü�� �����ϰ�, �̸� ����� �� ������
			// �� �� ������ �߻����� ���� Ȯ���� �� �ִ�.
			System.out.println("����2 : " + e);
		}
		catch(Exception e) {
			System.out.println("���� 0");
		}
		finally {
			System.out.println("�����ϰ� �����Ҳ���!");
			sc.close();
		}
	}
}



