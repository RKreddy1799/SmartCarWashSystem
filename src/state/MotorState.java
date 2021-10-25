package state;
import command.*;
import java.util.Scanner;
import smartcarwash.*;
import factory.MenuFactory;

public class MotorState implements State {

	@Override
	public void printMenus(Context context) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("--------Start Car Wash Motor motorstate-----\n" +
		"1) Turn on \n" +
		"2) Back\n");

		System.out.print("");

		int userChoice = input.nextInt();

		if(userChoice ==1) {
			CommandInvoker commandInvoker = new CommandInvoker();
			Motor motor = new Motor("Sideways Motor");
			Command onCommand = () -> {

	            motor.on();
	        };
	        commandInvoker.setCommand(0, onCommand);

	        commandInvoker.onCreate(0);
	        System.out.println("\n");

			MotorOnState motorState = new MotorOnState();
			motorState.printMenus(context);
		}
		else if(userChoice ==2) {
			MenuFactory menuFactory = new MenuFactory();
			menuFactory.createMenu();
		}

	}

}
