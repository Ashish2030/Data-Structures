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
class rightView
{
    static Node root;
       static int  count=0;
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
     public static void  leftview(Node root)
    {
        count=0;
      ArrayList<Integer> a=new ArrayList<>();
      if(root==null)
      {
          return ;
      }
      else
      {
          temp(root,1,a);
      }
      for(int i=0;i<a.size();i++)
      {
          System.out.println(a.get(i));
      }
    }
       public static void  temp(Node root,int level,ArrayList<Integer> a)
    {
        if(level>count)
        {
            count=level;
        a.add(root.data);
        }
      
            if(root.right!=null)
        {
             temp(root.right,level+1,a);
        }
  if(root.left!=null)
        {
            temp(root.left,level+1,a);
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
        System.out.println(root.data);
        leftview(root);
    }
}