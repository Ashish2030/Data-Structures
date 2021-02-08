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
class Average
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
    
      System.out.print("\n");
      Average(head);
      System.out.print("\n");
      t--;
    }
  }
static void Average(Node head)
{
    int count=0;
Node head1=head;
Node head2=head;
Node prev=null;
int sum=0;
while(head1!=null)
{
    count++;
    sum=sum+head1.data;

    head1=head1.next;
}
System.out.println(sum/count);
}
}