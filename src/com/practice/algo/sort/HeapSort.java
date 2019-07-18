package com.practice.algo.sort;

public class HeapSort {
	public static void main(String[] args){
		new HeapSort().sort(new int[]{90,1,33,22,45,15,39,89,25,69});
	}
	//String [] arr = {8,6,9,12,18,24,4}
	public void sort(int[] arr){
		int[] heap=new int[arr.length];
		heap[0]=arr[0];//keep the root element in heap 
		int i=1;
		
		//creation of the heap 
		while(i<arr.length){
			int j=i;
			//check if the parent is lesser than 
			//child then keep swapping 
			while(arr[j/2]<arr[j]){ 
				int temp=arr[j/2];
				arr[j/2]=arr[j];
				arr[j]=temp;
				j=j/2;
			}
			i++;
		}
		
		int m=arr.length-1;
		i=1;
		//deletion of the heap 
		while(m>0){
			int t=arr[0];
			arr[0]=arr[m];
			arr[m]=t;
			m--;
			 i=1;
			while(i<=m){
				int j=i;
			//check if the parent is lesser than 
			//child then keep swapping 
			while(arr[j/2]<arr[j]){ 
				int temp=arr[j/2];
				arr[j/2]=arr[j];
				arr[j]=temp;
				j=j/2;
			}
			i++;
			}
		}
		
		
		int k=0;
		while(k<arr.length){
			System.out.println(arr[k]);
			k++;
			
		}
	
	//	 {12,9,8,6,18,24,4}	
	}
	
}
