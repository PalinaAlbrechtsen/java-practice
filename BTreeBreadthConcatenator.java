package by.piatkouskaya.week.third.task4;

import by.piatkouskaya.week.third.BTree;
import by.piatkouskaya.week.third.Node;
import com.sun.istack.internal.NotNull;

import java.util.LinkedList;
import java.util.Queue;

public class BTreeBreadthConcatenator {

    private String concatValuesBreadth(@NotNull BTree bTree) {
        String line = null;
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(bTree.getNodes().get(0));

        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            if (line == null) {
                line = node.getValue().toString();
            } else {
                line = line.concat(node.getValue().toString());
            }
            if (node.getLeft() != null) {
                nodes.add(node.getLeft());
            }
            if (node.getRight() != null) {
                nodes.add(node.getRight());
            }
        }

        return line;
    }
}
