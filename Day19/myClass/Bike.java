package myClass;

public class Bike implements Drivable  {
	private String name;
	public Bike(String name) {
		this.name = name;
	}
	public void showInfo() {
		System.out.println(interfaceName);
		System.out.println(name + " : Bike Class");
	}
	public void drive() {
		System.out.println(name + " : ���ָ� �����մϴ�!!");
	}
	public void stop() {
		System.out.println(name + " : ���ָ� ������ϴ�!!");
	}
}