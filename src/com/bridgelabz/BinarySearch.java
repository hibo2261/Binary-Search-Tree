package com.bridgelabz;

public class BinarySearch<T extends Comparable<T>> {
    INode root;

    public BinarySearch() {
        this.root = null;
    }

    public void insert(int value) {
        this.root = this.recursively(root, (int) value);
    }

    public INode recursively(INode root, int value) {
        // checking whether root is null
        if (root == null) {
            root = new INode(value);
            return root;
        }
        if (value < root.value) // insert in the left subtree
            root.left = recursively(root.left, value);
        else if (value > root.value) // insert in the right subtree
            root.right = recursively(root.right, value);
        return root;
    }

    public void display() {
        displayRecursive(root);
    }

    public INode displayRecursive(INode root) {
        if (root != null) {
            displayRecursive(root.left);
            System.out.print(root.value + " ");
            displayRecursive(root.right);
        }
        return root;
    }
}