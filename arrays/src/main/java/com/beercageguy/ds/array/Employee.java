package com.beercageguy.ds.array;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() &&
                getAge() == employee.getAge() &&
                Double.compare(employee.getSalary(), getSalary()) == 0 &&
                getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getSalary());
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getSalary() >o.getSalary())
                return 1;
        else if (this.getSalary() == o.getSalary())
            return 0;
        else
            return -1;
    }
}
