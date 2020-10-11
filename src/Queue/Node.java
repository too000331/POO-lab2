package Queue;

public class Node {
    public int Value;
    public Node NextNode;

    public Node(int value) {
        Value = value;
    }

    public int getValue() {
        return Value;
    }

    public Node getNextNode() {
        return NextNode;
    }

    public void setNextNode(Node nextNode) {
        NextNode = nextNode;
    }
}
