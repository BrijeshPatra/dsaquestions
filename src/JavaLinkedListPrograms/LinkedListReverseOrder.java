package JavaLinkedListPrograms;
/*
Program to create a singly linked list of n nodes
and display it in reverse order
 */
public class LinkedListReverseOrder {
    Node head;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public void addNode(int new_data){
      Node newNode=new Node(new_data);
      newNode.next=head;
      head=newNode;
    }
    public void printList(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
      LinkedListReverseOrder reverse=new LinkedListReverseOrder();
        reverse.addNode(1);
        reverse.addNode(2);
        reverse.addNode(3);
        reverse.addNode(4);
        reverse.addNode(6);

        reverse.printList();


    }
}