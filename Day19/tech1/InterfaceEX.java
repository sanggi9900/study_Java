package tech1;

import myClass.Bike;
import myClass.Car;

public class InterfaceEX {
	public static void main(String[] args) {
		Car sonata = new Car("Sonata");
		Bike bugatti = new Bike("Bugatti");
		sonata.showInfo();
		sonata.drive();
		sonata.stop();
		bugatti.showInfo();
		bugatti.drive();
		bugatti.stop();
	}
}
