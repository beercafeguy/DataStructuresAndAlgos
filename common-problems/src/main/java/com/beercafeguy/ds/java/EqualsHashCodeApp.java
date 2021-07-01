package com.beercafeguy.ds.java;

import java.util.HashSet;

public class EqualsHashCodeApp {

    public static void main(String[] args) {

        Employee e1=new Employee(1,"Hem","Chandra","IT");
        Employee e2=new Employee(1,"Nidhi","Namita","HR");

        HashSet<Employee> employees=new HashSet<>();
        employees.add(e1);
        employees.add(e2);

        for(Employee employee:employees){

            System.out.println(employee.hashCode());
        }
    }
}

class Employee{

    private Integer id;
    private String firstname;
    private String lastName;
    private String department;

    public Employee(Integer id, String firstname, String lastName, String department) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int hashCode() {
        final int PRIME= 31;
        int result=1;
        result = PRIME * result + getId();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Employee && this.id == ((Employee) o).id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}


