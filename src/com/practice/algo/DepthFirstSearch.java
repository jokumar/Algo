package com.practice.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.practice.algo.BreadthFirstSearchExampleNeighbourList.Node;

public class DepthFirstSearch {

	Stack stack=new Stack();
	static class Node{
		int data;
		boolean visited;
		ArrayList<Node> neighboursList;
		public Node(int data){
			this.data=data;
			visited=false;
			neighboursList=new ArrayList<>();
		}
		
		public void addneighbours(Node node){
			
			neighboursList.add(node);
		}
	}
	
	public void dfs(Node node){
		stack.push(node);
		
		while(!stack.isEmpty()){
			Node n=(Node) stack.pop();
			n.visited=true;
			System.out.println(n.data);
		List<Node> neighbourslist=n.neighboursList;
		
			for(Node ns:neighbourslist){
				if(ns!=null && !ns.visited){
					ns.visited=true;
					stack.push(ns);
				}
			}
		
			
			
		}
		
	}
	
	public static void main(String[] args){
		
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
 
		node40.addneighbours(node10);
		node40.addneighbours(node20);
		node10.addneighbours(node30);
		node20.addneighbours(node10);
		node20.addneighbours(node30);
		node20.addneighbours(node60);
		node20.addneighbours(node50);
		node30.addneighbours(node60);
		node60.addneighbours(node70);
		node50.addneighbours(node70);
		System.out.println("The BFS traversal of the graph is ");
		DepthFirstSearch bfsExample = new DepthFirstSearch();
		bfsExample.dfs(node40);
			
	}
	
	
}
