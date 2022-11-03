package JavaLinkedListPrograms;

import java.util.HashSet;

public class DetectLoop {
    static Node head;
   static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    static boolean detectLoop(Node h){
       HashSet<Node>s=new HashSet<Node>();
       while(h!=null){
           if(s.contains(h))
               return true;

               s.add(h);
               h=h.next;
           }
           return false;
       }

    public static void main(String[] args) {
        DetectLoop dl=new DetectLoop();
        dl.push(20);
        dl.push(4);
        dl.push(15);
        dl.push(10);

        dl.head.next.next.next.next=dl.head;

        if(detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

    }
}
