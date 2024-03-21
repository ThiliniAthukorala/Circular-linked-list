public class Main2 {
    public static void main(String[] args) {

        CircularLinkedList circularLinkedList=new CircularLinkedList();

        circularLinkedList.addNode(1);
        circularLinkedList.addNode(2);
        circularLinkedList.addNode(3);
        circularLinkedList.addNode(4);
        circularLinkedList.print();

       circularLinkedList.SearchNode(2);

       circularLinkedList.DeleteNode(3);
       circularLinkedList.print();


    }




}
