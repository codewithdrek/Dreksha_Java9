package com.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class COMPARE {

	public static void main(String[] args) {
		List<Human> humans = Arrays.asList(new Human("ASHA", 10), new Human("Jack", 12));
		//List<Human> humans = Arrays.asList(new Human("ASHA", 10),null);

		Comparator<Human> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

		// List<Human> sortedHumans =
		// humans.stream().sorted(nameComparator).collect(Collectors.toList());
		// reversed
		List<Human> sortedHumans = humans.stream().sorted(nameComparator.reversed()).collect(Collectors.toList());
		humans.sort(Comparator.nullsLast(Comparator.comparing(Human::getName)));

		//List<Human> humans1 = List.asList(null, new Human("Jack", 12), null);
		//humans1.sort(Comparator.nullsFirst(Comparator.comparing(Human::getName)));

		
		/*
		 * for (Human human : sortedHumans) { System.out.println(human.getName()); }
		 */

	}
}
