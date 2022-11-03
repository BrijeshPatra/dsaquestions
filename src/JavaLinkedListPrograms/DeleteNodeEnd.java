package JavaLinkedListPrograms;
/*
Program to delete the end node
 */
public class DeleteNodeEnd {

    static Node head;
    static class Node{
        int data;
        Node next;
    }
    static Node removeLastNode(Node head){
        if(head==null)
            return null;
        if(head.next==null){
            return null;
        }
        //Find second last node
        Node second_last=head;
        while(second_last.next.next!=null){
            second_last=second_last.next;
        }
        //change next of second last
        return head;
    }
    static Node push(Node head_ref,int new_data){
        Node newNode=new Node();
        newNode.data=new_data;
        newNode.next=(head_ref);
        (head_ref)=newNode;
        return head_ref;
    }

    public static void main(String[] args) {
        // Start with the empty list /
        Node head = null;

        // Use push() function to construct
        // the below list 8 . 23 . 11 . 29 . 12 /
        head = push(head, 12);
        head = push(head, 29);
        head = push(head, 11);
        head = push(head, 23);
        head = push(head, 8);

        head = removeLastNode(head);
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }
}
