import java.util.*;
class levelOrderTransversalOfTree
{
    static Node root;
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
    //function for level order Transversal
    public void levelOrderTransversal(Node root)
    {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(queue.size()>0)
        {
            Node temp=queue.poll();
            System.out.println(temp.data);
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
             if(temp.right!=null)
            {
                 queue.add(temp.right);
            }
        }
    }
    //function for insertion 
    public Node insert(Node root,int arr[],int i)
    {
        if(i<arr.length)
        {
          if(root==null)
          {
              Node node=new Node(arr[i]);
              root=node;
          }
          root.left=insert(root.left,arr,2*i+1);
          root.right=insert(root.right,arr,2*i+2);
        }
        return root;
    }
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++)
	    {
	       arr[i]=sc.nextInt(); 
	    }
	    levelOrderTransversalOfTree obj=new levelOrderTransversalOfTree();
	    root=obj.insert(root,arr,0);
	    obj.levelOrderTransversal(root);
	}
}
//sample: 5 1 2 3 4 5 
// first 5 is the size of a array and others are value
// output: 1 2 3 4 5 