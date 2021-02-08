

public class reverse_circular { 
  Node prev1;
	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) { 
			data = d; 
		} 
	} 
// Same like reverse in singly we only add last node.next=null to address of head;
	void reverse()
	{ 
	    
	    Node t=head;
	    Node prev1=null;
	    Node temp;
do{
   temp=t.next;
   t.next=prev1;
   prev1=t;
   t=temp;
}
while(t!=head);
head.next=prev1;
head=prev1;


} 

	void push(int data)
	{ 

Node n=new Node(data);
        if(head==null)
        {
            head=n;
             n.next=head;
            prev1=n;
        }
        else
        {
            
           prev1.next=n;
           n.next=head;
           prev1=n;
        }
	} 

     public void Print(Node head)
{
 Node head1=head;
  System.out.print("Your list is : ");
  while(head!=head1.next)
  {
       System.out.print(head1.data+"-");
      head1=head1.next;
      
  }
    System.out.println(head1.data+" ");
}

	public static void main(String[] args) { 
		reverse_circular list = new reverse_circular(); 


		list.push(2); 
		list.push(4); 
		list.push(8); 
		list.push(10); 

		System.out.println("Original linked list "); 
		list.Print(head); 

		list.reverse(); 
		System.out.println(""); 
		System.out.println("The reversed Linked List is "); 
		list.Print(head); 
	} 
} 

