package com.practice.algo.sort;

public class InsertionSort {
	//Time complexity O(n^2)
	
	public static void main(String[] args){
		Integer[] arr=new Integer[]{40,20,15,11,30,12, 11, 13, 5, 6 };
		int j=0;
		while(j<arr.length-1){
			j++;
			int temp=0;//take the value in a temp variable 
			int insert_pos=0; //note the position where the data needs to be modified
			boolean swapready=false;//flag to check if swap is required or not
			for(int i=0;i<j;i++){//loop to find the position of the insertion
			
				if(arr[j]<arr[i]){
					temp=arr[j];
					insert_pos=i;
					swapready=true;
					break;
				}
			}
			if(swapready){
				int k=j;
				while(k>=insert_pos){
					arr[k]=arr[k-1];
					k--;
					if(k==insert_pos){
						arr[k]=temp;
						break;
					}
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
