package codingpractice;

public class LinkedList {

	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}

	}

	public static class Test {
		public static void main(String[] args) {
			// creating a linkedlist
			Node head = null;
			head = insertAtBegin(head, 70);
			head = insertAtBegin(head, 10);
			printList(head);

		}

		static void printList(Node node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		}

		static Node insertAtBegin(Node head, int data) {
			Node temp = new Node(data);
			temp.next = head;
			return head;

		}

	}

	// O(n)
	// 10->20-30
}
