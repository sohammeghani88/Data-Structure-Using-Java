package DS_practice;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer :");
        int n = sc.nextInt();
        int count = 0;

        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.println("Number is not prime");
        }else{
            System.out.println("number is prime");
        }
        
    }
}
