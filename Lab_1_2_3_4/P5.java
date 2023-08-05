package DS_practice;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int n = sc.nextInt();

        // recursion(n);
        System.out.println(recursion(n));
    }
    public static int recursion(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return  n*recursion(n-1);
    }
    
}
