package DS_practice;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of element :");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element :");
            a[i] = sc.nextInt();
        }

        // int temp = 0;
        // int i = 0;
        // int j = 0;
        // for (i = 0; i < n - 1; i++) {
        //     for (j = 0; j < n - i - 1; j++) {
        //         if (a[j + 1] < a[j]) {
        //             temp = a[j];
        //             a[j] = a[j + 1];
        //             a[j + 1] = temp;
        //         }
        //     }
        // }
        // // System.out.println(a[0]);
        // // for(i=0;i<n;i++){
        //     System.out.print(a[0]+ " ");
        // // }
            int min = a[0];
            for(int i=0;i<n;i++){
                if(min>a[i]){
                    min = a[i];
                }
            }
            System.out.println(min);
    }

}
