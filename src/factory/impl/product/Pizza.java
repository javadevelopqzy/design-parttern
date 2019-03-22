package factory.impl.product;

import java.util.*;

/**
 * 披萨产品通用的接口，包含了准备、烘烤、切块、装盒的方法
 */
public abstract class Pizza {

	private String name;

	// 面粉
	String dough;

	// 酱料
	String sauce;

	// 佐料
	ArrayList<String> toppings = new ArrayList<>();

	public abstract void prepare();

	public abstract void bake();

	public abstract void cut();

	public abstract void box();
}
