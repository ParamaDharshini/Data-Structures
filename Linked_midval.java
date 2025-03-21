package Day_3;

public class Linked_midval {
	Node head;
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    public Linked_midval() {
    	head=null;
    	
    }
    public void insertAtBegin(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }
        }
    public int findMiddle() {
        
        if (head == null) {
            return -1; 
        }

        Node slow = head;
        Node fast = head;

        
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }
        return slow.data;
    }
    
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    } 
    
    public static void main(String args[]) {
    	Linked_midval m=new Linked_midval();
    	m.insertAtBegin(50);
    	m.insertAtBegin(40);
    	m.insertAtBegin(30);
    	m.insertAtBegin(20);
    	m.insertAtBegin(10);
    	m.display();
    	System.out.println(m.findMiddle());
    }

}
