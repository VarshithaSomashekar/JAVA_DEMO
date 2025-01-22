import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Operations implements Funcitons{ //INTERFACE
    
    List<Employee> empList = new ArrayList<>();  //COLLECTIONS
    
    public void addEmployee() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee name:");
        String name = scanner.next();
        System.out.println("Enter Employee Age");
        int age = scanner.nextInt();
        System.out.println("Enter Employee ID");
        int employeeID = scanner.nextInt();
        System.out.println("Enter department");
        String department = scanner.next();
        System.out.println("Enter salary");
        double salary = scanner.nextDouble();

        //this.empsalary.put(name , salary);

        Employee emp = new Employee(name, age, employeeID, salary, department);
        empList.add(emp);
        System.out.println("\n-----Employee Details-------\n1");
        System.out.println("Name :" + emp.name +
        "\n Age: " + emp.age +
        "\nEmployee ID: " + emp.employeeID +
        "\nDepartment: " + emp.department +
        "\nSalary: " + emp.salary);
        
        //scanner.close();
    }

    public void getEmployee(){

        System.out.println("Employee List:");
        empList.forEach(System.out::println);   //STREAM API

    }

    public void displayDeptEmployee(){
        System.out.println("Enter the department");
        Scanner scanner = new Scanner(System.in);
        String department = scanner.next();
        if( !department.equals("IT") && !department.equals("HR") && !department.equals("FINANCE"))
        {
            throw new IllegalArgumentException("invalid department");   //EXCEPTION HANDLING
        }

        empList.stream()
                .filter(emp -> emp.getDepartment().equals(department))
                .forEach(emp -> System.out.println(emp));

        //scanner.close();
    }

    public void salaryIncrement(){
        empList.stream()    //STREAM API
                .map(emp -> emp.salary = emp.getSalary() + 10000)
                .forEach(emp -> System.out.println("New salary: " + emp));
    }

}
