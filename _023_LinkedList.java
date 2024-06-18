//SCRATCH IMPLEMENTATION OF LINKED LIST


public class _023_LinkedList {

    Node head ;

    public class Node{
        int data;
        private int  size =0;
        Node nextNode;

        Node(int data){
            this.data = data;
            this.nextNode=null;
            size++;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        
        newNode.nextNode = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newnNode = new Node(data);
        Node currNode = head;
        if (currNode == null) {
            head = newnNode;
            return;
        }
        while (currNode.nextNode!=null) {
            currNode = currNode.nextNode;
        }
        currNode.nextNode = newnNode;
    }
    public void printList(){
        Node currentNode = head;

        while (currentNode!=null) {
            System.out.print(currentNode.data+ "->");
            currentNode = currentNode.nextNode;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        Node currNode=head;
        head = currNode.nextNode;
    }
    public void removeLast(){

        Node currNode = head;
        if (currNode==null ) {
            return;
        }
        
       if(head.nextNode == null) {
        head = null;
        return;
    }

        while (currNode.nextNode.nextNode!=null) {
            currNode=currNode.nextNode;
        }
        currNode.nextNode=null;
        
    }

    public void reverseList(){
        Node currNode = head.nextNode;
        Node prev =  head;
        while (currNode!= null) {
            
            Node next = currNode.nextNode;
            currNode.nextNode = prev;

            prev = currNode;
            currNode = next;
        }
        head.nextNode=null;
        head = prev;
      
    }
    public static void main(String[] args) {
       _023_LinkedList list = new _023_LinkedList(); 
       list.addFirst(10);
       list.addFirst(20);
       list.addLast(30);
       list.addFirst(0);
       
        list.printList();
        list.reverseList();
        list.printList();
    }
}
