package adapter.impl.adapter;

import adapter.impl.other.*;
import adapter.impl.raw.*;

/**
 * 鸭子适配器对象，可以适配火鸡
 */
public class DuckAdapter implements Turkey {

	private Duck duck;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		duck.fly();
	}
}
