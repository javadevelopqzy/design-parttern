package factory.impl.abstract_factory.ingredient;

import factory.impl.abstract_factory.material.Cheese;
import factory.impl.abstract_factory.material.Dough;
import factory.impl.abstract_factory.material.Sauce;

/**
 * 披萨原料的抽象工厂，定义披萨原料的创建方法
 */
public interface PizzaIngredientFactory {

	Dough createDough();

	Cheese createCheese();

	Sauce createSauce();
}
