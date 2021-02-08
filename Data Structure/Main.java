import java.util.Scanner;
//--------------------------Not Copied From GeeksforGeeks Ide Like others--------------------------------
class Node
{
  int data;
  Node next;
  Node(int d)
  {
    data=d;
  }
}
class Main
{
  static Node insertEnd(Node head, int data)
  {
    Node newLink = new Node(data);
    Node last = head;
    newLink.next = null;   
    if (head == null)  
    {
      head = newLink;
      return head;
    }
    while (last.next != null)
      last = last.next;
    last.next = newLink;  
    return head;
  }
public static void main(String[] args)
  {
    int t,n,m;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      Node head = null;
      n = Integer.parseInt(s.nextLine());
      while(n > 0)
      {
        m = Integer.parseInt(s.nextLine());
        head = insertEnd(head, m);
        n--;
      }
      Print(head);
      System.out.print("\n");
      duplicate(head);
      System.out.print("\n");
      t--;
    }
  }
static void Print(Node head)
{
	if(head==null)
    {
     	return; 	
	}
  	System.out.print(head.data+"-");
  	Print(head.next);
}
static void duplicate(Node head)
{
Node head1=head;
Node head2=head;
Node prev=null;
while(head1!=null)
{
    head2=head1.next;
   prev=head1;
    while(head2!=null)
    {
        if(head1.data==head2.data)
        {
            prev.next=head2.next;
        }
        else
        {
           prev=head2; 
        }
        head2=head2.next;
    }
    head1=head1.next;
}
Print(head);
}
}