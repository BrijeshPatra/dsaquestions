package JavaLinkedListPrograms;
/*
Check linked list is palindrome or not
 */
public class Palindrome {
    static class Node{
        int data;
        Node next;

        public Node(int data,Node next){
            this.data=data;
            this.next=null;
        }
    }
    public Node reverse(Node head){
        if(head==null || head.next==null)return head;
        Node curr=head,prev=null;
        while(curr!=null){
            Node forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public Node getMid(Node head){
        if(head == null || head.next == null)return head;
        Node curr=head;
        Node mid=head;

        while(curr.next!=null&&curr.next.next!=null){
            curr=curr.next.next;
            mid=mid.next;
        }
        return mid;
    }
    public boolean isPalindrome(Node head){
        Node mid=getMid(head);
        Node halfList=reverse(mid.next);
        Node curr=head;

        while(halfList!=null){
            if(curr.data!=halfList.data)return false;
            curr=curr.next;
            halfList=halfList.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
