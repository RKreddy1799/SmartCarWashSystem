package command;

import smartcarwash.Motor;

public class MotorOnCommand implements Command{
	Motor motor;
	public MotorOnCommand(Motor motor) {
		this.motor = motor;
	}
	@Override
	public void execute() {
		motor.on();

	}
}
