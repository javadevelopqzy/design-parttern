package factory.impl.factory_method;

public class FactoryMethodTest {

	public static void main(String[] args) {
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

		nyPizzaStore.orderPizza("chesse");
		System.out.println("纽约风味的披萨制作完毕");

		chicagoPizzaStore.orderPizza("chesse");
		System.out.println("芝加哥风味的披萨制作完毕");
	}
}
