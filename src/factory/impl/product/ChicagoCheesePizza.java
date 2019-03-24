package factory.impl.product;

import factory.impl.abstract_factory.ingredient.PizzaIngredientFactory;

public class ChicagoCheesePizza extends Pizza {

	private PizzaIngredientFactory factory;

	public ChicagoCheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("ChicagoCheesePizza prepare");
		factory.createSauce().description();
		factory.createCheese().description();
		factory.createDough().description();
	}

	@Override
	public void bake() {
		System.out.println("ChicagoCheesePizza bake");
	}

	@Override
	public void cut() {
		System.out.println("ChicagoCheesePizza cut");
	}

	@Override
	public void box() {
		System.out.println("ChicagoCheesePizza box");
	}
}
