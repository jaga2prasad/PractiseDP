package com.jaga.circularDFS;

import java.util.List;

public class CycleDFS {
	public void findCircular(List<Vertex> list) {
		for(Vertex v:list) {
			if(!v.isVisited()){
				dfs(v);
			}
		}
	}

	private void dfs(Vertex v) {
		System.out.println("DFS on vertex" +v);
		v.setBeingVisited(true);
		for(Vertex v1:v.getNeighbours()) {
			System.out.println("vertex is "+v1);
			if(v1.isBeingVisited()){
				System.out.println("there is backward edge so there is cycle");
				return ;
			}
			
			if(!v1.isVisited()) {
				System.out.println("visiting vertex recursively"+v1);
				v1.setVisited(true);
				dfs(v1);
			}		
			
		}
		v.setBeingVisited(false);
		v.setVisited(true);
	}
}
