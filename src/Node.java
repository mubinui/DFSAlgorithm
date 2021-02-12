public class Node {
    public Node next;
    public Object elem;

    public Node(Object o,Node n){
        this.next = n;
        this.elem = o;

    }

}
