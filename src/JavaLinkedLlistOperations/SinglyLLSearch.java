package JavaLinkedLlistOperations;
//Search element in linked list
//Insertions and deletions take O(1) time.
public class SinglyLLSearch {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int new_data)
    {
        // Allocate new node and putting data
        Node new_node = new Node(new_data);

        // Make next of new node as head
        new_node.next = head;

        // Move the head to point to new Node
        head = new_node;
    }
    // Checks whether the value x is present in linked list
    public boolean search(Node head, int x)
    {
        Node current = head; // Initialize current
        while (current != null) {
            if (current.data == x)
                return true; // data found
            current = current.next;
        }
        return false; // data not found
    }

    public static void main(String[] args) {
        // Start with the empty list
        SinglyLLSearch llist=new SinglyLLSearch();
 
        /*Use push() to construct below list
        14->21->11->30->10  */
        llist.push(10);
        llist.push(30);
        llist.push(40);
        llist.push(20);
        llist.push(60);


        // Function call
        if (llist.search(llist.head, 60))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
