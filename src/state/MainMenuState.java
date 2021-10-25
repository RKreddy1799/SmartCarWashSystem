package state;
import java.util.*;
public class MainMenuState implements State {
	@Override
	public void printMenus(Context context) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("--------Smart Car Wash-----\n" +
		"1) View Selection \n" +
		"2) Log Out\n");

		System.out.print("");

		int userChoice = input.nextInt();

		if(userChoice ==1) {
			ViewVehiclesState vehiclesState = new ViewVehiclesState();
			vehiclesState.printMenus(context);
		}
		else if(userChoice ==2) {
			System.exit(0);
		}

	context.setState(this);
	}


}
