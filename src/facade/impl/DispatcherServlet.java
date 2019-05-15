package facade.impl;

public class DispatcherServlet {

	private HandlerMapping handlerMapping;

	private HandlerAdapter handlerAdapter;

	public DispatcherServlet(HandlerMapping handlerMapping, HandlerAdapter handlerAdapter) {
		this.handlerMapping = handlerMapping;
		this.handlerAdapter = handlerAdapter;
	}

	/**
	 * 典型的facade模式，把handlerMapping和handlerAdapter封装到一个方法执行
	 */
	public void doDispatcher() {
		handlerMapping.getHandler();
		handlerAdapter.handler();
	}
}
