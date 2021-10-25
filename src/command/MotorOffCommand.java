package command;
import smartcarwash.*;
public class MotorOffCommand implements Command{
	Motor motor;
	public MotorOffCommand(Motor motor) {
		this.motor = motor;
	}
	@Override
	public void execute() {
		motor.off();

	}

}
