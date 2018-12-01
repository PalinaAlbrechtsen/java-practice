package by.piatkouskaya.week.third.task1;

import by.piatkouskaya.week.third.BTree;
import by.piatkouskaya.week.third.Node;
import com.sun.istack.internal.NotNull;

public class BTreeNodeCounter {

    private int countNodes(@NotNull BTree bTree) {
        int counter = 0;
        countNode(bTree.getNodes().get(0), counter);

        return counter;
    }

    private int countNode(Node node, int counter) {

        if (node.getLeft() != null) {
            countNode(node, counter);
            counter++;
        }
        if (node.getRight() != null) {
            countNode(node, counter);
            counter++;
        }

        return counter;
    }
}