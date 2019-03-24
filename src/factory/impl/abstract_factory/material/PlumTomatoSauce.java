package factory.impl.abstract_factory.material;

// 酱料的实现：“李子番茄酱”
public class PlumTomatoSauce implements Sauce {

	@Override
	public void description() {
		System.out.println("PlumTomatoSauce：李子番茄酱");
	}
}
