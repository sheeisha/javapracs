package pracs1;

public class QuickSort {
	
	public static int partition(int[]arr, int start, int end) {
		
		int p=start;
		int q=end-1;
		
		int pivot=arr[end];
		
		while(p<q) {
			while(arr[p]<=pivot&&p<=end-1) {
				p++;
			}
			//1
			while(arr[q]>pivot&&q>=start+1) {
				q--;
			}
			//5
			//2,4,6,3,5,7
			if(p<q) {
				int t=arr[q];
				arr[q]=arr[p];
				arr[p]=t;
			}
		}
		if(arr[p]>pivot) {
			int temp=arr[p];
			arr[p]=arr[end];
			arr[end]=temp;
		}
		return p;
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			
			int s=partition(arr,low,high);
			quickSort(arr,low,s-1);
			quickSort(arr,s+1,high);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,8,6,3,5,4,9,7};
		quickSort(arr,0,arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
