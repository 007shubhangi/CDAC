import java.util.Scanner;

class DoublyLinear{
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
    public DoublyLinear(){
        head=null;
    }
    public void displayForward(){
        //list empty 
        if(head==null){
            return;
        }
        Node trav=head;
        System.out.println("Forward List: ");
        while(trav!=null){
            System.out.println(trav.data);
            trav=trav.next;
        }
    }
    public void displayReverse(){
        //if list is empty
        if(head==null){
            return ;
        }
        Node trav=head;
        System.out.println("Reverse list: ");
        while(trav.next!=null)
            trav=trav.next;
        while (trav!=null) {
            System.out.println(trav.data);
            trav=trav.prev;
        }            
    }
    public void addLast(int val){
        Node trav=head;
        Node newNode=new Node(val);
        //list empty and we add element which itself first and last
        if(head==null){
            head=newNode;}
           
        else{
            //general
        while(trav.next!=null){
            trav=trav.next;
        }
        newNode.prev=trav;
        trav.next=newNode;
        }
    }
    public void addFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;//newnode is first node
        }
        else{
        newNode.next=head;
        //first nodes head should holsd newnodes addr becz newnode become first node
        head.prev=newNode;
        //newnode is our new first node so head should hold newnode addrs
        head=newNode;
        }
    }
    public void addAtPosition(int val,int pos){
        Node newNode=new Node(val);
        if(head==null || pos<=1){ //when list is empty
            head=newNode;
        }
        else{
            Node trav=head;
            Node temp; 
        for(int i=1;i<pos-1;++i){
            if(trav.next==null){
                throw new RuntimeException ("out of bound size");
            }
                //break
            trav=trav.next;
        }
        //take trav posinter to node after tav
        temp=trav.next;
        newNode.next=temp;
        newNode.prev=trav;
        trav.next=newNode;
        if(temp!=null)//if we want to add node at last next line not required gives null pointer exception
             temp.prev=newNode;
    }
    }
    public void deleteFirst(){
        //only one node in list
        if(head.next==null){
            head=null;
        }
        //empty list
        if(head==null)
            throw new RuntimeException("empty list");
         //general must be in else
        else{
            head=head.next;
             head.prev=null;
        }
        
    }
    public void deleteAtPosition(int pos){
        if(pos==1)
            deleteFirst();
        if(head==null || pos<1)
            throw new RuntimeException("try to delete empty list");
        else{
        Node trav=head;
        for(int i=1;i<pos;i++){
            trav=trav.next;
        }
        trav.prev.next=trav.next;
        if(trav.next!=null){
            trav.next.prev=trav.prev;
        }
    }
    }
    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
        }
        else{
        Node trav=head;
       while(trav.next!=null) {
        trav=trav.next;
    }
    trav.prev.next=null;
    }
}
}
public class DoublyLinearMain{
    public static int menuList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("0.exit");
        System.out.println("1.addLast");
        System.out.println("2.addFirst");
        System.out.println("3.addAtPosition");
        System.out.println("4.deleteLast");
        System.out.println("5.deleteFirst");
        System.out.println("6.deleteAtPosition");
        System.out.println("7.deleteAll");
        System.out.println("8.display");
        int choice=sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice,pos,val ;
        DoublyLinear s1=new DoublyLinear();
        while((choice=menuList())!=0){
            switch (choice) {
                case 0:
                break;

                case 1:
                System.out.println("enter value want to add at last");
                val=sc.nextInt();
                s1.addLast(val);
                break;

                case 2:
                System.out.println("enter value want to add first");
                val=sc.nextInt();
                s1.addFirst(val);
                break;

                case 3:
                System.out.println("enter ele");
                val=sc.nextInt();
                System.out.println("enter position");
                pos=sc.nextInt();
                s1.addAtPosition(val,pos);
                break;

                case 4:
                s1.deleteLast();
                break;

                case 5:
                s1.deleteFirst();
                break;

                case 6:
                System.out.println("enter pos");
                pos=sc.nextInt();
                s1.deleteAtPosition(pos);
                break;

                case 8:
                s1.displayForward();
                s1.displayReverse();
                break;
            
                case 9:
                default:
                    break;
            }
        }
    }
}