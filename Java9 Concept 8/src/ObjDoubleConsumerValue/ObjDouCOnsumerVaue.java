package ObjDoubleConsumerValue;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

public class ObjDouCOnsumerVaue {

	public static void main(String[] args) {
		ArrayList<Employee>  al = new ArrayList<>();
		populate(al);
		
		
		ObjDoubleConsumer<Employee> consumer= (e,d)->e.salary=e.salary+d;
	
		for (Employee employee : al) {
		consumer.accept(employee, 900.00);
		}
		
		for (Employee employee : al) {
		System.out.println(employee.salary);
		System.out.println(employee.id);
		}
		
	}

	private static void populate(ArrayList<Employee> al) {

		al.add(new Employee(1, 12));
		al.add(new Employee(3, 17));
	}
}
