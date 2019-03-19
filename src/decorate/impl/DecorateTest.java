package decorate.impl;

import decorate.impl.concrete.*;
import decorate.impl.decorate.*;

public class DecorateTest {

	public static void main(String[] args) {
		/** 摩卡+奶泡的深培 */
		// 创建一个深培
		DarkRoast darkRoast = new DarkRoast();
		// 用摩卡装饰
		Mocha mocha = new Mocha(darkRoast);
		// 再用奶泡装饰
		Whip whip = new Whip(mocha);
		// 计算价格
		System.out.println(whip.cost());

		/** 双倍摩卡的浓缩咖啡 */
		Espresso espresso = new Espresso("Espresso");
		Mocha m = new Mocha(espresso);
		Mocha m2 = new Mocha(m);
		System.out.println(m2.cost());
	}
}
