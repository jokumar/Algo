package com.practice.algo.sort;

public class QuickSort {

	public static void main(String[] args){
		
		Integer[] arr=new Integer[]{10,80,30,90,40,50,70 };
		//quickSort(arr,arr.length-1,arr[arr.length-1]);
		
		new QuickSort().quicksort2(arr, 0, arr.length-1);
		
		int k=0;
		while(k<arr.length){
			System.out.println(arr[k]);
			k++;
			
		}
	}
	public void quicksort2(Integer[] arr, int l , int h ){
		if(l<h){
			int p=partition(arr, l, h);
			quicksort2(arr, l, p);
			quicksort2(arr, p+1, h);
		}
			
		
		
	}
	
	public static int partition(Integer[] arr, int i,int j){
		int p=i;
		int pivot = arr[p];
			
		while(i<=j){
			while(arr[i]<=pivot ){
				i++;
			}
			while( arr[j]>pivot){
				j--;
			}
			if(i<j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		arr[p]=arr[j];
		arr[j]=pivot;
		
		return j;
	}
	
	public static void quickSort(Integer[] arr, int pivotIndex,int pivotalValue){
		int leftArraySize=0;
		int rightArraySize=0;
		if(arr.length==1){
			System.out.println(arr[0]);
		}
		if(arr.length<2){
			System.out.println(pivotalValue);
			return;
			}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<arr[pivotIndex]){
				leftArraySize++;
			}
			if(arr[i]>arr[pivotIndex]){
				rightArraySize++;
			}
		}
		Integer[] leftArray=new Integer[leftArraySize];
		Integer[] rightArray=new Integer[rightArraySize];
		int leftIndex=0;
		int rightIndex=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<arr[pivotIndex]){
				leftArray[leftIndex++]=arr[i];
			}
			if(arr[i]>arr[pivotIndex])
			{
				rightArray[rightIndex++]=arr[i];
			}
		}
		
		quickSort(leftArray, leftIndex-1,arr[pivotIndex]);
		quickSort(rightArray, rightIndex-1,arr[pivotIndex]);
		
		
	}
}
