package adapter.impl;

import adapter.impl.adapter.*;
import adapter.impl.other.*;
import adapter.impl.raw.*;

public class AdapterTest {

	public static void main(String[] args) {
		Turkey wildTurkey = new WildTurkey();

		Duck duck = new TurkeyAdapter(wildTurkey);

		duck.fly();
		duck.quack();
	}
}
