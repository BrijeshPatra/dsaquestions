package JavaStackOperations;

public class StackClassUsingLinkedList {
    static class Node{
        int data;
        Node next;

       public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;

            return top;
        }

        public static int peek(){
            return head.data;
        }

    }
    public static void main(String[] args) {
        StackClassUsingLinkedList sc=new StackClassUsingLinkedList();
        //sc.push(1);
        //sc.push(2);
        //sc.push(3);
        //while(!sc.isEmpty()){
          //  System.out.println(s.peek());
        }
    }

