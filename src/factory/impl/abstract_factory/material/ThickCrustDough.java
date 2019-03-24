package factory.impl.abstract_factory.material;

// 面团的具体实现："厚面皮"
public class ThickCrustDough implements Dough {

	@Override
	public void description() {
		System.out.println("ThickCrustDough：厚面皮");
	}
}
