package com.zedrays.Common;

/**
 * Created by zedray on 2/9/18.
 */
public class TreeNode {

    private int data;
    private TreeNode leftTreeNode;
    private TreeNode rightTreeNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    public TreeNode(int data){
        this.data=data;
        leftTreeNode =null;
        rightTreeNode =null;
    }
}
