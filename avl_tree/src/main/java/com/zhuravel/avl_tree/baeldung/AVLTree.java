package com.zhuravel.avl_tree.baeldung;

public class AVLTree {
    private Node root;

    void updateHeight(Node n) {
        n.setHeight(1 + Math.max(height(n.getLeft()), height(n.getRight())));
    }

    int height(Node n) {
        return n == null ? -1 : n.getHeight();
    }

    Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        } else if (node.getKey() > key) {
            node.setLeft(insert(node.getLeft(), key));
        } else if (node.getKey() < key) {
            node.setRight(insert(node.getRight(), key));
        } else {
            throw new RuntimeException("Duplicate Key!");
        }
        return rebalance(node);
    }

    Node delete(Node node, int key) {
        if (node == null) {
            return node;
        } else if (node.getKey() > key) {
            node.setLeft(delete(node.getLeft(), key));
        } else if (node.getKey() < key) {
            node.setRight(delete(node.getRight(), key));
        } else {
            if (node.getLeft() == null || node.getRight() == null) {
                node = (node.getLeft() == null) ? node.getRight() : node.getLeft();
            } else {
                Node mostLeftChild = mostLeftChild(node.getRight());
                node.setKey(mostLeftChild.getKey());
                node.setRight(delete(node.getRight(), node.getKey()));
            }
        }
        if (node != null) {
            node = rebalance(node);
        }
        return node;
    }

    Node find(int key) {
        Node current = root;
        while (current != null) {
            if (current.getKey() == key) {
                break;
            }
            current = current.getKey() < key ? current.getRight() : current.getLeft();
        }
        return current;
    }

    int getBalance(Node n) {
        return (n == null) ? 0: height(n.getRight()) - height(n.getLeft());
    }

    private Node rotateRight(Node n) {
        Node x = n.getLeft();
        Node z = x.getRight();

        x.setRight(n);
        n.setLeft(z);

        updateHeight(x);
        updateHeight(n);
        return x;
    }

    private Node rotateLeft(Node n) {
        Node x = n.getRight();
        Node z = x.getLeft();

        x.setLeft(n);
        n.setRight(z);

        updateHeight(x);
        updateHeight(n);
        return x;
    }

    private Node rebalance(Node z) {
        updateHeight(z);
        int balance = getBalance(z);
        if (balance > 1) {
            if (height(z.getRight().getRight()) > height(z.getRight().getLeft())) {
                z = rotateLeft(z);
            } else {
                z.setRight(rotateRight(z.getRight()));
                z = rotateLeft(z);
            }
        } else if (balance < -1) {
            if (height(z.getLeft().getLeft()) > height(z.getLeft().getRight())) {
                z = rotateRight(z);
            } else {
                z.setLeft(rotateLeft(z.getLeft()));
                z = rotateRight(z);
            }
        }
        return z;
    }

    private Node mostLeftChild(Node node) {
        Node current = node;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }
}
