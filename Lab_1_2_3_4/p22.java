import java.util.Scanner;
public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swaping |||| a = "+a+" b = "+b);
        swap(a,b);
    }
    static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping |||| a = "+a+" b = "+b);
    }
}