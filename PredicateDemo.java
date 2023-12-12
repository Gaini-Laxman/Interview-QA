import java.util.function.*;
import java.util.function.Predicate;
import java.lang.StringBuilder;
import java.util.*;

public class PredicateDemo{
public static void main(String [ ] args){

Employee e1 = new Employee("Laxman", 30);
Employee e2 = new Employee("Anitha", 28);
Employee e3 = new Employee("VikramAditya" ,10);

List<Employee>emps = Arrays.asList(e1,e2,e3);
Predicate<Integer>p = a->a>20;

for(Employee employee : emps){
if(p.test(employee)){
System.out.println(employee.name);
}
}
}
}
