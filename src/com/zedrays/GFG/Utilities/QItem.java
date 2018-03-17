package com.zedrays.GFG.Utilities;

import com.zedrays.Common.TreeNode;

/**
 * Created by zedray on 2/24/18.
 */
public class QItem {

    int hd;

    TreeNode node;

    public QItem(int hd, TreeNode node) {
        this.hd = hd;
        this.node = node;
    }

    public TreeNode getNode() {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public int getHd() {

        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }
}
