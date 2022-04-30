import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
		
		List<Employee> employee= Database.getEmployee();
		
		/*
		 * Collections.sort(employee, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o, Employee o1) {
		 * 
		 * return (int) (o.getSalary()-o1.getSalary()); }});
		 */
		
		 Collections.sort(employee, (o,o1) ->  (int)(o.getSalary()-o1.getSalary()));
	
		
		System.out.println("employee"+employee);
		
		employee.stream().sorted((o,o1) ->  (int)(o.getSalary()-o1.getSalary())).forEach(s -> System.out.println(s));

		//System.out.println("employee"+employee);
		
		employee.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
		
		employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	}
}

/*class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o, Employee o1) {

		return (int) (o.getSalary()-o1.getSalary());
	}
	
	
}*/
