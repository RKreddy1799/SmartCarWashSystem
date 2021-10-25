package smartcarwash;
import state.*;
public class SmartCarWash {

	public static void main(String[] args) {
		Context context = new Context();

		MainMenuState startUp = new MainMenuState();
		startUp.printMenus(context);

	}

}
