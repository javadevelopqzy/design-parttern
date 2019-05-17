package iterator.impl.base;

import java.util.*;

/**
 * 餐厅的服务员，负责打印菜单
 */
public class AliceService {

	private Iterable<MenuItem> dinerMenu;

	private Iterable<MenuItem> pancakeHouseMenu;

	private Iterable<MenuItem> coffeeMenu;

	public AliceService(Iterable<MenuItem> dinerMenu, Iterable<MenuItem> pancakeHouseMenu, Iterable<MenuItem> coffeeMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.coffeeMenu = coffeeMenu;
	}

	public void printMenu() {
		printMenu(dinerMenu.iterator());
		System.out.println("-----------------");
		printMenu(pancakeHouseMenu.iterator());
		System.out.println("-----------------");
		printMenu(coffeeMenu.iterator());
	}

	private void printMenu(Iterator<MenuItem> itemIterator) {
		while (itemIterator.hasNext()) {
			System.out.println(itemIterator.next());
		}
	}
}
