package singleton;

import java.util.concurrent.*;

public class SingletonTest {

	public static void main(String[] args) {
		// 测试懒汉的单例
		testLazySingletonConcurrent(LazyInitSingleton.class);

		System.out.println("----------------------双重检查机制----------------------");
		// 测试双重检查机制的单例
		testLazySingletonConcurrent(DoubleCheckSingleton.class);

		// 测试静态内部类创建单例
		System.out.println(InnerClassSingleton.getInstance());
	}

	/**
	 * 10个线程并发测试单例模式的弊端
	 */
	private static void testLazySingletonConcurrent(Class<?> clazz) {
		ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
		for (int i = 0; i < 10; i++) {
			pool.execute(() -> {
				try {
					cyclicBarrier.await();
					if (clazz == LazyInitSingleton.class) {
						System.out.println(LazyInitSingleton.getInstance());
					} else if (clazz == DoubleCheckSingleton.class) {
						System.out.println(DoubleCheckSingleton.getInstance());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}
		while (pool.getActiveCount() > 0) {
		}
		pool.shutdown();
	}
}
