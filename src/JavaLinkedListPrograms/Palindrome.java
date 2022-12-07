package JavaLinkedListPrograms;
/*
Check linked list is palindrome or not
Approach->1)Reverse the linked list
          2)Find the middle element
          3)Reverse the second half of Linked list
          4)Check first half and second half
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
    public Node findMiddle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast.next==null && fast.next.next==null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }


    public boolean isPalindrome(Node head) {

        if(head==null || head.next==null){
            return true;
        }
        Node middle=findMiddle(head);
        Node secondHalfStart=reverse(middle.next);
        Node firstHalfStart=head;
        while(secondHalfStart!=null){
            if(firstHalfStart.data!= secondHalfStart.data){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
