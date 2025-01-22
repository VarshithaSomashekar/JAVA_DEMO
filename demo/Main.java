
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

       
        Operations op = new Operations();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Management \n" +
                            "1. Add Employee details \n" +
                            "2. View all Employee details \n" +
                            "3. display average salary of a particular department \n" +
                            "4. Display salary after increment \n" +
                            "5. Exit \n" +
                            "Enter your choice: " );
        
        while(true){    //LOOPS
            System.out.println("Enter choice");
            int choice = scanner.nextInt();
        switch(choice){
            
            case 1: op.addEmployee();
                    break;
            case 2: op.getEmployee();
                    break;
            case 3: op.displayDeptEmployee();
                    break;
            case 4: op.salaryIncrement();

            case 5: System.out.println("Exisiting");
                    return;
            default : System.out.println("Invalid choice");
            break;
            
        }
        
    }

    //scanner.close();
    }

    
}
