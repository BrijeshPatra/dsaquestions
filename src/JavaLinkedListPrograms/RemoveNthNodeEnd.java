package JavaLinkedListPrograms;

public class RemoveNthNodeEnd {

    static Node head;
    class Node{
        int data;
        Node next;

        public Node(){
            this.data=data;
            this.next=null;
        }
    }

    public Node removeNthNodeEnd(Node head,int n){
        if(head.next==null){
            return null;
        }
        //calculate size
        int size=1;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        //find index
        int indexToSearch=size-n;
        Node prev=head;
        int i=1;
        while(i<indexToSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
