package com.kh.PracticeGraph;

import com.kh.Practice.BFSGraph;
import com.kh.Practice.DFSGraph;

public class PracticeGraph {

	public static void main(String[] args) {
		PracticeGraph pg = new PracticeGraph();
		
		pg.BFSPracticeMain();
		//pg.DFSPracticeMain();
	}

	public void DFSPracticeMain() {
		int ver = 13;
		DFSGraph graph = new DFSGraph(ver);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		graph.addEdge(6, 7);
		graph.addEdge(6, 8);
		graph.addEdge(8, 9);
		graph.addEdge(8, 10);
		graph.addEdge(9, 7);
		graph.addEdge(7, 5);
		graph.addEdge(5, 4);
		graph.addEdge(4, 3);
		graph.addEdge(3, 11);
		graph.addEdge(11, 12);

		System.out.print("DPS 탐색 결과 : ");
		graph.DFS(0);
		System.out.println();
		System.out.println("0,1,2,3,4,5,6,7,8,9");
	}

	public void BFSPracticeMain() {
		BFSGraph g = new BFSGraph(12);
		// 간선 추가
		g.addEdge(3, 1);
		g.addEdge(3, 4);
		g.addEdge(3, 2);
		g.addEdge(2, 7);
		g.addEdge(4, 6);
		g.addEdge(1, 5);
		g.addEdge(7, 1);
		g.addEdge(5, 3);


		System.out.println("BFS 탐색 결과 : ");
		// BFS를 시작 노드 0에서 호출해서 실행
		g.BFS(1);
	}
}
