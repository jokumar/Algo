package  com.practice.algo.shortestPath;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class DijkstraShortestPath {
	
	static class Vertex implements Comparable<Vertex> {
		int distance =Integer.MAX_VALUE;
		boolean visited;
		String name;
		ArrayList<Edge> neighbouringnodes=new ArrayList<>();
		Vertex parentNode;
	
		Vertex(String data){
			this.name=data;
		}
		void addNeighbour(Edge e){
			neighbouringnodes.add(e);
		}
		@Override
		public int compareTo(Vertex otherVertex) {
			return Integer.compare(this.distance, otherVertex.distance);
		}
	}
	static class Edge{
		int weight;
		Vertex start;
		Vertex end;
		Edge(int weight,Vertex start, Vertex end ){
			this.start=start;
			this.end=end;
			this.weight=weight;
		}
	}
	
	
	void shortestpath(Vertex v){
		
		v.distance=0;
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(v);
		v.visited=true;
		
		while(!priorityQueue.isEmpty()){
			
			Vertex actualVertex =	priorityQueue.poll();
			
			List<Edge> neighbourList=actualVertex.neighbouringnodes;
			
			for(Edge edge:neighbourList){
				
				Vertex target=edge.end;
				
				if(!target.visited ){
					int newdistance=edge.weight+actualVertex.distance;
					if(newdistance<target.distance){
						target.distance=newdistance;
						target.parentNode=actualVertex;
						priorityQueue.add(target);
					}
					
				}
			}
			actualVertex.visited=true;
		}
		
		
		
	}

	//Print the shortest Path
	static void printShortestPath(Vertex v){
		Stack stack=new Stack<>();
		stack.push(v);
		Vertex vs =v.parentNode;
		while(vs!=null){
			stack.push(vs);
			vs=vs.parentNode;
		}
		while(!stack.isEmpty()){
			Vertex s=(Vertex) stack.pop();
			System.out.println(s.name);
		}
		
	}

public static void main(String[] args) {
		
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexC = new Vertex("C");
		Vertex vertexD = new Vertex("D");
		Vertex vertexE = new Vertex("E");
		
		vertexA.addNeighbour(new Edge(10,vertexA,vertexC));
		vertexA.addNeighbour(new Edge(17,vertexA,vertexB));
		vertexC.addNeighbour(new Edge(5,vertexC,vertexB));
		vertexC.addNeighbour(new Edge(9,vertexC,vertexD));
		vertexC.addNeighbour(new Edge(11,vertexC,vertexE));
		vertexB.addNeighbour(new Edge(1,vertexB,vertexD));
		vertexD.addNeighbour(new Edge(6,vertexD,vertexE));
	
		DijkstraShortestPath shortestPath = new DijkstraShortestPath();
		shortestPath.shortestpath(vertexA);
		
		System.out.println("======================================");
		System.out.println("Calculating minimum distance");
		System.out.println("======================================");
		
		System.out.println("Minimum distance from A to B: "+vertexB.distance);
		System.out.println("Minimum distance from A to C: "+vertexC.distance);
		System.out.println("Minimum distance from A to D: "+vertexD.distance);
		System.out.println("Minimum distance from A to E: "+vertexE.distance);
		
		printShortestPath(vertexB);

}
}