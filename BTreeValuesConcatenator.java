package by.piatkouskaya.week.third.task3;

import by.piatkouskaya.week.third.Node;

public class BTreeValuesConcatenator {

    private String concatValuesPreOrder(Node node, String line) {

        line = line.concat(node.getValue().toString());
        if (node.getLeft() != null) {
            concatValuesPreOrder(node, line);
        }
        if (node.getRight() != null) {
            concatValuesPreOrder(node, line);
        }

        return line;
    }

    private String concatValuesPostOrder(Node node, String line) {

        if (node.getLeft() != null) {
            concatValuesPostOrder(node, line);
        }
        if (node.getRight() != null) {
            concatValuesPostOrder(node, line);
        }
        line = line.concat(node.getValue().toString());

        return line;
    }

    private String concatValuesInOrder(Node node, String line) {

        if (node.getLeft() != null) {
            concatValuesInOrder(node, line);
        }
        line = line.concat(node.getValue().toString());
        if (node.getRight() != null) {
            concatValuesInOrder(node, line);
        }

        return line;
    }
}
