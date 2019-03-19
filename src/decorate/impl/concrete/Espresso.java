package decorate.impl.concrete;

import decorate.impl.*;

/**
 * 浓缩咖啡，是饮料的一种
 */
public class Espresso extends Beverage {

	public Espresso(String description) {
		this.description = description;
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
