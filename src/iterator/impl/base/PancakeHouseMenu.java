package iterator.impl.base;

import java.util.*;

/**
 * 煎饼屋，负责供应早餐
 */
public class PancakeHouseMenu implements Iterable<MenuItem> {

	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<>();
		addMenuItem("ph1", "ph1", false, 1.2);
		addMenuItem("ph2", "ph2", false, 1.35);
		addMenuItem("ph3", "ph3", false, 1.1);
		addMenuItem("ph4", "ph4", true, 1.4);
	}

	public void addMenuItem(String name, String description, boolean vegetarian, double price) {
		menuItems.add(new MenuItem(name, price, vegetarian, description));
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	public Iterator<MenuItem> iterator() {
		return menuItems.iterator();
	}
}
