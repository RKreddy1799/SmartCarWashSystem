package tests;

import command.Command;
import command.CommandInvoker;
import smartcarwash.Motor;

public class CommandUnitTest {

	public static void main(String[] args) {
		CommandInvoker commandInvoker = new CommandInvoker();
		Motor motor = new Motor("Sideways");
		Command onCommand = () -> {
            motor.on();
        };
        commandInvoker.setCommand(0, onCommand);
        commandInvoker.onCreate(0);
        System.out.println("\n");

		Command offCommand = () -> {
            motor.off();
        };
        commandInvoker.setCommand(0, offCommand);
        commandInvoker.onCreate(0);
        System.out.println("\n");

	}

}
