package iterator;

import smartcarwash.*;
import java.util.*;
public class FourWheelIterator implements Iterator {
	List<FourWheel> vehicles;
	int position = 0;
	public FourWheelIterator(List<FourWheel> vehicles) {
		this.vehicles = vehicles;
	}
	@Override
	public Vehicle next() {
		Vehicle vehicle = vehicles.get(position);
		position = position + 1;
		return vehicle;
	}

	@Override
	public boolean hasNext() {
		if(position >= vehicles.size()) {
			return false;
		}
		else
			return true;
	}

}
