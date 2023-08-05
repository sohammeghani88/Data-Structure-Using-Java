package DS_practice;

import java.util.*;
public class P2{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer :");
            int a = sc.nextInt();
            oddeven(a);
        }
    }
    public static void oddeven(int a){
        if(a%2==0 && a!=0){
            System.out.println("number is even");
        }
        else if(a==0) {
            System.out.println("it is zero");
        }
        else{
            System.out.println("number is odd");
            
        }
    }
}