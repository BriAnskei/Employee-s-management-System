import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

class EmployeeManagementSystem {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, int id, double salary) {
        Employee employee = new Employee(name, id);
        employee.setSalary(salary);
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void updateSalary(String name, double salary) {
        for (Employee employee : employees) {
            if (name.equals(employee.getName())) {
                employee.setSalary(salary);
                System.out.println("Salary updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void displayEmployeesDetails() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}

public class Main {
    private static EmployeeManagementSystem em = new EmployeeManagementSystem();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Employee Management System");
        option();
        sc.close();
    }

    public static void option() {
        int option = 0;
        while (option != 4) {
            System.out.println("[1] Add Employee");
            System.out.println("[2] Update Salary");
            System.out.println("[3] Display all Employees' Details");
            System.out.println("[4] Exit");
            System.out.print("Option: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Employee's Name: ");
                    String name = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    em.addEmployee(name, id, salary);
                    break;
                case 2:
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("Salary: ");
                    double d = sc.nextDouble();
                    em.updateSalary(n, d);
                    break;
                case 3:
                    System.out.println();
                    em.displayEmployeesDetails();
                    break;
                case 4:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }
}
