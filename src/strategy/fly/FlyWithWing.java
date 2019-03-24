package strategy.fly;

public class FlyWithWing implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("wing");
	}
}
