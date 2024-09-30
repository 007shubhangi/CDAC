//sortion  and reverse
import java.util.Scanner;
class SinglyLinear{
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
        public SinglyLinear(){
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
        public void deleteFirst(){
            //if list is empty
            if(head==null)
                 throw new RuntimeException("list empty");

            head=head.next;
        }
        public void deleteAll(){
            head=null;
        }
        public void delLast(){
            Node trav=head;
            Node trans=trav;
            //if list contain 1 node
            if (head.next==null){
                head=null;
            }
            //if list is empty
            if(head==null){
                throw  new RuntimeException("empty list hai bhaii kya delete kruu!!!");
            }
            else{
            while(trav.next!=null){
                trans=trav;
                trav=trav.next;
            }
            trans.next=null;
        }
        }
        public void deleteAtPostion(int pos){
            Node trav;
            trav=head;
            Node temp=null;
            //position is first 
            if(pos==1){
                deleteFirst();
            }
            if(head==null || pos<1)
                throw new RuntimeException("list is empty");
            
            for(int i=1;i<pos;i++){
                temp=trav;
                trav=trav.next;
            }
            temp.next=trav.next;
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
    }

public class SinglyLinearMain{
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
        System.out.println("9.sortList");
        System.out.println("10.reverseList");

        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        int choice,val,pos;
        Scanner sc=new Scanner(System.in);
        SinglyLinear s1=new SinglyLinear();
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
            s1.deleteFirst();
            break;

            case 6:
            s1.deleteAll();
            break;

            case 7:
            System.out.println("enter postion");
            pos=sc.nextInt();
            s1.deleteAtPostion(pos);
            break;

            case 8:
            s1.delLast();
            break;

            case 9:
            s1.sortList(10);
            break;

            case 10:
            s1.reverseList();
            break;
        }
    }
    }
}