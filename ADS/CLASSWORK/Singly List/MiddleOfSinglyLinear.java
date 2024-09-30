
import java.util.Scanner;

class MiddleOfSingly{
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
        public MiddleOfSingly(){
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
        public int middleOfList(){
            Node fast,slow;
            fast=head;
            slow=head;
            while (fast!=null && fast.next!=null) { //jewha fast end la asel i.e fast==null
             //tewha tewha slow middle asel in even node
             //in odd nodes trav.next==null mg tyla last node wrtich stop hoto
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow.data;
        }
}
public class MiddleOfSinglyLinear {
    public static int menuList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("0.exit");
        System.out.println("1.display");
        System.out.println("2.addLast");
        System.out.println("3.addFirst");
        System.out.println("4.addAtPosition");
        System.out.println("5.MiddleOfList");
      
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        int choice,val,pos;
        Scanner sc=new Scanner(System.in);
        MiddleOfSingly s1=new MiddleOfSingly();
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

            case 5:
            System.out.println(s1.middleOfList());
            break;

        }
    }
    }
}
