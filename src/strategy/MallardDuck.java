package strategy;

import strategy.fly.FlyWithWing;
import strategy.quack.Quack;

public class MallardDuck extends Duck {

	MallardDuck() {
		flyBehavior = new FlyWithWing();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("mallard");
	}
}
