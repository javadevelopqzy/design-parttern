package iterator.impl.base;

import java.util.*;

import iterator.impl.iterator.*;

/**
 * 餐厅菜单，负责供应午餐
 */
public class DinerMenu implements Iterable<MenuItem> {

	private final int MAX_LENGTH = 6;

	MenuItem[] menuItems;

	int numberOfItem = 0;

	public DinerMenu() {
		this.menuItems = new MenuItem[MAX_LENGTH];
		addMenuItem("d1", "d1", false, 1.2);
		addMenuItem("d2", "d2", false, 1.35);
		addMenuItem("d3", "d3", false, 1.1);
		addMenuItem("d4", "d4", true, 1.4);
	}

	public void addMenuItem(String name, String description, boolean vegetarian, double price) {
		if (numberOfItem >= MAX_LENGTH) {
			System.out.println("已经最大了，无法再加菜了");
		} else {
			menuItems[numberOfItem++] = new MenuItem(name, price, vegetarian, description);
		}
	}

	public Iterator<MenuItem> iterator() {
		return new DinnerIterator(menuItems);
	}
}
