class Priority_Queue_Using_Linked_List
{
	Node head;
	int size=0;
	class Node
	{
		int data;
		int priority;
		Node next;
		Node(int d, int p)
		{
			data = d;
			priority = p;
		}
	}
	public Node peek()
	{
		return head;
	}
	public Node pop()
	{
		Node temp;
		temp = head;
		head = head.next;
		size--;
		return temp;
	}
	public void push(int d, int p)
	{
		if(isEmpty())
		{
			Node temp = new Node(d, p);
			temp.next = null;
			head = temp;
		}
		else
		{
			Node start = head;
			Node temp = new Node(d, p);
			if(head.priority>p)
			{
				temp.next = head;
				head = temp;
			}
			else
			{
				while(start.next!=null && start.next.priority<p)
				{
					start = start.next;
				}
				temp.next = start.next;
				start.next = temp;
			}
		}
		size++;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public int size()
	{
		return size;
	}
	public void display()
	{
		Node temp = head;
		System.out.print("Updated Priority Queue Is: ");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("\n");
	}
	public static void main(String args[])
	{
		Node temp;
		Priority_Queue_Using_Linked_List pq = new Priority_Queue_Using_Linked_List();

		System.out.println("\nPushing 4 With Priority 3 Into Queue....");
		pq.push(4, 3);
		pq.display();

		System.out.println("Pushing 5,9 With Priority 4,8 Into Queue....");
		pq.push(5, 4);
		pq.push(9, 8);
		pq.display();

		System.out.println("Size Of Queue Is: "+pq.size()+"\n");

		temp = pq.peek();
		System.out.println("Top Element Is "+temp.data+" With Priority "+temp.priority+"\n");

		System.out.println("Pushing 7 With Priority 0 Into Queue....");
		pq.push(7, 0);
		pq.display();

		temp = pq.peek();
		System.out.println("Top Element Is "+temp.data+" With Priority "+temp.priority+"\n");

		System.out.println("Pushing 6,1 With Priority 2,9 Into Queue....");
		pq.push(6, 2);
		pq.push(1, 9);
		pq.display();

		System.out.println("Size Of Queue Is: "+pq.size()+"\n");

		temp = pq.pop();
		System.out.println("Popping "+temp.data+" With Priority "+temp.priority+" From Queue");
		pq.display();

		temp = pq.pop();
		System.out.println("Popping "+temp.data+" With Priority "+temp.priority+" From Queue");
		pq.display();

		temp = pq.pop();
		System.out.println("Popping "+temp.data+" With Priority "+temp.priority+" From Queue");
		pq.display();

		temp = pq.peek();
		System.out.println("Top Element Is "+temp.data+" With Priority "+temp.priority+"\n");

		System.out.println("Size Of Queue Is: "+pq.size()+"\n");
	}
}