package Linked_list;

import java.util.Scanner;

public class RemoveLatsKthNode {
	public static Node removeSinglyLinkedListLastKthNode(Node head, int lkth) {
		if(head == null || lkth < 1) {
			return null;
		}
		Node cur = head;
		while(cur != null) {
			lkth--;
			cur = cur.next;
		}
		if(lkth == 0) {
			head= head.next;
		}
		else if(lkth < 0) {
			cur = head;
			while(++lkth != 0) {
				cur = cur.next;
			}
			cur.next = cur.next.next;
		}
		return head;
	}
	
	public static DoubleNode removeDoubleLinkedListLastKthNode(DoubleNode head, int lkth) {
		if(head == null || lkth < 1) {
			return head;
		}
		DoubleNode cur = head;
		while(cur != null) {
			lkth--;
			cur = cur.next;
		}
		if(lkth == 0) {
			head = head.next;
			head.last = null;
			
		}
		else if(lkth < 0) {
			cur = head;
			while(++lkth != 0) {
				cur = cur.next;
			}
			DoubleNode newNode = cur.next.next;
			cur.next = newNode;
			if(cur.next != null) {
				newNode.last = cur;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		DoubleNode head;
		DoubleNode p;
		int lkth;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int[] a = {3,2,5,8,4,7,6,9,1,2,3,4,5,6,7,8,9,0};
		head = CreateLinkedList.generateDoubleLinkedList(a);
		p = head;
		System.out.println("请输入key值，表示倒数第几个数将会被删除");
		lkth = in.nextInt();
		System.out.print("原链表         ：");
		while(p != null){
			System.out.print(p.value + " ");
			p = p.next;
		}
		p = removeDoubleLinkedListLastKthNode(head, lkth);
		System.out.println();
		System.out.print("删除后的链表: ");
		while(p != null){
			System.out.print(p.value + " ");
			p = p.next;
		}
	}
}
