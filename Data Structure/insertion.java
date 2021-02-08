import java.util.Scanner;
class insertion

{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int index=0;
      int k=sc.nextInt();
        int arr[]=new int[k];
      for(int i=0;i<k;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<k-1;i++)
      {
         int temp=i+1;
         for(int j= temp-1;j>=0;j--)
         {
             int data=arr[temp];
             if(arr[j]>data)
             {
             int  m=arr[temp];
              arr[temp]=arr[j];
              arr[j]=m;
              temp=j;
             }
             else
             {
                 break;
             }
         }
      }
      for(int i=0;i<k;i++)
      {
      System.out.println(arr[i]);  
      }
      }
    }