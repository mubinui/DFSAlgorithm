public class Stack implements StackBuilder {
    public int size = 0;
    public Node head;
    public Node tail;

    public int Size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }



    @Override
    public void push(Object e ) {
        if (isEmpty()){
            head = new Node(e,null);
            tail = head;
        }
        else{
            Node x = new Node(e,null);
            tail.next = x;
            tail = x;
        }
        size++;
    }

    @Override
    public Object pop() throws Exception {
        Node x  = null;
        Object pooped = null;
        if(!isEmpty()){
            pooped = tail.elem;
            for(Node n = head; n!=tail;n=n.next){
                x = n;
            }
            tail = x;
            tail.next = null;
            size--;
        }
        return pooped;
    }

    @Override
    public Object peek() {
        Object peeked = null;
        if (!isEmpty()){
            peeked = tail.elem;
        }


        return peeked;
    }
}
