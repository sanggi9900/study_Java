package myClass;

public class Car implements Drivable {
	private String name;
	public Car(String name) {
		this.name = name;
	}
	public void showInfo() {
		System.out.println(interfaceName);
		System.out.println(name + " : Car Class");
	}
	public void drive() {
		System.out.println(name + " : ����մϴ�....");
	}
	public void stop() {
		System.out.println(name + " : �����մϴ�....");
	}
}