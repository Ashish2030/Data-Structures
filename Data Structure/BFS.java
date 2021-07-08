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
class BFS
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
   	public static  void BFS(Node root)
   	{
   	    Queue<Node> que=new LinkedList<>();
   	    que.add(root);
   	    while(que.size()>0)
   	    {
   	        Node temp=que.poll();
   	        System.out.println(temp.data);
   	        if(temp.left!=null)
   	        {
   	           que.add(temp.left); 
   	        }
   	         if(temp.right!=null)
   	        {
   	             que.add(temp.right);  
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
        BFS(root);
    }
}