package iterator.impl.iterator;

import java.util.*;

import iterator.impl.base.*;

/**
 * 餐厅迭代器
 */
public class DinnerIterator implements Iterator<MenuItem> {

	private MenuItem[] menuItems;

	private int index;

	public DinnerIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		return index < menuItems.length && menuItems[index] != null;
	}

	@Override
	public MenuItem next() {
		return menuItems[index++];
	}
}
