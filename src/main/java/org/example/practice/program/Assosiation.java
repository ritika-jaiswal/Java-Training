package org.example.practice.program;

import java.util.HashSet;
import java.util.Set;

class Bank {
    private String name;
    private Set<Employee> employees;

    Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }

    public void setEmployee(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return this.employees;
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

public class Assosiation {
    public static void main(String[] args) {
        Bank bank = new Bank("ICICI");
        Bank bank1 = new Bank("HDFC");
        Employee emp = new Employee("Ritika");
        Employee emp1 = new Employee("Muskan");

        Set<Employee> employee = new HashSet<>();
        employee.add(emp);
        employee.add(emp1);

        bank.setEmployee(employee);
        System.out.println(emp.getEmployeeName() + " belongs to bank " + bank.getBankName());
        System.out.println(emp1.getEmployeeName() + " belongs to bank " + bank1.getBankName());
    }

}
