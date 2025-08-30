package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Component interface
public abstract class Employee {
    protected String name;
    protected String position;
    protected double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public abstract void add(Employee employee);
    public abstract void remove(Employee employee);
    public abstract void print();
    public abstract double calculateTotalSalary();
}

// Leaf class
class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, "Developer", salary);
    }

    @Override
    public void add(Employee employee) {
        System.out.println("Cannot add to a Developer");
    }

    @Override
    public void remove(Employee employee) {
        System.out.println("Cannot remove from a Developer");
    }

    @Override
    public void print() {
        System.out.println("Developer - Name: " + name + ", Salary: " + salary);
    }

    @Override
    public double calculateTotalSalary() {
        return salary;
    }
}

// Composite class
class Manager extends Employee {
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, double salary) {
        super(name, "Manager", salary);
    }

    @Override
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("Manager - Name: " + name + ", Salary: " + salary);
        System.out.println("Subordinates of " + name + ":");
        for (Employee employee : subordinates) {
            employee.print();
        }
    }

    @Override
    public double calculateTotalSalary() {
        double totalSalary = salary;
        for (Employee employee : subordinates) {
            totalSalary += employee.calculateTotalSalary();
        }
        return totalSalary;
    }
}
