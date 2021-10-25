package factory;
import iterator.*;
import smartcarwash.Motor;

import java.util.*;

import command.Command;
import command.CommandInvoker;
import state.*;
public class MenuFactory {
	public void createMenu() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) View Vehicles supported\n"+
		"2) Start System\n"+
		"3) Home Screen" );


		int choice = input.nextInt();


		if(choice ==1) {
			VehicleMenu vehicleMenu = new VehicleMenu();
			PrintVehicleMenu printVehicleMenu = new PrintVehicleMenu(vehicleMenu);

			printVehicleMenu.printMenu();
			Context context = new Context();
			MenuFactory home = new MenuFactory();

			home.createMenu();
		}
		else if(choice ==2) {
			CommandInvoker commandInvoker = new CommandInvoker();
			Motor motor = new Motor("Sideways Motor");
			Command offCommand = () -> {

	            motor.on();
	        };
	        commandInvoker.setCommand(0, offCommand);
	        commandInvoker.onCreate(0);
	        System.out.println("\n");

			Context context = new Context();
			MotorOnState motorState = new MotorOnState();
			motorState.printMenus(context);

		}
		else {
			Context context = new Context();
			MainMenuState home = new MainMenuState();
			home.printMenus(context);
		}
	}
}
