package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	private int V;
	private LinkedList<Integer>[] adj;

	public BFSGraph(int v) {
		this.V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			// adj ���� ����Ʈ�� ��Ÿ����, �� �������� ������ �������� ����� ����
			adj[i] = new LinkedList();
		}
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	// BFS Ž���� ����
	public void BFS(int start) {
		// visited �迭�� �� ������ �湮 ���θ� ����
		boolean[] visited = new boolean[V]; // �湮 ���θ� ǥ���ϱ� ���� �迭
		// BFS�� ���� ������ ������ ���
		Queue<Integer> queue = new LinkedList<>();
		// Ž���� ���� ���(start)���� �����ϰ�
		// ���� ��带 �湮�ϰ� ť�� �߰�
		visited[start] = true;
		queue.add(start);
		// ť�� ����� ������ �ݺ������� ���� �ܰ迡 ������ ��带 �湮
		while (!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start + " ");

			for (Integer neighbor : adj[start]) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}

}