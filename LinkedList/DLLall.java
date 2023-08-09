
// doubly linked linear list

import java.util.Scanner;

public class DLLall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DLLall ll = new DLLall();
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
        node lptr;
        node rptr;

        node(int data){
            this.data=data;
            this.rptr=null;
            this.lptr=null;
        }
    }
    
    node head;
    public DLLall(){
        head = null;
    }

    public void addfirst(int data){
        node newNode = new node(data);

        if(head == null){
            head = newNode;
            newNode.lptr=null;
            newNode.rptr=null;

        }else{
            newNode.rptr=head;
            head.lptr=newNode;
            newNode.lptr=null;
            head=newNode;
        }
    }

    public void addlast(int data){
        node newNode = new node(data);

        if(head == null){
            head = newNode;
            newNode.lptr=null;
            newNode.rptr=null;
        }else{
            node save = head;
            while(save.rptr!=null){
                save=save.rptr;
            }
            save.rptr=newNode;
            newNode.lptr=save;
            newNode.rptr=null;
        }
    }

    public void deletelast(){
        node save = head;
        if(save == null){
          System.out.println("linked list is empty");
        }
        else if(save.rptr==null){
            head=null;
            System.out.println(":NOW LINKED LIST IS EMPTY");
        }
        else{
           node prece = save;
           while(save.rptr!=null){
            prece=save;
            save=save.rptr;
           }
           prece.rptr=null;
        }
    }

    public void deletefirst(){
        node save = head;
        if(head == null){
          System.out.println("linked list is empty");
        }
        else if(save.rptr==null){
            head=null;
            System.out.println("NOW LINKED LIST IS EMPTY");
        }
        else{
            head=head.rptr;
            head.lptr=null;
        }
    }

    public void delete(int x){
        node save = head;
        if(head == null){
            System.out.println("linked list is empty");
        }
        else if(save.rptr==null && save.data==x){
            head=null;
            System.out.println(" NOW LINKED LIST IS EMPTY");
        }
        else if(x==save.data){
            head=head.rptr;
            head.lptr=null;
        }
        else{
            node prece = head;
            while(x!=save.data && save.rptr!=null){
                prece = save;
                save=save.rptr;
            }
            if(x!=save.data){
                System.out.println("element not found");
            }else{
                if(x==save.data && save.rptr==null){
                    deletelast();
                }else{
                    prece.rptr=save.rptr;
                    save.rptr.lptr=save.lptr;
                }
            }
        }
    }

    public void display(){
        node save = head;
        while(save!=null){
            System.out.print(save.data+" --> ");
            save=save.rptr;
        }
        System.out.println("null");
        System.out.println();
    }
}