package template.impl;

public class TemplateTest {

	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		tea.prepareRecipe();
		System.out.println("------------------------------------");
		coffee.prepareRecipe();
	}
}
