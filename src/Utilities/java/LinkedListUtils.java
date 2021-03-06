package Utilities.java;

public class LinkedListUtils {

    public static class Node {
        public int data;
        public Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node createLinkedListFrom(int... values) {
        Node root = new Node(values[0]);
        Node result = root;

        for (int i = 1; i < values.length; i++) {
            Node node = new Node(values[i]);
            root.next = node;
            root = node;
        }

        return result;
    }

    public static void printLinkedList(Node root) {
        Node node = root;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static Node getNodeAtPosition(Node root, int position) {
        Node node = root;

        for (int i = 0; i < position; i++) {
            if (node == null)
                break;
            node = node.next;
        }

        return node;
    }

    public static boolean areEqual(final Node node, final Node other) {
        Node nodeRunner = node;
        Node otherRunner = other;
        while (nodeRunner != null && otherRunner != null) {
            if (nodeRunner.data != otherRunner.data) {
                return false;
            }
            nodeRunner = nodeRunner.next;
            otherRunner = otherRunner.next;
        }
        return nodeRunner == null && otherRunner == null;
    }
}
