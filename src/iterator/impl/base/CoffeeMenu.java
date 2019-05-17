package iterator.impl.base;

import java.util.*;

public class CoffeeMenu implements Iterable<MenuItem> {

	HashMap<String, MenuItem> menuItemHashMap = new HashMap<>();

	public CoffeeMenu() {
		addMenuItem("cm1", "cm1", false, 1.9);
		addMenuItem("cm2", "cm2", false, 1.65);
		addMenuItem("cm3", "cm3", false, 1.7);
		addMenuItem("cm4", "cm4", true, 1.8);
	}

	public void addMenuItem(String name, String description, boolean vegetarian, double price) {
		menuItemHashMap.put(name, new MenuItem(name, price, vegetarian, description));
	}

	public Iterator<MenuItem> iterator() {
		return menuItemHashMap.values().iterator();
	}
}
