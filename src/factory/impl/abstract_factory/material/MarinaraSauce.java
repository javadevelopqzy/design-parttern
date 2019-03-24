package factory.impl.abstract_factory.material;

// 酱料的实现："意大利西红柿酱"
public class MarinaraSauce implements Sauce {

	@Override
	public void description() {
		System.out.println("MarinaraSauce：意大利西红柿酱");
	}
}
