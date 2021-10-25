package smartcarwash;

public class Motor {
	String location;
	public Motor(String location) {
		this.location = location;
	}
	public void on() {
		System.out.println(location + "Motor is on");
	}
	public void off() {
		System.out.println(location + "Motor is off");
	}


}
