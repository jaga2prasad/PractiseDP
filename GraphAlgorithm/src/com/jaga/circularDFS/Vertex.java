package com.jaga.circularDFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String data;
	private boolean beingVisited;
	private boolean visited;
	List<Vertex> neighbours;
	
	Vertex(String data){
		this.data = data;
		neighbours = new ArrayList<>();
	}
	
	public void addNeighbours(Vertex v) {
		this.neighbours.add(v);
	}
	
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(List<Vertex> neighbours) {
		this.neighbours = neighbours;
	}

	@Override
	public String toString() {
		return this.data;
	}
}
