package Recursion;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

}

public class LinkedList {

	public static void main(String[] args) {

		/************** USING LIST INTERFACE(COLLECTIONS) **************/
		// LinkedList<String> Animals = new LinkedList<>();
		// Animals.add("cat");
		// Animals.add("Rat");
		// Animals.add("Dog");
		// Animals.add("snake");
		// Animals.addLast("chicken");
		// Animals.add(2, "Goat");
		// Animals.addFirst("Horse");
		// Animals.remove(3);
		// System.out.println(Animals);

		/************ NORMAL FORM (MANUALLY) ****************/
		Node first = new Node(5);
		Node second = new Node(15);
		Node third = new Node(25);

		first.next = second;
		second.next = third;

		Node head = first;

		// System.out.println(head.data);
		// System.out.println(head.next.data);
		// System.out.println(head.next.next.data);

		// insertion a new node at beginning
		Node newNode = new Node(2);
		newNode.next = head;
		head = newNode;

		// traversing of an Linked list
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
