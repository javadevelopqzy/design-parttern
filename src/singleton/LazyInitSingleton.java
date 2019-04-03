package singleton;

import java.util.*;

/**
 * 懒汉模式，缺点：并发下会出现多实例，详见{@link SingletonTest#testLazySingletonConcurrent(Class)}
 */
public class LazyInitSingleton {

	/**
	 * 对象的唯一ID
	 */
	private String id;

	private static LazyInitSingleton singleton;

	private LazyInitSingleton() {
		this.id = UUID.randomUUID().toString();
	}

	public static LazyInitSingleton getInstance() {
		if (singleton == null) {
			singleton = new LazyInitSingleton();
		}
		return singleton;
	}

	@Override
	public String toString() {
		return id;
	}
}
