import java.util.Scanner;

public class LLAll_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLAll_Operation ll = new LLAll_Operation();
        int data=0;
        while(true){
            System.out.println("1 --> addlast\n2 --> addfirst\n3 --> deletelast\n4 --> deletefirst\n5 --> deletewherever\n6 --> Display");
            data = sc.nextInt();

            switch(data){

                case 1:
                    System.out.println("Enter element to Insert at last");
                    data = sc.nextInt();
                    ll.addlast(data);
                break;

                case 2:
                    System.out.println("Enter element to Insert at first");
                    data = sc.nextInt();
                    ll.addfirst(data);
                break;

                case 3:
                    ll.deletelast();
                break;
                case 4:
                    ll.deletefirst();
                break;
                case 5:
                    System.out.println("Enter element to dalete that element");
                    data = sc.nextInt();
                    ll.delete(data);
                break;

                case 6:
                    ll.display();
                break;

            }
        }
    }

    class node{
        int data;
        node link;
        node(int data){
            this.data=data;
            this.link=null;
        }
    }
    
    node head;
    public LLAll_Operation(){
        head = null;
    }
    public void addlast(int data){
        node newNode = new node(data);

        if(head == null){
            head = newNode;
        }else{
            node save = head;
            while(save.link!=null){
                save=save.link;
            }
            save.link=newNode;
            save=newNode;
        }
    }

    public void addfirst(int data){
        node newNode = new node(data);

        if(head == null){
            head = newNode;
        }else{
            newNode.link=head;
            head=newNode;
        }
    }
    
    public void deletelast(){
        node save = head;
        if(save == null){
          System.out.println("linked list is empty");
        }
        else if(save.link==null){
            head=null;
            System.out.println(":NOW LINKED LIST IS EMPTY");
        }
        else{
           node prece = save;
           while(save.link!=null){
            prece=save;
            save=save.link;
           }
           prece.link=null;
        }
    }
    public void deletefirst(){
        node save = head;
        if(head == null){
          System.out.println("linked list is empty");
        }
        else if(save.link==null){
            head=null;
            System.out.println("NOW LINKED LIST IS EMPTY");
        }
        else{
            head=head.link;
        }
    }
    public void delete(int x){
        node save = head;
        if(head == null){
            System.out.println("linked list is empty");
        }
        else if(save.link==null && save.data==x){
            head=null;
            System.out.println(" NOW LINKED LIST IS EMPTY");
        }
        else if(x==save.data){
            head=head.link;
        }
        else{
            node prece = head;
            while(x!=save.data && save.link!=null){
                prece = save;
                save=save.link;
            }
            if(x!=save.data){
                System.out.println("element not found");
            }else{
                prece.link=save.link;
            }
        }
    }
    public void display(){
        node save = head;
        while(save!=null){
            System.out.print(save.data+" --> ");
            save=save.link;
        }
        System.out.println("null");
        System.out.println();
    }

}