package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpresionComparatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaExpresionComparatorApplication.class, args);
		
		Employee employee = new Employee();
		employee.setId(0);
		employee.setName("avanish");
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Rau");
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Durga");
		ArrayList<Employee> arryListEmp = new ArrayList<Employee>();
		arryListEmp.add(employee);
		arryListEmp.add(employee1);
		arryListEmp.add(employee2);
		System.out.println("Array List"+arryListEmp);
		Collections.sort(arryListEmp, (e1,e2) -> e2.getName().compareTo(e1.getName()));
		System.out.println("Sorting b name"+ arryListEmp);
		Collections.sort(arryListEmp, (e1,e2) -> e1.getId()<e2.getId()?-1:e1.getId()>e2.getId()?1:0);
		System.out.println("Sorting based on Id "+ arryListEmp);
	}
	
	

}
