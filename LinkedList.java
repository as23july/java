public class LinkedList {
    
    Node head;
    
    private int size;

    LinkedList()
    {
        this.size =0;
    }
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first -  last
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    public void printList() {
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst() {
        if(head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast() {
        if(head == null)
        {
            System.out.println("list is Empty");
            return;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getsize(){
        return size;
    }

    public void reverse() {
        if(head == null || head.next == null){
            return;
        }
        
        Node prev = head;
        Node curr = head.next;
        while(curr != null)
        {
            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }
    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.reverse();
        list.printList();

    }
}
