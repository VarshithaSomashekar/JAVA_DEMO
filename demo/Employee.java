public class Employee extends Person{
    
    int employeeID;
    double salary;
    String department;

    public Employee(String name , int age ,int employeeID, double salary, String department) {
        super(age,name);
        setEmployeeID(employeeID);
        setSalary(salary);
        setDepartment(department);
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        if( !department.equals("IT") && !department.equals("HR") && !department.equals("FINANCE"))
        {
            throw new IllegalArgumentException("invalid department");
        }
        this.department = department;
    }

@Override
public String toString() {  //POLYMORPHISM
    // TODO Auto-generated method stub
    return "\n Name: "+ this.name+
            "\n Age: "+ this.age+
            "\n Employee ID"+ this.employeeID+
            "\n Salary:"+ this.salary+
            "\n Department: "+ this.department;
}

}
