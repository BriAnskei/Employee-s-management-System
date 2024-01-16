import java.util.ArrayList;
import java.util.Scanner;

/**
 * Innerquiz
 */
class Employee {
    private String name;
    private int ID;
    private double salary;

    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + ID + ", name='" + name + "', salary=" + salary + '}';
    }

}

class EmployeeManagement {
    private ArrayList<Employee> EmployeeManagement = new ArrayList<>();

    public void addEmployee(String name, int ID, double salary) {
        //// Add Employee
        Employee employee = new Employee(name, ID);
        employee.setSalary(salary);
        EmployeeManagement.add(employee);

    }

    public void updateSalary(String name, double salary) {
        // Update salary
        for (Employee employee : EmployeeManagement) {
            if (name.equals(employee.getName())) {
                employee.setSalary(salary);
                break;
            }
        }

    }

    public void displayemployeesDetails() {
        // display all emplyee's Detail's
        for (Employee employee : EmployeeManagement) {
            System.out.println(employee + "\n");
        }
    }

}

public class quiz {
    private static EmployeeManagement em = new EmployeeManagement();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Employee's management System");
        Option();

        sc.close();
    }

    public static void Option() {
        int option = 0;
        while (option != 5) {
            System.out.println("[1] Add Employee");
            System.out.println("[2] Update Salary");
            System.out.println("[3] Display all Emplyee's Detail's");
            System.out.println("[4] Exit");
            System.out.print("Option: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Emplyee's Name: ");
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
                    System.out.println("Salary: ");
                    double d = sc.nextDouble();

                    em.updateSalary(n, d);
                    break;
                case 3:
                    System.out.println();
                    em.displayemployeesDetails();
                    break;
                case 4:
                    System.out.println("Exiting.....");

                default:
                    System.out.println("Invalid Input!");
                    break;
            }

        }

    }

}
