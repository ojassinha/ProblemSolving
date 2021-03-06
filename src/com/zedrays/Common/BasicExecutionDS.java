package com.zedrays.Common;

import java.util.TreeMap;

/**
 * Created by zedray on 2/9/18.
 */
public interface BasicExecutionDS {

    TreeNode build();
    void run(String problemName, TreeNode node);
    TreeNode insert(int data, TreeNode rootTreeNode);
    void delete(int data,TreeNode rootTreeNode);
    TreeNode search(int data);

    Graph buildGraph();
    void runGraph(String problemName,Graph graph);
}

