package com.dragos.lca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestLCA {
    /*
          20
         /  \
        8   22
       /\
      4  12
         /\
       10  14
     */
    @Test
    public void testLCA(){
        Node node14 = new Node(14);
        Node node10 = new Node(10);

        Node node12 = new Node(12);
        node12.setLeft(node10);
        node12.setRight(node14);

        Node node4 = new Node(4);
        Node node22 = new Node(22);
        Node node8 = new Node(8);
        node8.setLeft(node4);
        node8.setRight(node12);

        Node node20 = new Node(20); //root
        node20.setLeft(node8);
        node20.setRight(node22);

        assertEquals(12, LCA.getLCA(node20, node10, node14).getData());
        assertEquals(8, LCA.getLCA(node20, node14, node8).getData());
        assertEquals(20, LCA.getLCA(node20, node10, node22).getData());
    }
}
