package Linked_list;

import java.util.*;

class findCommonPart1{
	public void printCommonPart(LinkedList<Integer> node1, LinkedList<Integer> node2) {
		int tag = 0;
		System.out.print("Common part is : ");
		
		while(!node1.isEmpty() && !node2.isEmpty()) {
			if(node1.peekFirst() == node2.peekFirst()) {
				System.out.print(node1.peekFirst() + " ");
				tag = 1;
				node1.pollFirst();
				node2.pollFirst();
			}
			else if(node1.peekFirst() < node2.peekFirst()) {
				node1.pollFirst();
			}
			else {
				node2.pollFirst();
			}
		}
		
		if(tag == 0) {
			System.out.println("no common part !");
		}
	}
}

class findCommonPart2{
	public void printCommonPart(Node node1, Node node2) {
		int tag = 0;
		System.out.print("Common part is : ");
		
		while(node1 != null && node2 != null) {
			if(node1.value == node2.value) {
				System.out.print(node1.value + " ");
				tag = 1;
				node1 = node1.next;
				node2 = node2.next;
			}
			else if(node1.value < node2.value) {
				node1 = node1.next;
			}
			else {
				node2 = node2.next;
			}
		}
		
		if(tag == 0) {
			System.out.println("no common part !");
		}
	}
}

public class TwoLinkCommonPart {
	public static void main(String[] args) {
		Node head1;
		Node head2;
		int[] a = new int[100];
		int[] b = new int[100];
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		head1 = CreateLinkedList.generateSingleLinkedList(a);
		for(int i = 0; i < b.length; i+=2) {
			b[i/2] = b.length-i;
		}
		head2 = CreateLinkedList.generateSingleLinkedList(b);
		findCommonPart2 fcp = new findCommonPart2();
		fcp.printCommonPart(head1, head2);
	}
}
