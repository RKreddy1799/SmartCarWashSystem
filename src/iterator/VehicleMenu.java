package iterator;
import smartcarwash.*;
import java.util.*;
public class VehicleMenu {
	List<FourWheel> vehicleMenu;
	public VehicleMenu() {
		vehicleMenu = new ArrayList<FourWheel>();
		vehicleMenu.add(new Audi());
		vehicleMenu.add(new BMW());
		vehicleMenu.add(new Ford());
		vehicleMenu.add(new Toyota());
	}
	public Iterator createIterator() {
		return new FourWheelIterator(vehicleMenu);
	}

}
