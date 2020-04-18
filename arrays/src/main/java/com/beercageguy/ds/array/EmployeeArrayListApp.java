package com.beercageguy.ds.array;

public class EmployeeArrayListApp {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Hem",34,45.6d);
        Employee e2=new Employee(1,"Hem",34,45.6d);
        Employee e3=new Employee(1,"Hem",34,45.6d);
        Employee e4=new Employee(1,"Hem",34,45.6d);
        Employee e5=new Employee(1,"Hem",34,45.6d);
        Employee e6=new Employee(1,"Hem",34,45.6d);
        Employee e7=new Employee(1,"Hem",34,45.6d);
        Employee e8=new Employee(1,"Hem",34,45.6d);
        Employee e9=new Employee(1,"Hem",34,45.6d);
        Employee e10=new Employee(1,"Hem",34,45.6d);
        Employee e11=new Employee(1,"Hem",34,45.6d);
        Employee e12=new Employee(1,"Hem",34,234.6d);

        EmployeeArrayList eal=new EmployeeArrayList();
        eal.insert(e1);
        eal.insert(e2);
        eal.insert(e3);
        eal.insert(e4);
        eal.insert(e5);
        eal.insert(e6);
        eal.insert(e7);
        eal.insert(e8);
        eal.insert(e9);
        eal.insert(e10);
        eal.insert(e11);
        eal.insert(e12);

        eal.display();
        System.out.println("Number of employees: "+eal.getNumEmployees());
    }
}
