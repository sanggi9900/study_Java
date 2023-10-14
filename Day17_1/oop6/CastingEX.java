package oop6;

import myclass.Box;
import myclass.GenBox;
import myclass.Human;
import myclass.IntBox;

public class CastingEX {
	public static void main(String[] args) {
		IntBox iBox1 = new IntBox("����1", 100);
		IntBox iBox2 = new IntBox("����2", 200);
		GenBox<Double> GenBox1 = new GenBox<Double>("�Ǽ�", 3.14);
		GenBox<String> GenBox2 = new GenBox<String>("�ܾ�", "App");
		iBox1.showInfo();
		iBox2.showInfo();
		GenBox1.showInfo();
		GenBox2.showInfo();
		Box[] boxList = new Box[4];
		
		boxList[0]= iBox1;	  // ��ĳ���ýÿ���
		boxList[1]= iBox2;	  // ���̴°� ���� ���ϸ�
		boxList[2]= GenBox1;  // ����ȯ ���̼���.
		boxList[3]= GenBox2;
		
		Human manUnit = new Human("�ڽ������ý���");
		manUnit.showInfo();
		manUnit.openAll(boxList);
		iBox1.showInfo();
		iBox2.showInfo();
		GenBox1.showInfo();
		GenBox2.showInfo();
	}
}