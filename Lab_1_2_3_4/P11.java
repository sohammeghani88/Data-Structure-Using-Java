package DS_practice;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int n = sc.nextInt();
        double sum=0;
        int count =0;
        int i=0;

        for(i=1;i<=n;i++){
            sum+=i;
            count++;
        }
        System.out.println(sum/(i-1));
    }
    
}
