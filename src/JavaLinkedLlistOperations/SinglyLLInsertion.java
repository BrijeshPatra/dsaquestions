package JavaLinkedLlistOperations;

/*
1)Insertion operation->Beg,End,Position-->O(1)
2)Deletion  operation->Beg,End,Position
3)Searching a node-->O(n)
4)Sort the nodes
5)Count the number of nodes in LL
6)Reverse LinkedList
7)Display all nodes
 */
public class SinglyLLInsertion {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //=====================================
    //add--> first,last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
          head=newNode;
          return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            System.out.println("List is empty");
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        SinglyLLInsertion obj=new SinglyLLInsertion();
        obj.addFirst("a");
        obj.addFirst("is");
        obj.addLast("b");

        obj.printList();
        obj.addLast("yes");
        obj.printList();
    }
}
