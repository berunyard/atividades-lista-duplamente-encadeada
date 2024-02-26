public class Node {
    Node next, prev;
    Integer value;

    public Node(Node next, Node prev, Integer value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public Node(Integer value) {
        this.next = null;
        this.prev = null;
        this.value = value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
