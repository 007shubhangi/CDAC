
import java.util.Scanner;
class SinglyRecursion{
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
        private Node head;
        public SinglyRecursion(){
            head=null;
        }
        public void display(){
            Node trav;
            trav=head;
            System.out.println("List: ");
            while(trav!=null){
            System.out.print(trav.data+" ");
            trav=trav.next;
            }
            System.out.println(" ");
        }
        public void addLast(int val)
        {
            Node newNode=new Node(val);
            Node trav=head;
            //if list is empty
            if(head==null)
                head=newNode;
            else{
            while(trav.next!=null){
                trav=trav.next;
            }
            trav.next=newNode;
         }
        }
        public void addFirst(int val){
            Node newNode=new Node(val);
            //if list is empty
            if(head==null)
                head=newNode;
            else{
            newNode.next=head;
            head=newNode;
            }
        }
        public void addAtPosition(int val,int pos){
            Node newNode=new Node(val);
            //if list is empty or pos is 1 0
            if(head==null || pos<1){
                addFirst(val);
            }
            else{
            Node trav=head;
           for(int i=1;i<pos-1;i++){
                trav=trav.next;}
            newNode.next=trav.next;
            trav.next=newNode;
           }
        }
        public void sortList(int val){
            Node trav,trans;
            Node temp=new Node(val);
            for(trav=head;trav!=null;trav=trav.next){
                for( trans=trav.next;trans!=null;trans=trans.next)
                {
                    if(trav.data > trans.data){
                     temp.data=trav.data;
                    trav.data=trans.data;
                    trans.data=temp.data;
                    
                    }

                }
            }
        }
    public void reverseList(){
        //create new list and assign head to it and do previus head null
        Node oldHead=head;
        head=null;
        //iterate till end
        while(oldHead!=null){
        Node trav=oldHead;
        oldHead=oldHead.next;
        trav.next=head;
        head=trav;
        }
    }
    private Node recursiveReverse(Node h){//1first current head
        if(h.next==null){
            head=h;
            return head;
        }
       
        Node tail=recursiveReverse(h.next);
        tail.next=h;
        h.next=null;
        return h;
        
    }
    public void recursiveReverse(){
        if(head!=null)//empty  nsel trch reverse kara
            recursiveReverse(head);
    }
    public void reverseDisplay(Node h){
        if(h.next==null)
            return;
        reverseDisplay(h.next);
        System.out.println(h.data);
    }
    //wrappper for reversedisplay(head h) head is private main mdhun ny deu shkt arguments
    public void reverseDisplay(){
        System.out.println("list : ");
        reverseDisplay(head);
        System.out.println("");
    }
}
public class SinglyLinearMainReverse {
    public static int menuList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("0.exit");
        System.out.println("1.display");
        System.out.println("2.addLast");
        System.out.println("3.addFirst");
        System.out.println("4.addAtPosition");
        System.out.println("9.sortList");
        System.out.println("10.reverseList");
        System.out.println("11.recursiveReverse");
        System.out.println("12.reverseDisplay");

        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        int choice,val,pos;
        Scanner sc=new Scanner(System.in);
        SinglyRecursion s1=new SinglyRecursion();
        while((choice=menuList())!=0){
        switch(choice){
            case 0:
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

            case 9:
            s1.sortList(10);
            break;

            case 10:
            s1.reverseList();
            break;

            case 11:
            s1.recursiveReverse();
            break;

            case 12:
            s1.reverseDisplay();
        }
    }
   }
}
