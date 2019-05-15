package adapter.impl.other;

/**
 * 这是一只野生的土鸡，会咯咯叫、会飞
 */
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("WildTurkey gobble");
	}

	@Override
	public void fly() {
		System.out.println("WildTurkey fly");
	}
}
