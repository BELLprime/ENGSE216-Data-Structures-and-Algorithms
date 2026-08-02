package Datastructure.LinkedLisr_Singly;

public class Node {
    int info;
    Node link;

    public Node() {
        this(0);
    }
    public Node(int item) {
        this.info = item;
        this.link = null;
    }  

}
