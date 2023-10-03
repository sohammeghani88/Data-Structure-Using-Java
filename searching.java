import java.util.*;
public class searching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,4,3,7,5,6};

        
        System.out.println("Enter value to search :");
        int data = sc.nextInt();
        System.out.println("Enter searching Operation :\n1 ==> linear\n2 ==> binary");
        int a = sc.nextInt();

        switch(a){
            case 1:
            linearsearch(arr,data);
            break;

            case 2:
            binarysearch(arr,data);
            break;
        }
        
    }
    static void linearsearch(int arr[] , int data){
        for(int i=0;i<arr.length;i++){
            if(data == arr[i]){
                System.out.println("Index of "+ data+" ==> "+i);
            }
        }
    }

    static void binarysearch(int arr[] , int data){

        arr=bubblesort(arr);
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+ " ");
        }
        System.out.println("sorted using BUBBLE");

        arr=selectionsort(arr);
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+ " ");
        }
        System.out.println("sorted using SELECTION");
        
        arr=insertionsort(arr);
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+ " ");
        }
        System.out.println("sorted using INSERTION");

        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)/2;
        
        while(left<=right){
            if(data>arr[mid]){
                left = mid+1;
                mid = (left+right)/2;
            }else if(data<arr[mid]){
                right=mid-1;
                mid = (right+left)/2;
            }else{
                System.out.println("Index of "+ data+" ==> "+mid);
                return;
            }
        }
    }

    static int [] bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean chk = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    chk = true;
                }
            }
            if(chk==false){
                return arr;
            }
        }
        return arr;
    }

    static int [] selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int index = i;
            for(int j=i+1;j<arr.length-i;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
        }
        return arr;
    }
    static int [] insertionsort(int arr[]){
        for(int j=1;j<arr.length;j++){
            int key = arr[j];
            int i=j-1;
            while(i>-1 && arr[i]>key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
        return arr;
    }
}