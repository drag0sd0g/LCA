package com.dragos.lca;

public final class LCA {
    public static final Node getLCA(Node root, Node firstNode, Node secondNode){
        while(root != null){
            if(firstNode.getData() < root.getData() && secondNode.getData() < root.getData()){
                root = root.getLeft();
            } else if (root.getData() < secondNode.getData() && root.getData() < firstNode.getData()){
                root = root.getRight();
            } else {
                break;
            }
        }
        return root;
    }
}
