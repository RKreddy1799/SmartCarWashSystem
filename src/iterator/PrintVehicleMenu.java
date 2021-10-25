package iterator;
import facade.*;
import iterator.*;
import smartcarwash.*;
public class PrintVehicleMenu {
	VehicleMenu vehicleMenu;
	public PrintVehicleMenu(VehicleMenu vehicleMenu) {
		this.vehicleMenu = vehicleMenu;

	}
	public void printMenu() {
		Iterator iterator = vehicleMenu.createIterator();
		printMenu(iterator);
	}
	public void printMenu(Iterator iterator) {
		System.out.println("\n\n============= Vehicles to Wash =============\n\n");
		while(iterator.hasNext()) {
			FourWheel vehicle = (FourWheel) iterator.next();
			System.out.print(vehicle.getName() +"\t");
			System.out.print(vehicle.getModel() + "\t");
			System.out.print(vehicle.getWashingDetergent() + "\t");
			System.out.println(vehicle.getDescription() +"\n");

		}
	}
}
