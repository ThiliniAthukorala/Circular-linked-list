public class CircularLinkedList {
    Node2 head;
    Node2 tail;

    public CircularLinkedList() {
        this.head =null;
        this.tail = null;
    }

    public void addNode(int data){
        Node2 node=new Node2(data);
        if (head==null){
            head=node;
            tail=node;
        }else {
            tail.next=node;
            tail=node;
            tail.next=head;
        }
    }

    public boolean SearchNode(int NewData){
        Node2 current=head;

        do {
            if (current.data==NewData){
                return true;
            }
            current=current.next;
        }while (current!=head);
        return false;
    }

    public void DeleteNode(int DData){
        Node2 current=head;
        if (head==null){
            return;
        }
        do{
            if (current.next.data==DData){
                if (tail==head){
                    head=null;
                    tail=null;
                }else {
                    current.next=current.next.next;
                    if (tail==current.next){
                        tail=head;
                    }
                }
                break;
            }

         current=current.next;
        }while (current!=null);
        System.out.println();
    }

    public void print(){
        Node2 temp=head;

        if (head !=null){
            do {
                System.out.print(temp.data+" ");
                temp=temp.next;

            }while (temp!=head);
        }
    }


}
