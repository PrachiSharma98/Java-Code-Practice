//JAVA linkedlist creation and traversing.
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
		print(head);
}
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	}
	
	
}
