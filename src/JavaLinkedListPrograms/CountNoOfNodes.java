package JavaLinkedListPrograms;
/*
Create a singly linked list of n nodes and count
the number of nodes
 */
public class CountNoOfNodes {
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
    public int countNodes(){
        int count=0;
        Node curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    public void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CountNoOfNodes obj=new CountNoOfNodes();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);
        obj.addNode(5);

        obj.display();

        System.out.println("Count of nodes present" +
                "int the list: " + obj.countNodes());
    }
}
