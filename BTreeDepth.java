package by.piatkouskaya.week.third.task2;

import by.piatkouskaya.week.third.BTree;
import by.piatkouskaya.week.third.Node;

public class BTreeDepth {

    private int getDepthOfBTree(BTree bTree) {
        int counter = 0;
        getDepthOfNode(bTree.getNodes().get(0), counter);

        return counter;
    }

    private int getDepthOfNode(Node node, int counter) {
        if (node == null) {
            return counter;
        }
        if (node.getLeft() == null && node.getRight() == null) {
            return counter++;
        }
        int leftDepth = 0;
        int rightDepth = 0;
        if (node.getLeft() != null) {
            leftDepth = getDepthOfNode(node.getLeft(), counter++);
        }
        if (node.getRight() != null) {
            rightDepth = getDepthOfNode(node.getRight(), counter++);
        }
        if (leftDepth > rightDepth) {
            counter = leftDepth;
        } else {
            counter = rightDepth;
        }

        return counter;
    }
}
