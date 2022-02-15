package com.zhuravel.avl_tree.baeldung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AVLTreePrinter {

    public static void printNode(Node root) {
        int maxLevel = AVLTreePrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static void printNodeInternal(List<Node> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || AVLTreePrinter.isAllElementsNull(nodes)) {
            return;
        }

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        AVLTreePrinter.printWhitespaces(firstSpaces);

        List<Node> newNodes = new ArrayList<>();
        for (Node node: nodes) {
            if (node != null) {
                System.out.print(node.getKey());
                newNodes.add(node.getLeft());
                newNodes.add(node.getRight());
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            AVLTreePrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i < edgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                AVLTreePrinter.printWhitespaces((firstSpaces - i));
                if (nodes.get(j) == null) {
                    AVLTreePrinter.printWhitespaces((edgeLines + edgeLines + i + 1));
                    continue;
                }

                if (nodes.get(j).getLeft() != null) {
                    System.out.print("/");
                } else {
                    AVLTreePrinter.printWhitespaces(1);
                }

                AVLTreePrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).getRight() != null) {
                    System.out.print("\\");
                } else {
                    AVLTreePrinter.printWhitespaces(1);
                }

                AVLTreePrinter.printWhitespaces(edgeLines + edgeLines - i);
            }
            System.out.println("");
        }
        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static int maxLevel(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(AVLTreePrinter.maxLevel(node.getLeft()), AVLTreePrinter.maxLevel(node.getRight())) + 1;
    }

    private static boolean isAllElementsNull(List<Node> list) {
        for (Object object: list) {
            if (object != null) {
                return false;
            }
        }

        return true;
    }
}
