package DS_practice;

import java.util.Scanner;

public class P10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting point & Ending point :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        for(int i=m;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
