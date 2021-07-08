import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
    }
    
}
class leftView
{
    static Node root;
    public static Node insert(int arr[],Node root,int i)
    {
        if(i<arr.length)
        {
            Node t=new Node(arr[i]);
            root=t;
            root.left=insert(arr,root.left,2*i+1);
            root.right=insert(arr,root.right,2*i+2);
        }
        return root;
        
    }
   	public static  void DFS(Node root)
   	{
	Stack<Node> s=new Stack<>();
	s.push(root);
	while(s.size()>0)
	{
	    Node temp=s.pop();
	    System.out.println(temp.data);
	    if(temp.right!=null)
	    {
	       s.push(temp.right) ;
	    }
	    if(temp.left!=null)
	    {
	        s.push(temp.left) ;
	    }
	}
	}
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        root=insert(arr,root,0);
        DFS(root);
    }
}