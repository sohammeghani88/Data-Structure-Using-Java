import java.util.*;
public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number a & b from the array :");
        int a = sc.nextInt();
        int b = sc.nextInt();
         
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                arr[i]=b;
            }
            if(arr[i]==b){
                arr[i]=a;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}