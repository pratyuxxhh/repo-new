// ONLY WORK WHEN SIZE IS EVEN..

import java.util.Scanner;

public class _025_IsPalindrome {
    Node head;

    class Node {
        int data;
        Node nextNode;

        Node(int data) {
            this.data = data;
            this.nextNode = null;

        }
    }

    public int size() {
        Node currNode = head;
        int size = 0;
        while (currNode != null) {
            size++;
            currNode = currNode.nextNode;
        }
        return size;
    }

    public boolean isPalindrome() {
        Node fakeCurrNode = head;
        if (size() % 2 == 0) {
            for (int i = 0; i < size() / 2; i++) {
                fakeCurrNode = fakeCurrNode.nextNode;
            }
            Node fakeHead = fakeCurrNode;

            Node currNode = fakeHead.nextNode;
            Node prev = fakeHead;
            while (currNode != null) {

                Node next = currNode.nextNode;
                currNode.nextNode = prev;

                prev = currNode;
                currNode = next;
            }

            fakeHead.nextNode = null;
            fakeHead = prev;
            fakeCurrNode = fakeHead;

        }
        Node currNode = head;
        while (fakeCurrNode != null) {
            if (currNode.data != fakeCurrNode.data) {
                return false;
            }
            currNode = currNode.nextNode;
            fakeCurrNode = fakeCurrNode.nextNode;
        }
        return true;
    }

    public void addLast(int data) {
        Node newnNode = new Node(data);
        Node currNode = head;
        if (currNode == null) {
            head = newnNode;
            return;
        }
        while (currNode.nextNode != null) {
            currNode = currNode.nextNode;
        }
        currNode.nextNode = newnNode;
    }

    public void printList() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.nextNode;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        _025_IsPalindrome list = new _025_IsPalindrome();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            list.addLast(data);
        }
        list.printList();
        System.out.println(list.isPalindrome());

    }
}