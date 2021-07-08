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
class BottomView
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
     public static void maketree(Node root)
    {
        class obj 
        {
            Node data;
            int level;
            public obj(Node c,int y)
            {
                data=c;
                level=y;
            }
        }
        Queue<obj> que=new LinkedList<>();
        Map<Integer,Node> map=new TreeMap<>();
        if(root==null)
        {
            System.out.println("Error");
        }
        else
        {
            que.add(new obj(root,0));
            while(que.size()>0)
            {
                obj temp=que.poll();
                map.put(temp.level,temp.data);

                 if(temp.data.left!=null)
                {
                    que.add(new obj(temp.data.left,temp.level-1));
                }
                  if(temp.data.right!=null)
                {
                    que.add(new obj(temp.data.right,temp.level+1));
                }
            }
            
        }
        for(Map.Entry<Integer,Node> s:map.entrySet())
        {
            System.out.println(s.getValue().data);
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
        maketree(root);
    }
}