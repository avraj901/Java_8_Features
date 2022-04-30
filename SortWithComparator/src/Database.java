import java.util.ArrayList;
import java.util.List;

public class Database {

	public static List<Employee> getEmployee(){
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(176, "Roshan", "IT", 60000));
		list.add(new Employee(176, "Roshan", "IT", 90000));
		list.add(new Employee(176, "Roshan", "IT", 50000));
		list.add(new Employee(176, "Roshan", "IT", 40000));
		list.add(new Employee(176, "Roshan", "IT", 120000));
		return list;
	}
	}
