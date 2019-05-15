package template.impl;

/**
 * 咖啡因饮料的基类
 */
public abstract class CaffeineBeverage {

	public void prepareRecipe() {
		// 烧水
		boilWater();
		// 冲泡
		brew();
		// 导入水
		pourInCup();
		// 加入调料
		addCondiments();
	}

	/**
	 * 烧水
	 */
	public void boilWater() {
		System.out.println("boilWater");
	}

	/**
	 * 倒入杯子中
	 */
	public void pourInCup() {
		System.out.println("pourInCup");
	}

	public abstract void brew();

	public abstract void addCondiments();
}
