package tests;
import state.*;
import factory.*;
public class FactoryUnitTest {

	public static void main(String[] args) {
		Context context = new Context();
		MenuFactory factoryTest = new MenuFactory();
		factoryTest.createMenu();

	}

}
