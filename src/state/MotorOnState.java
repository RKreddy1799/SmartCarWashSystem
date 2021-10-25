package state;

import java.util.Scanner;

import command.Command;
import command.CommandInvoker;
import factory.MenuFactory;
import smartcarwash.Motor;

public class MotorOnState implements State {

	@Override
	public void printMenus(Context context) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("--------Start Car Wash Motor onstate-----\n" +
		"1) Turn off \n");

		System.out.print("");

		int userChoice = input.nextInt();

		if(userChoice ==1) {
			CommandInvoker commandInvoker = new CommandInvoker();
			Motor motor = new Motor("Sideways Motor");
			Command offCommand = () -> {

	            motor.off();
	        };
	        commandInvoker.setCommand(0, offCommand);
	        commandInvoker.onCreate(0);
	        System.out.println("\n");

			MotorOffState motorState = new MotorOffState();
			context.setState(this);
			motorState.printMenus(context);
		}
//		else if(userChoice ==2) {
//			MenuFactory menuFactory = new MenuFactory();
//			menuFactory.createMenu();
//		}

	}

}
