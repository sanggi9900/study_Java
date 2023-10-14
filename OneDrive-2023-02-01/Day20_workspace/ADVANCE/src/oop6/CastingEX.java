package oop6;

import myclass.Box;
import myclass.GenBox;
import myclass.Human;
import myclass.IntBox;

public class CastingEX {
	public static void main(String[] args) {
		IntBox iBox1 = new IntBox("정수1", 100);
		IntBox iBox2 = new IntBox("정수2", 200);
		GenBox<Double> GenBox1 = new GenBox<Double>("실수", 3.14);
		GenBox<String> GenBox2 = new GenBox<String>("단어", "App");
		iBox1.showInfo();
		iBox2.showInfo();
		GenBox1.showInfo();
		GenBox2.showInfo();
		Box[] boxList = new Box[4];
		
		boxList[0]= iBox1;	  // 업캐스팅시에는
		boxList[1]= iBox2;	  // 붙이는게 보기 편하면
		boxList[2]= GenBox1;  // 형변환 붙이세요.
		boxList[3]= GenBox2;
		
		Human manUnit = new Human("박스관리시스템");
		manUnit.showInfo();
		manUnit.openAll(boxList);
		iBox1.showInfo();
		iBox2.showInfo();
		GenBox1.showInfo();
		GenBox2.showInfo();
	}
}
