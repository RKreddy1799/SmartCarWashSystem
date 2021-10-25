package tests;
import iterator.*;
public class IteratorUnitTest {

	public static void main(String[] args) {
		VehicleMenu vehicleMenu = new VehicleMenu();
		Iterator iterator = vehicleMenu.createIterator();
		if(iterator.hasNext()) {
			System.out.println("Test Valid");
		}
		else {
			System.err.println("Test Invalid");
		}

	}

}
