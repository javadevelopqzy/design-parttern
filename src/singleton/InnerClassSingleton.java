package singleton;

/**
 * 使用静态内部类创建单例
 */
public class InnerClassSingleton {

	private InnerClassSingleton() {
		System.out.println("初始化啦！");
	}

	public static InnerClassSingleton getInstance() {
		return InnerClass.singleton;
	}

	private static class InnerClass {

		private static InnerClassSingleton singleton = new InnerClassSingleton();
	}
}
