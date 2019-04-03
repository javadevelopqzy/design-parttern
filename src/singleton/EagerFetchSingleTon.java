package singleton;

/**
 * 恶汉模式的单例
 */
public class EagerFetchSingleTon {

	private static EagerFetchSingleTon instance = new EagerFetchSingleTon();


	private EagerFetchSingleTon() {

	}

	public static EagerFetchSingleTon getInstance() {
		return instance;
	}

}
