package singleton;

import java.util.*;

/**
 * 双重检查机制单例
 */
public class DoubleCheckSingleton {

	/**
	 * 对象的唯一ID
	 */
	private String id;

	private volatile static DoubleCheckSingleton singleton;

	private DoubleCheckSingleton() {
		this.id = UUID.randomUUID().toString();
	}

	public static DoubleCheckSingleton getInstance() {
		if (singleton == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (singleton == null) {
					singleton = new DoubleCheckSingleton();
				}
			}
		}
		return singleton;
	}

	@Override
	public String toString() {
		return id;
	}
}
