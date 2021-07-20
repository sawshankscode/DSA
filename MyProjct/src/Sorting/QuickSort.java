package Sorting;

public class QuickSort {
	static void quickSort(int arr[], int low, int high)
	{
	    if (low < high)
	    {
	        
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi-1);
	        quickSort(arr, pi+1, high);
	    } }
	 static int partition(int arr[], int low, int high)
	    {
	        // add your code here
	        int i=low;
	        int pivot=arr[high];
	        for(int j=low;j<=high-1;j++){
	            if(arr[j]<=pivot){
	                
	                int temp=arr[j];
	                arr[j]=arr[i];
	                arr[i]=temp;
	                i++;
	            }
	        }
	        int temp=arr[i];
	                arr[i]=arr[high];
	                arr[high]=temp;
	        return i;
	    } 
}
