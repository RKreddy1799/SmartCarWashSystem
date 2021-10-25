package state;

import java.util.Scanner;

import command.Command;
import command.CommandInvoker;
import factory.MenuFactory;
import smartcarwash.Motor;

public class MotorOffState implements State {

	@Override
	public void printMenus(Context context) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("--------Start Car Wash Motor offstate-----\n" +
		"1) Turn on \n" +
		"2) Back\n");

		System.out.print("");

		int userChoice = input.nextInt();

		if(userChoice ==1) {
			CommandInvoker commandInvoker = new CommandInvoker();
			Motor motor = new Motor("Sideways");
			Command offCommand = () -> {

	            motor.on();
	        };
	        commandInvoker.setCommand(0, offCommand);
	        commandInvoker.onCreate(0);
	        System.out.println("\n");

			MotorOnState motorState = new MotorOnState();
			context.setState(this);
			motorState.printMenus(context);
		}
		else if(userChoice ==2) {
			MenuFactory menuFactory = new MenuFactory();
			menuFactory.createMenu();
		}



	}

}
