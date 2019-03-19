package decorate.impl.decorate;

import decorate.impl.*;

/**
 * 奶泡，调料的一种
 */
public class Whip extends Decorate {

	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() + 10;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "，Whip";
	}
}
