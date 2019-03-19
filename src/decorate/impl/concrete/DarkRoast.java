package decorate.impl.concrete;

import decorate.impl.*;

/**
 * 深培，饮料的一种
 */
public class DarkRoast extends Beverage {

	@Override
	public double cost() {
		return 0.99;
	}
}
