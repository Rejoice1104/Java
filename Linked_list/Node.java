package Linked_list;

class Node {
	
	public int value;
	public Node next;
	
	public Node(int value) {
		this.value=value;
	}
}

class DoubleNode{
	public int value;
	public DoubleNode last;
	public DoubleNode next;
	public DoubleNode(int data) {
		this.value = data;
	}
}

class CreateLinkedList{
	public static Node generateSingleLinkedList(int[] a) {
		if(a.length <= 0) {
			return null;
		}
		Node head = new Node(a[0]);
		Node p = head;
		for(int i = 1; i < a.length; i++) {
			p.next = new Node(a[i]);
			p = p.next;
		}
		p.next = null;
		return head;
	}
	
	public static DoubleNode generateDoubleLinkedList(int[] a) {
		if(a.length <= 0) {
			return null;
		}
		DoubleNode head = new DoubleNode(a[0]);
		DoubleNode p = head;
		head.last = null;
		for(int i = 1; i < a.length; i++) {
			DoubleNode q = new DoubleNode(a[i]);
			q.last = p;
			p.next = q;
			p = p.next;
		}
		p.next = null;
		return head;
	}
}