package template.impl;

/**
 * 泡咖啡需要烧水、冲上咖啡粉、导入热水、添加糖和牛奶
 */
public class Coffee extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("brewCoffeeGrind");
	}

	@Override
	public void addCondiments() {
		System.out.println("addSugarAndMilk");
	}
}
