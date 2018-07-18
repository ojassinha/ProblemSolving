package com.zedrays.GFG;

import apple.laf.JRSUIUtils;
import com.zedrays.Common.BasicExecutionDS;
import com.zedrays.Common.Graph;
import com.zedrays.Common.TreeNode;
import com.zedrays.GFG.Utilities.QItem;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zedray on 2/9/18.
 */
public class GFGProblemsDSImpl implements GFGProblemsDS, BasicExecutionDS {


    @Override
    public void run(String problemName,TreeNode node) {

        switch (problemName){
            case "topview":
                printTopViewOfTree(node);
                break;
            case "lot":
                printLevelOrderTraversal(node);
                break;
            default:
                System.out.print("Error in execution, please give proper problem name");
        }

    }


    @Override
    public void graphBFS(int sourceNode) {
        if(this.graph != null){
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(sourceNode);

            boolean[] visited = new boolean[graph.V];



            while (!queue.isEmpty()){

                sourceNode = queue.poll();
                System.out.println("Current node picked up : " + sourceNode);

                visited[sourceNode] = true;

                Iterator<Integer> iterator = graph.nodes[sourceNode].listIterator();
                while (iterator.hasNext()){
                    int n = iterator.next();
                    if(!visited[n]){
                        queue.add(n);
                        visited[n] = true;
                    }

                }
            }
        }
    }

    TreeNode rootNode;
    @Override
    public void printTopViewOfTree(TreeNode rootNode) {

        this.rootNode= rootNode;
        Map<Integer,Integer> result = new HashMap<>();
        Queue<QItem> tempQueue = new LinkedList<>();

        if(rootNode == null){
            return ;
        }

        int position = 0;
        tempQueue.add(new QItem(position,rootNode));


        while (tempQueue.peek()!=null){

            QItem tempNode = tempQueue.poll();

            if(!result.containsKey(tempNode.getHd()))
                result.put(tempNode.getHd(),tempNode.getNode().getData());

            position =  tempNode.getHd();

            if(tempNode.getNode().getLeftTreeNode() != null){

                tempQueue.add(new QItem(position-1,tempNode.getNode().getLeftTreeNode()));

            }

            if(tempNode.getNode().getRightTreeNode() != null){
                tempQueue.add(new QItem(position+1,tempNode.getNode().getRightTreeNode()));

            }

        }



       for(Map.Entry<Integer,Integer> entry:result.entrySet()){
            System.out.print(entry.getValue()+" ");
       }


    }

    @Override
    public void printLevelOrderTraversal(TreeNode rootNode) {
        this.rootNode=rootNode;
        Queue<TreeNode> queue= new LinkedList<TreeNode>();

        if(rootNode == null){
            return;
        }

        queue.add(rootNode);

        while (!queue.isEmpty()){

            TreeNode newNode = queue.poll();
            System.out.println(newNode.getData());
            if(newNode.getLeftTreeNode()!=null)
                queue.add(newNode.getLeftTreeNode());
            if(newNode.getRightTreeNode() != null)
                queue.add(newNode.getRightTreeNode());
        }
    }

    Graph graph;
    @Override
    public Graph buildGraph() {
        graph = new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(0,2);
        graph.addEdge(2,3);
        graph.addEdge(3,3);

        return graph;
    }

    @Override
    public void runGraph(String problemName, Graph graph) {
        switch (problemName){
            case "bfs":
                graphBFS(2);
                break;

            default:
                System.out.print("Error in execution, please give proper problem name");
        }
    }

    @Override
    public TreeNode build() {

        this.rootNode =  new TreeNode(1);
        rootNode.setLeftTreeNode(new TreeNode(2));
        rootNode.setRightTreeNode(new TreeNode(3));
        rootNode.getLeftTreeNode().setRightTreeNode(new TreeNode(4));
        rootNode.getLeftTreeNode().getRightTreeNode().setRightTreeNode(new TreeNode(5));
        rootNode.getLeftTreeNode().getRightTreeNode().getRightTreeNode().setRightTreeNode(new TreeNode(6));

        return rootNode;
    }

    @Override
    public TreeNode insert(int data, TreeNode rootTreeNode) {

        TreeNode newNode = new TreeNode(data);

        TreeNode tempNode;
        while (rootTreeNode != null){

            if(data < rootTreeNode.getData()){
                tempNode = rootTreeNode;
                rootTreeNode = rootTreeNode.getLeftTreeNode();

            }else if(data > rootTreeNode.getData()){
                tempNode = rootTreeNode;
                rootTreeNode = rootTreeNode.getRightTreeNode();
            }

        }

        if(data > rootTreeNode.getData()){
            rootTreeNode.setRightTreeNode(newNode);
        }else{
            rootTreeNode.setLeftTreeNode(newNode);
        }

        return newNode;


    }

    @Override
    public void delete(int data, TreeNode rootTreeNode) {

    }

    @Override
    public TreeNode search(int data) {
        return null;
    }
}
