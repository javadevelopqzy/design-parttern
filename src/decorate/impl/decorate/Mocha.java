package decorate.impl.decorate;

import decorate.impl.*;

public class Mocha extends Decorate {

	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() + 20;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "，Mocha";
	}
}
