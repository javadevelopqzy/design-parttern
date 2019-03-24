package factory.impl.product;

import factory.impl.abstract_factory.ingredient.PizzaIngredientFactory;

public class NYCheesePizza extends Pizza {

	private PizzaIngredientFactory factory;

	public NYCheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("NYCheesePizza prepare");
		factory.createSauce().description();
		factory.createCheese().description();
		factory.createDough().description();
	}

	@Override
	public void bake() {
		System.out.println("NYCheesePizza bake");
	}

	@Override
	public void cut() {
		System.out.println("NYCheesePizza cut");
	}

	@Override
	public void box() {
		System.out.println("NYCheesePizza box");
	}
}
