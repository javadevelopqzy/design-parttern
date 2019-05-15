package adapter.impl.adapter;

import adapter.impl.other.*;
import adapter.impl.raw.*;

/**
 * 现需要一个鸭子对象，但是没有鸭子，只能用火鸡来冒充，于是出现了火鸡适配器
 * 实现了Duck接口
 */
public class TurkeyAdapter implements Duck {

	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}
}
