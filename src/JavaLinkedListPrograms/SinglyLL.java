package JavaLinkedListPrograms;
/*
Create and display singly linked list
 */
public class SinglyLL {

    class Node{
       int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);
        //Base Case
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display(){
        Node curr=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly Linked list");
        while(curr!=null){
            System.out.println(curr.data+ " ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLL obj=new SinglyLL();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);

        //display
        obj.display();
    }
}
