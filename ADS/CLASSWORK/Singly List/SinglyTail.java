import java.util.Scanner;

class SinglyTailLindedList {
    static class Node{
        private int data;
        private Node next;

        Node(){
            data=0;
            next=null;
        }
        Node(int val){
            data=val;
            next=null;
        }
    }
    private Node head;
    private Node tail;
    public SinglyTailLindedList(){
        head=null;
        tail=null;
    }
    public  void display(){
        System.out.print("List: ");
        Node trav=head;
        while(trav.next!=null){
            System.out.println(trav.data);
            trav=trav.next;
        }
        System.out.println(" ");
    }
    public void addFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            newNode.next=head;
            head=newNode;
            tail=newNode;
        }
        newNode.next=head;
        head=newNode;
     //if list is empty    
    }
    public void addLast(int val){
        Node newNode=new Node(val);
        //if list is empty
        if(head==null){
            newNode.next=head;
            head=newNode;
            tail=newNode;
        }
        //general 
        else{
            //add new node to next of last node
            tail.next=newNode;
           // update tail newnode
            tail=newNode;
        }
    }
    public void deleteLast(){
        Node trav=head;
        Node trans=null;
        //general
        while(trav.next!=null){
            trans=trav;
            trav=trav.next;
        }
        trans.next=null;
        tail=trans;
    }
}
public class SinglyTail{

    public static int menulist(){
        Scanner sc=new Scanner(System.in);
        System.out.println("0.exit");
        System.out.println("1.display");
        System.out.println("2.addLast");
        System.out.println("3.addFirst");
        System.out.println("4.addAtPos");
        System.out.println("5.deleteLast");
        System.out.println("6.deleteAtFirst");
        System.out.println("7.deleteAtPosition");
        System.out.println("8.deleteAll");
        int choice=sc.nextInt();
        return  choice;

    }
    public static void main(String[] args) {
        int choice,val,pos;
        Scanner sc=new Scanner(System.in);
        SinglyTailLindedList s1=new SinglyTailLindedList();
        while((choice=menulist())!=0){
            switch(choice){
                case 1:
                s1.display();
                break;

                case 2:
                System.out.println("enter ele which u want to add at last");
                val=sc.nextInt();
                s1.addLast(val);
                break;

                case 3:
                System.out.println("enter element  which u want to add first");
                val=sc.nextInt();
                s1.addFirst(val);
                break;

                case 4:
               // s1.addAtPos();
                break;

                case 5:
                s1.deleteLast();
                break;

                case 6:
                break;

                case 7:
                break;

                case 8:
                break;
            }
        }
    }
}
