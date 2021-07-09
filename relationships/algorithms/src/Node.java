public class Node<T> {
    private T data;
    private Node next;

    public Node(T initialData) {
        this.data = initialData;
        this.next = null;
    }
    public Node() {
        this.data = null;
        this.next = null;
    }
}
