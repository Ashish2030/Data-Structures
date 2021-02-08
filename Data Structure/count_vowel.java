import java.util.Scanner;
class Node
{
  char data;
  Node next;
  Node(char d)
  {
    data=d;
  }
}
class count_vowel
{
  static Node insertEnd(Node head, char data)
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
    int t,n;
 char m;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      Node head = null;
      n = Integer.parseInt(s.nextLine());
      
      while(n > 0)
      {
        m = s.next().charAt(0);
        head = insertEnd(head, m);
        n--;
      }
      Print(head);
      System.out.print("\n");
      count_vowel(head);
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
static void count_vowel(Node head)
{
Node head1=head;
int count=0;
while(head1!=null)
{
    if(head1.data=='A'||head1.data=='a'||head1.data=='e'||head1.data=='E'||head1.data=='i'||head1.data=='I'||head1.data=='o'||head1.data=='O'||head1.data=='u'||head1.data=='U')
    {
        count++;
    }
    head1=head1.next;
}
System.out.println(count);
}
}