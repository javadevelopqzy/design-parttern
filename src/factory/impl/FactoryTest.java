package factory.impl;

import factory.impl.factory_method.ChicagoPizzaStore;
import factory.impl.factory_method.NYPizzaStore;

public class FactoryTest {

	public static void main(String[] args) {
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

		nyPizzaStore.orderPizza("cheese");
		System.out.println("纽约风味的披萨制作完毕");

		chicagoPizzaStore.orderPizza("cheese");
		System.out.println("芝加哥风味的披萨制作完毕");
	}
}
