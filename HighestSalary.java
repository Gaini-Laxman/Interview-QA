package com.klinnovations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaximumSalary {
	public static void main(String args[]) {

		Employee e1 = new Employee("Laxman", 130000.00);
		Employee e2 = new Employee("Karthik", 100000.00);
		Employee e3 = new Employee("Vinith", 80000.00);
		Employee e4 = new Employee("Anand", 50000.00);
		Employee e5 = new Employee("Vamshi", 56000.00);

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);

		//Max Salary
		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		System.out.println("Max Salary :" + max.get().salary);
		
                                  //Min Salary
		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		System.out.println("Min Salary :" + min.get().salary);
		
		
                                   //Average Salary
		Double avarageSalary = list.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println("Average Salary :" + avarageSalary);
		
		
                                  //Second Highest Salary
		Optional<Employee> secondHeighest = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(1).findFirst();
		System.out.println("Second Heighest Salary :" +secondHeighest.get().salary);

		
		//Third Highest Salary
		Optional<Employee> thirdHeighest = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(2).findFirst();
		System.out.println("Third Heighest Salary :" +thirdHeighest.get().salary);

	}
}