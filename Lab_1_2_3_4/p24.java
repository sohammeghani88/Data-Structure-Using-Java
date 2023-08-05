import java.util.Scanner;
public  class p24 {
    public static void main(String[] args) {
        Student_Detail arr[] = new Student_Detail[5];
        for(int i=0;i<5;i++){
            arr[i] = new Student_Detail();
            arr[i].setDetails();
            arr[i].printDetails();
        }
    }
}
class Student_Detail{
    int Enrollment_No;
    String Name;
    String Semester;
    int CPI;

    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enrollment_No ID :");
        Enrollment_No = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of employee :");
        Name = sc.nextLine();
        System.out.println("Enter Semester :");
        Semester = sc.nextLine();
        System.out.println("Enter CPI :");
        CPI = sc.nextInt();
    }
    public void printDetails(){
        System.out.println("Enrollment_No is : "+Enrollment_No);
        System.out.println("name of employee is : "+Name);
        System.out.println("Semester : "+Semester);
        System.out.println("CPI : "+CPI);
    }
}