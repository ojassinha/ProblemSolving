package com.zedrays.GFG;

import apple.laf.JRSUIUtils;
import com.zedrays.Common.BasicExecutionDS;
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
            default:
                System.out.print("Error in execution, please give proper problem name");
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

            System.out.println(queue.poll());
            if(rootNode.getLeftTreeNode()!=null)
                queue.add(rootNode.getLeftTreeNode());
            if(rootNode.getRightTreeNode() != null)
                queue.add(rootNode.getRightTreeNode());
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
    public void insert(int data, TreeNode rootTreeNode) {

    }

    @Override
    public void delete(int data, TreeNode rootTreeNode) {

    }

    @Override
    public TreeNode search(int data) {
        return null;
    }
}
