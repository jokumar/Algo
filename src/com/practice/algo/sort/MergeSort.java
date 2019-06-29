package com.practice.algo.sort;

public class MergeSort {

	//O(nlogn)
	//divide it into 2 half 
	//sort the left part 
	//sort the right part 
	//merge both the part
	public static void main(String[] args) {
		Integer[] arr=new Integer[]{45,10,43,23,54,33};
		
		sort(arr,arr.length);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
	
	public static void sort(Integer[] arr,int l){
		
		
		int m=l/2;
		if(l<2){return;}
		
		Integer[] leftArray=new Integer[m];
		Integer[] rightArray=new Integer[l-m];
		
		for(int i=0;i<m;i++){
			leftArray[i]=arr[i];
		}
		for(int i=m;i<l;i++){
			
			rightArray[i-m]=arr[i];
		}
		
		
			sort(leftArray,m);
			sort(rightArray,l-m);
			merge(arr,leftArray,rightArray,m,l-m);
		
	}
	public static void merge(Integer[] arr,Integer[] leftArray,Integer[] rightArray,int l,int r){
		int i=0;int j=0;int k=0;
		while(j<l && k<r){
			if(leftArray[j]<rightArray[k]){
				arr[i++]=leftArray[j++];
			}else{
				arr[i++]=rightArray[k++];
			}
			
		}
		while(j<l){
			arr[i++]=leftArray[j++];
		}
		while(k<r){
			arr[i++]=rightArray[k++];
		}
	}
}
