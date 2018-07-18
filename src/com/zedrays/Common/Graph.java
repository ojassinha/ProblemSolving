package com.zedrays.Common;

import java.util.LinkedList;

/**
 * Created by zedray on 7/17/18.
 */
public class Graph {

    public int V;

    public LinkedList<Integer> nodes[];

    public Graph(int v){
        this.V = v;
        nodes = new LinkedList[v];
        for (int i=0; i<v; ++i)
            nodes[i] = new LinkedList();
    }

    public void addEdge(int u,int w){
        nodes[u].add(w);
    }
}
