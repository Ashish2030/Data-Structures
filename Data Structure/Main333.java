      import java.util.*;
class MergeSort 
{ 

	void merge(int arr[], int l, int m, int r) 
	{ 
		int n1 = m - l + 1; 
		int n2 = r - m; 
		int arr_Left[] = new int [n1]; 
		int arr_Right[] = new int [n2]; 
		for (int i=0; i<n1; i++) 
		{
		   	arr_Left[i] = arr[l + i];  
		}
		for (int j=0; j<n2; j++) 
		{
			arr_Right[j] = arr[m + 1+ j];     
		}
		int i = 0, j = 0; 
		int k = l; 
		while (i < n1 && j < n2) 
		{ 
			if (arr_Left[i] <= arr_Right[j]) 
			{ 
				arr[k] = arr_Left[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = arr_Right[j]; 
				j++; 
			} 
			k++; 
		} 
		while (i < n1) 
		{ 
			arr[k] = arr_Left[i]; 
			i++; 
			k++; 
		} 
		while (j < n2) 
		{ 
			arr[k] = arr_Right[j]; 
			j++; 
			k++; 
		} 
	} 
	void sort(int arr[], int l, int r) 
	{ 
		if (l < r) 
		{ 
			int m = (l+r)/2; 
			sort(arr, l, m); 
			sort(arr , m+1, r); 
			merge(arr, l, m, r); 
		} 
	} 
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 
}
class Main333
{
	public static void main(String args[]) 
	{ 
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int arr[] =new int[a];
	    for(int i=0;i<a;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    MergeSort ob = new MergeSort(); 
		System.out.println("Given Array"); 
		ob.printArray(arr); 
		ob.sort(arr, 0, arr.length-1); 
		System.out.println("\nSorted array"); 
		ob.printArray(arr); 
	} 
} 
