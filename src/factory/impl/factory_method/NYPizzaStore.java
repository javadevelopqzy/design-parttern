package factory.impl.factory_method;

import factory.impl.product.*;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza;
		// 创建披萨的方式与披萨制作耦合，将来披萨增多这里需要反复修改
		if (type.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new NYClamPizza();
		} else {
			pizza = new NYCheesePizza();
		}
		return pizza;
	}
}
