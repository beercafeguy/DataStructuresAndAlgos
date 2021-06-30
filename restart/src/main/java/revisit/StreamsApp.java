package revisit;

import java.util.stream.Stream;

public class StreamsApp {


    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

        Stream.of(arrayOfEmps).forEach(emp -> emp.increaseSal(10));

        System.out.println(arrayOfEmps[0].salary);;
    }
}


class Employee{
    int id;
    String name;
    double salary;


    void increaseSal(double inc){
        salary=salary+inc;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}