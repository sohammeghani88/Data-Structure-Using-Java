package DS_practice;

import java.util.Scanner;

public class P4{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer :");
            int n = sc.nextInt();   
            int fact = 1;

            for(int i=1;i<=n;i++){
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}