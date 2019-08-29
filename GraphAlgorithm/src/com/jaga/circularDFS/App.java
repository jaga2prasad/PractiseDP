package com.jaga.circularDFS;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		
		List<Vertex> v = new ArrayList<>();
		
		v1.addNeighbours(v2);
		v1.addNeighbours(v3);
		v2.addNeighbours(v3);
		v4.addNeighbours(v1);
		v4.addNeighbours(v5);
		v5.addNeighbours(v6);
		v6.addNeighbours(v4);
		
		v.add(v1);
		v.add(v2);
		v.add(v3);
		v.add(v4);
		v.add(v5);
		v.add(v6);
		
		CycleDFS dfs = new CycleDFS();
		dfs.findCircular(v);
	}
}
