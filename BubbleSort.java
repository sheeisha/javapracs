package pracs1;

import java.util.*;

public class BubbleSort {
	static void bubsort(int[] arr, int n) {
//		int n=arr.length;
		int temp=0;
		for(int i=0; i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	static void newSort() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length: ");
		int l=sc.nextInt();
		int arr[]= new int[l];
		for(int i=0; i<l; i++) {
			System.out.println(i+"th element: ");
			arr[i]=sc.nextInt();
			bubsort(arr,i+1);
			
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		newSort();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter len: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("enter elements");
		for(int i=0; i<arr.length;i++) {
			int e=sc.nextInt();
			arr[i]=e;
		}
		
		System.out.println("array before bubble sort");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		bubsort(arr, arr.length);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}