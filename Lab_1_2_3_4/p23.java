import java.util.Scanner;
public  class p23 {
    public static void main(String[] args) {
        Employee_Detail obj = new Employee_Detail();
        obj.setDetails();
        obj.printDetails();
    }
}
class Employee_Detail{
    int Employee_ID;
    String Name;
    String Designation;
    int Salary;

    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID :");
        Employee_ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of employee :");
        Name = sc.nextLine();
        System.out.println("Enter designation :");
        Designation = sc.nextLine();
        System.out.println("Enter Salary :");
        Salary = sc.nextInt();
    }
    public void printDetails(){
  
        System.out.println("employee ID is : "+Employee_ID);
        
        System.out.println("name of employee is : "+Name);
        
        System.out.println("designation : "+Designation);
        
        System.out.println("Salary : "+Salary);
        
    }
}