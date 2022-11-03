package JavaLinkedListPrograms;
/*
Print the min and max node
 */
public class MinMax {
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

    //addNode() will add a new Node to the list
    public void addNode(int data){
        //create a new node
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void minNode(){
        Node curr=head;
        int min;

        if(head==null){
            System.out.println("List is empty");
            return;
        }else{
            min= head.data;

            while(curr!=null){
                if(min>curr.data){
                    min=curr.data;
                }
                curr=curr.next;
            }
            System.out.println("Minimum value node in the list:" + min);
        }
    }
    public void maxNode(){
        Node curr=head;
        int max;

        if(head==null){
            System.out.println("List is empty");
        }else{
            max= head.data;

            while(curr!=null){
                if(max< curr.data){
                    max= curr.data;
                }
                curr=curr.next;
            }
            System.out.println("Max value node in the list: " + max);
        }
    }
    public static void main(String[] args) {
        MinMax obj=new MinMax();
        obj.addNode(5);
        obj.addNode(8);
        obj.addNode(1);
        obj.addNode(6);

        obj.minNode();

        obj.maxNode();
    }
}
