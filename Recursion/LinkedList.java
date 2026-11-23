package Recursion;

public class LinkedList {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;

	// insert a node at first
	public void addfirst(int data) {
		Node newNode = new Node(data);// create new Node
		if (head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;// connect new node or head
		head = newNode;// changfe head to first node

	}

	// insert a node at Last
	public void addLast(int data) {
		Node newNode = new Node(data);// create new Node
		if (head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;// connect new node or tail
		tail = newNode;// changfe head to last node

	}

	// travering/print a Linked List//O(n)
	public void print(){
		if(head == null){
			System.out.println("Linked List is empty");
			return;
		}
		Node temp =head;
		while (temp != null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.print();
		ll.addfirst(2);
		ll.addfirst(1);
		ll.addfirst(0);
		ll.addLast(3);
		ll.addLast(4);
		ll.print();

	}

}
