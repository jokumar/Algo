package com.practice.algo;

public class LongestIncreasingSubsequence {

	
	public static void main(String[] args){
		
		  int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
          int n = arr.length;
          System.out.println("Length of lis is " + lis( arr, n ) + "n" );
	}
	
	public static int lis(int[] arr,int n){
		//inititalize to 1
		int lis[]=new int[n];
		for(int i=0;i<n;i++){
			lis[i]=1;
		}
		
		
		
		for(int i=1;i<n;i++){
			
			for(int j=0;j<i;j++){
				
				if(arr[i]>arr[j] && lis[i]<lis[j]+1){
					
					lis[i]=lis[j]+1;
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++){
			if(lis[i]>max){
				max=lis[i];
				System.out.println(arr[i]);
			}
			
		}
		
		return max;
		
	}
}
