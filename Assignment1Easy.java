import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getid() { return id; }
    public String getname() { return name; }
    public double getsalary() { return salary; }

    public void setname(String name) { this.name = name; }
    public void setsalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Assignment1Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Display Employees");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    employees.add(new Employee(id, name, salary));
                    System.out.println("Employee added successfully.");
                    break;
                
                case 2: 
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = scanner.nextInt();
                    for (Employee emp : employees) {
                        if (emp.getid() == updateId) {
                            scanner.nextLine(); 
                            System.out.print("Enter new Name: ");
                            emp.setname(scanner.nextLine());
                            System.out.print("Enter new Salary: ");
                            emp.setsalary(scanner.nextDouble());
                            System.out.println("Employee updated successfully.");
                            break;
                        }
                    }
                    break;
                
                case 3: 
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    employees.removeIf(emp -> emp.getid() == removeId);
                    System.out.println("Employee removed successfully.");
                    break;
                
                case 4: 
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    for (Employee emp : employees) {
                        if (emp.getid() == searchId) {
                            System.out.println(emp);
                            break;
                        }
                    }
                    break;
                
                case 5: 
                    System.out.println("\nEmployee List:");
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
