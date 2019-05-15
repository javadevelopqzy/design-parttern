package adapter.impl.raw;

/**
 * 绿头鸭，会飞、会叫
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("MallardDuck quack");
	}

	@Override
	public void fly() {
		System.out.println("MallardDuck fly");
	}
}
