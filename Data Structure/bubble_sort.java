import java.util.Scanner;
class bubble_sort

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
       for(int j=0;j<k-1-i;j++)
       {
           if(arr[j]>arr[j+1])
           {
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;  
           }
       }
      }
      for(int i=0;i<k;i++)
      {
      System.out.println(arr[i]);  
      }
      }
    }