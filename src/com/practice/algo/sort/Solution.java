package com.practice.algo.sort;
public class Solution {
 
	
	public static void main(String[] args){
		//[[15,13,2,5],
		//[14,3,4,1],
		//[12,6,8,9],
		//[16,7,10,11]]
		int[][] matrix={
				 {5,1,9,11},
	                {2,4,8,10},
	                {13,3,6,7},
	                {15,14,12,16}
		              };
		new Solution().rotate(matrix);
		for(int i=0;i<matrix.length;i++){
			System.out.print("{");
			for (int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+",");
			}
			System.out.println("}");
		}

	}
	
	public void rotate(int[][] matrix) {
        int len=matrix.length;
        int x=0;
        int end=len-1;
        while(len-x>1){
        	int beg=x;
        	int count =0;
	        for (int i =x;i<end;i++){
	        		
	        	 int temp1=matrix[i][end];
	             matrix[i][end]=matrix[beg][i];   
	            
	             int temp2=matrix[end][end-count];
	             matrix[end][end-count]=temp1;
	             
	             int temp3=matrix[end-count][beg];
                 matrix[end-count][beg]=temp2;

	             matrix[beg][i]=temp3;
	             count++;     
	           
	            		 
	        }
        
           x++;
           end--; 
        }
    }
}