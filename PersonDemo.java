package com.klinnovations;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Person(1, "Laxman", "Dev", "Hyd");
        Person p2 = new Person(2, "Anitha", "Tester", "Hyd");
        Person p3 = new Person(3, "Karthik", "IOS", "Chennai");
        Person p4 = new Person(4, "Vamshi", "IOS", "Chennai");
        Person p5 = new Person(5, "Vinith", "Java", "Banglore");
        Person p6 = new Person(6, "Anand", "Fullstack", "Banglore");

        List<Person> list = Arrays.asList(p1, p2, p3, p4, p5, p6);

        List<Person> persons = list.stream()
                .filter(p -> p.location.equals("Hyd"))
                .filter(p->p.dept.equals("Dev"))
                .collect(Collectors.toList());

        persons.forEach(i->System.out.println("location :"+i.location+ ", Dept :"+i.dept));
    }
}
