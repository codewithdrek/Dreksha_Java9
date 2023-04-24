package com.PreDefineFunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Emplyoee> arrayList = new ArrayList<Emplyoee>();

		populate(arrayList);

		// first Condition
		Predicate<Emplyoee> p1 = s -> s.designation.equals("CEO");
		System.out.println("CEO information: ");
		displayModeD(p1, arrayList);

		// Second Condition
		Predicate<Emplyoee> p2 = s -> s.designation.equals("Director");
		System.out.println("Director information: ");
		displayModeD(p2, arrayList);

		// Third Condition
		Predicate<Emplyoee> p3 = s -> s.city.equals("Bangalore");
		System.out.println("Bangalore information: ");
		displayModeD(p3, arrayList);

		// Fourth Condition
		Predicate<Emplyoee> p4 = s -> s.salary >= 41200;
		System.out.println("Salary information: ");
		displayModeD(p4, arrayList);

		// Fifth Condition and()
		System.out.println("CEO and Bangalore  information: ");
		displayModeD(p1.and(p3), arrayList);

		// Six Condition negate()
		System.out.println("or information: ");
		displayModeD(p1.or(p3), arrayList);

		// 7th Condition negate()
		System.out.println("negate information: ");
		displayModeD(p4.negate(), arrayList);

		// System.out.println(arrayList);
		// System.out.println(Arrays.asList(arrayList));
		// System.out.println(arrayList.toArray().toString());

	}

	private static void displayModeD(Predicate<Emplyoee> p, ArrayList<Emplyoee> arrayList1) {
		for (Emplyoee emplyoee : arrayList1) {

			if (p.test(emplyoee)) {
				System.out.println(emplyoee);
			}
		}
	}

	static void populate(ArrayList<Emplyoee> arrayList) {
		arrayList.add(new Emplyoee("Dreksha", 12000, "Snr Software", "Bangalore"));
		arrayList.add(new Emplyoee("Pksha", 1000, "CEO", "Banagalore"));
		arrayList.add(new Emplyoee("Vreksha", 41200, "Software", "Delhi"));
		arrayList.add(new Emplyoee("Ereksha", 42000, "CEO", "Bangalore"));
		arrayList.add(new Emplyoee("Hreksha", 322000, "Director", "Pune"));
	}
}