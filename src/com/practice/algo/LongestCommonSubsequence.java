package com.practice.algo;

import java.util.ArrayList;

public class LongestCommonSubsequence {

	public static void main(String[] args){
		
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
	    String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	 
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	    ArrayList list=new ArrayList();
	    System.out.println("Length of LCS is" + " " +
	                                  lcs.lcs2( X, Y, m, n) );
	  }
	
	
	public int lcs(char[] X,char[] Y,int m,int n,ArrayList list){
		if (m == 0 || n == 0){
			System.out.println("------------");
		      return 0;
		}
		
		if(X[m-1]==Y[n-1]){
			return lcs(X,Y,m-1,n-1,list)+1;
		}else{
			return max(lcs(X,Y,m-1,n,list),lcs(X,Y,m,n-1,list));
		}
		
	}
	
	public int max(int a, int b ){
		if(a>b)return a; 
				else 
					return b;
	}
	
	public int lcs2(char[] X,char[] Y,int m,int n){
		int[][] arr=new int[m+1][n+1];
	
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
			
				if(i==0 || j==0){
					arr[i][j]=0;
					continue;
				}
				
				if(X[i-1]==Y[j-1]){
					arr[i][j]=arr[i-1][j-1]+1;
				} else{
					arr[i][j]=max(arr[i-1][j],arr[i][j-1]);
					
				}
				
			}	
		}
		int i=m;
		int j=n;
		char[] ch=new char[arr[m][n]];
		int counter=arr[m][n];
		while(m>0 && n>0){
				if(X[m-1]==Y[n-1]){
					m--;
					n--;
					ch[counter-1]=X[m-1];
					System.out.println(ch[counter-1]);
				}else{
					if(arr[m-1][n] > arr[m][n-1]){
						m--;
					}else{
						n--;
					}
				}
			
		}

		return arr[i][j];
		
		
	}
	
}
