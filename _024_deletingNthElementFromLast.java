public class _024_deletingNthElementFromLast {
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




    // que 1 --> deleting nth element from last of the list;

    public void  dfs(int index){
        Node currNode = head;
        int size = 0 ;
        while (currNode!=null) {
            
            size++;
            currNode = currNode.nextNode;
        }
        int i = size-index  ;

        Node prev = head;
        for (int j = 1; j < i; j++) {
            prev = prev.nextNode;
        }
        prev.nextNode = prev.nextNode.nextNode;
    }
   
    
    // que 2 -->
    public static void main(String[] args) {
       _024_deletingNthElementFromLast list = new _024_deletingNthElementFromLast(); 
       list.addFirst(10);
       list.addFirst(20);
       list.addFirst(30);
       list.addFirst(40);
       list.addFirst(50);
       list.addFirst(60);

        list.printList();
        list.dfs(2);
        list.printList();;
    }
}
