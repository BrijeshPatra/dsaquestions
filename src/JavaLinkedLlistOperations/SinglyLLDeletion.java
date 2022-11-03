package JavaLinkedLlistOperations;

public class SinglyLLDeletion {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data=data;
            this.next=null;
        }
    }
    //delete-first,last
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;//deleted first node
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next!=null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void printList(){
        Node node=head;
        while(node!=null){
            System.out.println(node.data + " ");
            node=node.next;
        }
    }

    public static void main(String[] args) {
        SinglyLLDeletion obj=new SinglyLLDeletion();
        obj.deleteFirst();
        obj.printList();
        obj.deleteLast();
        obj.printList();

    }
}
