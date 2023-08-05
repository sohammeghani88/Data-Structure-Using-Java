package DS_practice;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter an element :");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("element at index : "+i+" is "+arr[i]);
            
        }
    }
}
