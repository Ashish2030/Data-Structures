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
class count_duplicate
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
        int number = Integer.parseInt(s.nextLine());
      Print(head);
      System.out.print("\n");
      count_duplicate(head,number);
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
static void count_duplicate(Node head,int num)
{
Node head1=head;
int count=0;
while(head1!=null)
{
    if(head1.data==num)
    {
        count++;
    }
    head1=head1.next;
}
System.out.println(count);
}
}