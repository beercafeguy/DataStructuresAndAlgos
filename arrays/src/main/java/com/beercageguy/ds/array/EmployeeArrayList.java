package com.beercageguy.ds.array;

import java.util.Arrays;

public class EmployeeArrayList {
    private Employee[] employees;
    private int nEmployees;

    public EmployeeArrayList(){
        employees=new Employee[10];
        nEmployees=0;
    }

    public void insert(Employee employee){
        if(nEmployees >=(employees.length * 0.7)){
            expend();
        }
        employees[nEmployees]=employee;
        nEmployees++;
    }

    public int getNumEmployees(){
        return nEmployees;
    }
    public void display(){
        Arrays.stream(employees).filter(x->x!=null).forEach(System.out::println);
    }

    private void expend(){
        int newLength=employees.length * 2;
        Employee[] tmp=new Employee[newLength];
        for(int i=0;i<nEmployees;i++){
            tmp[i]=employees[i];
        }
        employees=tmp;
    }
}
