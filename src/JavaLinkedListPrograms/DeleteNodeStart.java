package JavaLinkedListPrograms;
/*
Program to delete node from beginning of
the linked list
 */
public class DeleteNodeStart {
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
    public void deleteStart(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }else{
            if(head!=tail){
                head=head.next;
            }else{
                head=tail=null;
            }
        }
    }
    public void display(){
        Node curr=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DeleteNodeStart obj=new DeleteNodeStart();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);

        System.out.println("Original list");
        obj.display();

        while(obj.head!=null){
            obj.deleteStart();

            System.out.println("Updated list");
            obj.display();
        }
    }
}
