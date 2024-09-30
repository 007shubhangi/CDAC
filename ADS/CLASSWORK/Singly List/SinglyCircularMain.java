import java.util.Scanner;
class SinglyCircular{
    static class Node{
        private int data;
        private Node next;
          public Node(){
            data=0;
            next=null;
        }
        public Node(int val){
            data=val;
            next=null;
        } }
        Node head;
        public SinglyCircular(){
            head=null;
        }
    
        public void display(){
             //if list is empty
             if(head==null)
                 throw new RuntimeException("empty list is here");
            
              else{ 
              Node trav=head;
              System.out.println("List : ");
              do { 
                System.out.print(trav.data + " ");
                trav=trav.next;
               } while (trav!=head);
        }
            System.out.println(" ");     
        
        }
        public void addLast(int val){
            Node newNode=new Node(val);
            //if list is empty node will be the first ele in list
            if(head==null){
                head=newNode;
                newNode.next=head;
            }
            //general case
            else{
            Node trav=head;
            while(trav.next!=head){
                 trav=trav.next;
                }
            //make realtion then break old   
            newNode.next=head;
            //add newnode at next to previous node
            trav.next=newNode;     
            }
        }
            public void addFirst(int val){
                Node newnNode=new Node(val);
                if(head==null){
                    head=newnNode;
                    newnNode.next=head;
                }
                Node trav;
                trav=head;
                //traverse till last node
                while(trav.next!=head)
                   trav=trav.next;
                //make new realtion before break old
                newnNode.next=head;
                //break old
                trav.next=newnNode;
                //head pointing to new fisrt node
                head=newnNode;
            }
            public void addAtPosition(int val,int pos){
                //if list empty or position <= 1 it will fisrt node
                if(head==null || pos<=1){
                   addFirst(val);}

                Node newNode=new Node(val);
                Node trav=head;
                for(int i=1;i<pos-1;i++){//pos 8 and list size 3 or less that pos
                    if(trav.next==head){ //if length is greater than list i.e beyond the length
                        break;
                        //addLast(val);
                        //throw new exception position is wrong we not add your node
                    }
                    trav=trav.next;   
                }
                newNode.next=trav.next;
                trav.next=newNode;
            }
            public void deleteFirst(){
                if(head==null)
                    throw new RuntimeException("empty list");
                //if list contain one node only
                if(head.next==head)
                    head=null;
                else{
                Node trav=head;
                while(trav.next!=head)
                    trav=trav.next;
                trav.next=head.next;
                head=head.next;
                }
            }
            public void deleteLast(){
                if(head==null)
                    throw new RuntimeException("empty list");
                //if list contain one node only
                 if(head.next==head)
                     head=null;
                //general
                Node trans=null;
                Node trav=head;
                while(trav.next!=head){
                    trans=trav;
                    trav=trav.next;
                }
                trans.next=head;
            }
            public void deleteAtPostion(int pos){
                //if list contain only one node
                if(pos==1)
                    deleteFirst();
                //list is empty    
                if(head==null || pos<1)
                    throw new RuntimeException("Empty list");
                //general cases
                Node trav=head;
                Node trans=null;
                for(int i=1;i<pos;i++){
                    if(trav.next==head){
                        throw new RuntimeException("invalid position");//invalid postion
                    }
                    trans=trav;
                    trav=trav.next;
                }
                trans.next=trav.next;
            }
            public void deleteAll(){
                head.next=null;
                head=null;
            }
}
public class SinglyCircularMain{
    public static int menuList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("0.exit");
        System.out.println("1.display");
        System.out.println("2.addLast");
        System.out.println("3.addFirst");
        System.out.println("4.addAtPosition");
        System.out.println("5.deleteAtFirst");
        System.out.println("6.deleteAll");
        System.out.println("7.deleteAtPostion");
        System.out.println("8.delLast");
        System.out.println("9.deletelast");

        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
          int choice,val,pos;
        Scanner sc=new Scanner(System.in);
        SinglyCircular s1=new SinglyCircular();
        while((choice=menuList())!=0){
        switch(choice){
            default:
            System.out.println("Oppsss Enter Again!!!!");
            break;

            case 1:
            s1.display();
            break;

            case 2:
            System.out.println("enter data which you want to add at last");
            val=sc.nextInt();
            s1.addLast(val);
            break;

            case 3:
            System.out.println("enter value which you want to add first");
            val=sc.nextInt();
             s1.addFirst(val);
            break;    

            case 4:
            System.out.println("enter value which u want to add");
            val=sc.nextInt();
            System.out.println("enter position at which want to add data");
             pos=sc.nextInt();
            s1.addAtPosition(val,pos);
            break;

            case 5:
            s1.deleteFirst();
            break;

            case 6:
           // s1.deleteAll();
            break;

            case 7:
            System.out.println("enter postion");
            pos=sc.nextInt();
            s1.deleteAtPostion(pos);
            break;

            case 8:
           // s1.delLast();
           break;

           case 9:
           s1.deleteLast();
        }
    }
    }}

