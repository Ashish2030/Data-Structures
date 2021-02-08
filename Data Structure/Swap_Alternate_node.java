import java.util.Scanner;
class Node
{
  int data;
  Node next;
  Node(int d)
  {
    data=d;
  }
}
class Swap_Alternate_node
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
       Swap_Alternate_node(head);
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
static void  Swap_Alternate_node(Node head)
{
Node head1=head;
Node head2=head;
int count=0;
while(head1!=null)
{
    count++;
    head1=head1.next;
}
Node prev=null;
int temp=0;
 for(int i=1;i<=count;i++)
 {
     if(i%2==0)
     {
       temp=prev.data;
       prev.data=head2.data;
       head2.data=temp;
     }
     prev=head2;
     head2=head2.next;
 }
  Print(head);
}
}