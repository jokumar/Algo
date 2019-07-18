package com.practice.algo.search;

public class BinarySearch {
	public static void main(String[] args){
		
		Integer[] arr={10,20,30,40,50,60,70,80,90};
		int pos=new BinarySearch().recursiveSearch(arr, 70, 1, arr.length);
		int pos2=new BinarySearch().iterativeSearch(arr, 80);
		System.out.println("Recursive search :"+pos);
		System.out.println("iterative search :"+pos);
	}
	public int recursiveSearch(Integer[] arr,int x,int l,int h){
		
		int mid=(l+h)/2;
		if(h>=l){
			if(x==arr[mid-1]){
				return mid-1;
			}
			
			if(x>arr[mid-1]){
				return recursiveSearch(arr,x,mid+1,h);
			}else if (x<arr[mid-1]){
				return recursiveSearch(arr,x,l,mid-1);
			}
		}
		return 0;
	}
	
	public int iterativeSearch(Integer[] arr,int e){
		int l=1;int h=arr.length;
		while(h>=l){
			int mid=(l+h)/2;
			if(e>arr[mid]){
				l=mid+1;
			}
			if(e<arr[mid]){
				h=mid-1;
			}
			if(e==arr[mid]){
				return mid;
			}
		}
		return 0;
	}
}
