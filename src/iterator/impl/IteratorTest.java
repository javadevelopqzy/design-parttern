package iterator.impl;

import iterator.impl.base.*;

public class IteratorTest {

	public static void main(String[] args) {
		AliceService aliceService = new AliceService(new DinerMenu(), new PancakeHouseMenu(), new CoffeeMenu());
		aliceService.printMenu();
	}
}
