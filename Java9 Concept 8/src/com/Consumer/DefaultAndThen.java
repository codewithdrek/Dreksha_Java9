package com.Consumer;

import java.util.function.Consumer;

class MovieChainExample {

	String name;
	String result;

	public MovieChainExample(String name, String result) {
		this.name = name;
		this.result = result;
	}

}

public class DefaultAndThen {
	// consureChaning is possible yes
//c1.antThen(c2).andThen(c3).accept(m);
	public static void main(String[] args) {
		MovieChainExample m = new MovieChainExample("PREAM", "HIT");
		Consumer<MovieChainExample> c1 = m1 -> System.out.println("Movie " + m1.name + "HIT");
		Consumer<MovieChainExample> c2 = m2 -> System.out.println("Movie " + m2.name + "FLOP");
		Consumer<MovieChainExample> c3 = m3 -> System.out.println("Movie " + m3.name + "AVA");
		Consumer<MovieChainExample> c4 = m4 -> System.out.println("Movie " + m4.name + "MEDIUm");

		Consumer<MovieChainExample> cc = c1.andThen(c2).andThen(c3).andThen(c4);

		cc.accept(m);
		MovieChainExample m1 = new MovieChainExample("DIL", "HIT");

		cc.accept(m1);

	}
}
