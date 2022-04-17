package codingpractice;

public class LinkedList {

	static class Node{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
		
	}
	public static class Test{
	public static void main(String [] args)
	{
		//creating a linkedlist
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next=temp1;
		temp1.next=temp2;	
		//traversing linkedlist
		Node rev=reverse(head);
		printList(rev);
}
	public static Node reverse(Node head)
	{
		Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
		Node temp=curr.next;
		curr.next=prev;
		prev=curr;
		curr=temp;
		
		}
		return prev;
	}
	 static void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	}
	
	//O(n)
	//10->20-30
}
