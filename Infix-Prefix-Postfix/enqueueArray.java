import java.util.*;
public class enqueueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0,n=3,f = 0 , a,y;

        queue qe = new queue(n);
        while(true){
            System.out.println("1 for enqueue");
            System.out.println("2 for dequeue");
            a  = sc.nextInt();
            switch(a){
                case 1 : 
                    System.out.println("Enter element to insert :");
                    y  = sc.nextInt();
                    qe.en(n,y);
                    break;

                    case 2 : 
                    int delete=qe.deq();
                    System.out.println("Deleted element : "+delete);
            }
        }
    }
    
}
class queue{
    int r,f;
    int q[];
    queue(int n){
        this.r=-1;this.f=-1;
        q = new int[n];
    }
    void en(int n,int y){
        // System.out.println(r);
        r=r+1;
        if(r>=n){
            System.out.println("queue Overflow");
            r-=1;
            return;
        }
        q[r] = y;   

        if(f ==-1){
            f = 0;
        }
        return;
    }

    int deq(){
        // System.out.println(r);
        if(f == -1){
            System.out.println("queue Underflow");
            return 0;
        }
        
        int y = q[f];   
        if(f == r){
            f = -1;
            r = -1;
        }else{
            f++;
        }
        return y;
    }
}