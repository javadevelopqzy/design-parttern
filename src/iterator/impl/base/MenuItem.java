package iterator.impl.base;

/**
 * 菜单类，有属性：名称、价格、是否是素食、描述
 */
public class MenuItem {

	private String name;

	private double price;

	private boolean vegetarian;

	private String description;

	public MenuItem(String name, double price, boolean vegetarian, String description) {
		this.name = name;
		this.price = price;
		this.vegetarian = vegetarian;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "MenuItem{" +
				"name='" + name + '\'' +
				", price=" + price +
				", vegetarian=" + vegetarian +
				", description='" + description + '\'' +
				'}';
	}
}
