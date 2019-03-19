package decorate.impl.decorate;

import decorate.impl.*;

public class Milk extends Decorate {

	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() + 10;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "，Mike";
	}
}
