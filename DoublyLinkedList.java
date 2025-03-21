package Day_4;

public class DoublyLinkedList {
	
	    

	    static class Node {
	        int data;
	        Node next;
	        Node prev;

	        
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	            this.prev = null;
	        }
	    }

	    
	    public static Node cloneList(Node head) {
	        if (head == null) {
	            return null; 
	        }

	       
	        Node current = head;
	        while (current != null) {
	            Node newNode = new Node(current.data);
	            newNode.next = current.next;
	            current.next = newNode;
	            newNode.prev = current;
	            current = newNode.next; 
	        }

	        
	        Node original = head;
	        Node clonedHead = head.next; 
	        Node clonedNode = clonedHead;

	        while (original != null) {
	            
	            if (original.next != null) {
	                clonedNode.next = original.next.next; 
	            }
	            
	            if (clonedNode.next != null) {
	                clonedNode.next.prev = clonedNode;
	            }

	            original = original.next != null ? original.next.next : null; 
	            clonedNode = clonedNode.next; 
	        }

	        return clonedHead; 
	    }

	   
	    public static void printList(Node head) {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " <-> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	       
	        Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.prev = head;
	        head.next.next = new Node(3);
	        head.next.next.prev = head.next;
	        head.next.next.next = new Node(4);
	        head.next.next.next.prev = head.next.next;

	        System.out.println("Original Doubly Linked List:");
	        printList(head);

	        
	        Node clonedList = cloneList(head);

	        System.out.println("Cloned Doubly Linked List:");
	        printList(clonedList);
	    }
	}
