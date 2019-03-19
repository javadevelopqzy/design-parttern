package decorate.impl.decorate;

import decorate.impl.*;

/**
 * 豆浆调料的一种，实现了价格方法
 */
public class Soy extends Decorate {

	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() + 15;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "，Soy";
	}
}
