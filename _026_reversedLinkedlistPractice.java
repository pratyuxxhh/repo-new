public class _026_reversedLinkedlistPractice {
    class Node {
        int data ; 
        Node nextNode;

        Node(int data){
            this.data = data;
            this.nextNode = null ;
        }
    }
    Node head ; 

    public void reversed(){
        Node currNode = head.nextNode;
        Node prev = head ;

        while (currNode!=null) {
            Node next = currNode.nextNode;
            currNode.nextNode = prev;
            prev = currNode;
            currNode = next;
            
        }
        head.nextNode = null;
        head = prev;
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
    public static void main(String[] args) {
        _026_reversedLinkedlistPractice list = new _026_reversedLinkedlistPractice();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.printList();
        list.reversed();
        list.printList();
        
    }
}
