package factory.impl.abstract_factory.material;

// 面团的具体实现："薄面皮"
public class ThinCrustDough implements Dough {

	@Override
	public void description() {
		System.out.println("ThinCrustDough：薄面皮");
	}
}
