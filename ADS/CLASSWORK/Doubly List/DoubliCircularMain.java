
import java.util.Scanner;
class DoublyCircular{
    static class Node{
        private int data;
        private Node prev;
        private Node next;
        public Node(){
            data=0;
            prev=null;
            next=null;
        }
        public Node(int val){
            data=val;
            prev=null;
            next=null;
        }
    }
    private Node head;
    public DoublyCircular(){
        head=null;
    }
    public void displayForward(){
        if(head==null) //empty list
            throw  new RuntimeException("list is empty ");

        else{ //genersl case
        Node trav=head;
        System.out.println("ForwardList : ");
        do{
        System.out.println(trav.data + " ");
        trav=trav.next;
        }
        while(trav!=head);
        System.out.println(" ");  
      }
    }
    public void displayReverse(){
        if(head==null)     //empty list
            throw  new RuntimeException("list is empty ");

        else{               //genaeral case    
        Node trav=head.prev;
        System.out.println("ReverseList : ");
        do{
       System.out.println( trav.data+" ");
       trav=trav.prev;
        }
        while(trav!=head.prev);
        System.out.println(" ");
        }
    }
    public void addLast(int val){
        Node newNode=new Node(val);
        if(head==null){       //list is empty and newnnode is first node to add in list
            head=newNode;
            newNode.next=head; //doubly circular
            newNode.prev=head;
        }
       else{          //general
        Node trav=head.prev;
        newNode.prev=trav;
        newNode.next=head;
        trav.next=newNode;
        head.prev=newNode;
       }
    }
    public void addFirst(int val){
        Node newNode=new Node(val);
        if(head==null){   //if list is emtpy then node be first node
            head=newNode;
            newNode.next=head;
            newNode.prev=head;
        }
        else{
        Node tail=head.prev;
        newNode.next=head;
        newNode.prev=tail; //ok
        //newNode.prev=head.prev;//ok
        tail.next=newNode; //ok
        //head.prev.next=newNode;//ok
        head.prev=newNode;
        head=newNode;
        }
    }
    public void addAtPosition(int val,int pos){
        Node newNode=new Node(val);
        if(head==null || pos<=1){
           // addFirst(val);
           head=newNode;
           newNode.prev=head;
           newNode.next=head;
        }
        else{
        Node trav=head;
        for(int i=1;i<pos-1;++i){
            if(trav.next==head){
                 break;
                 }
          trav=trav.next;
        }
        // Node trans=trav.next;
        // newNode.next=trans;
        // newNode.prev=trav;
        // trav.next=newNode;
        // trans.prev=newNode;
        newNode.prev=trav;
        newNode.next=trav.next;
        if(trav.next.next!=head)
        {
            trav.next.prev=newNode;//if we want to add at last. last ele next always head circular list
             // tewha tyacha prev mdhe old last node cha addr ani next mdhe head yenar naki newnod
        }
        trav.next=newNode;
    } 
}
    public void deleteFirst(){
      if(head==null){
        throw new RuntimeException("empty list");
        }
        if(head.next==head){
            head=null;
        }
        else{
            Node tail=head.prev;
            head=head.next;
            head.prev=tail;
            tail.next=head;
        }
    }
    public void deleteAtPosition(int pos){
        if(head==null || pos<1)//empty list
            return;
        if(head.next==head || pos==1)
            head=null;  
        else{      
        Node trav=head;
        for(int i=1;i<pos;++i){
            trav=trav.next;
        }
        trav.prev.next=trav.next;
        trav.next.prev=trav.prev;
        }
    }
    public void deleteAll()
    {
        head=null;
    }
    public void deleteLast(){
        Node tail=head.prev;
        tail.prev.next=head;
        head.prev=tail.prev;
    }

}
public class DoubliCircularMain {
    public static int menuList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("0.exit");
        System.out.println("1.display");
        System.out.println("2.addLast");
        System.out.println("3.addFirst");
        System.out.println("4.addAtPosition");
        System.out.println("5.deleteFirst");
        System.out.println("6.deleteAll");
        System.out.println("7.deleteAtPostion");
        System.out.println("8.deletelast");
        int choice=sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice,pos,val ;
        DoublyCircular s1=new DoublyCircular();
        while((choice=menuList())!=0){
            switch (choice) {
                default:
                System.out.println("Oppsss Enter Again!!!!");
                break;
    
                case 1:
                s1.displayForward();
                s1.displayReverse();
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
                 s1.deleteAll();
                break;
    
                case 7:
                System.out.println("enter postion");
                pos=sc.nextInt();
                s1.deleteAtPosition(pos);
                break;  
    
                case 8:
                s1.deleteLast();
               break;
               
            }
        }
    }
}
