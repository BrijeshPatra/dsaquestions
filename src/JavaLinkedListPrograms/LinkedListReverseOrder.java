package JavaLinkedListPrograms;
/*
Program to create a singly linked list of n nodes
and display it in reverse order
 */
public class LinkedListReverseOrder {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }
    public void reverse(Node curr){
        if(head==null){
            System.out.println("List is empty");
            return;
        }else{
            if(curr.next==null){
                System.out.println(curr.data+ "  ");
                return;
            }
            //calls reverse function
            reverse(curr.next);
            System.out.println(curr.data + " ");
        }
    }
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
      LinkedListReverseOrder obj= new LinkedListReverseOrder();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(4);
        obj.addNode(5);
        obj.addNode(6);

        System.out.println("Original list");
        obj.display();

        System.out.println("Reversed list");
        obj.reverse(obj.head);
    }
}
