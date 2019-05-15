package facade.impl;

public class FacadeTest {

	public static void main(String[] args) {
		DispatcherServlet dispatcherServlet = new DispatcherServlet(() -> System.out.println("handlerMapping"), () -> System.out.println("handlerAdapter"));
		dispatcherServlet.doDispatcher();
	}
}
