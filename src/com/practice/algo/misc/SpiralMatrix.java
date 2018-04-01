package com.practice.algo.misc;

public class SpiralMatrix {

	public static void main(String[] args) {
			int R = 3;
	        int C = 6;
	        int a[][] = { {1,  2,  3,  4,  5,  6},
	                      {7,  8,  9,  10, 11, 12},
	                      {13, 14, 15, 16, 17, 18}
	                    };
	        spiralPrint(R,C,a);

	}
	
	public static void spiralPrint(int x,int y, int[][] arr){
		
		int row=0;
		int col=0;
		
	while(row<x && col<y){
		
		
		for(int i=col;i<y;i++){
			
			System.out.println(arr[row][i]);
		}
		row++;
		for(int i=row;i<x;i++){
			System.out.println(arr[i][y-1]);
		}
		y--;
		
		if(row<x){
		for(int i=y;i>col;i--){
			
			System.out.println(arr[x-1][i]);
		}
		x--;
		}
		
		if(col<y){
		for(int i=x;i>row;i--){
			
			System.out.println(arr[i][col]);
		}
		col++;
		}

		
		} 
	}

}
