package state;
import factory.*;
public class ViewVehiclesState implements State {

	@Override
	public void printMenus(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.createMenu();

	}

}
