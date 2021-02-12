public class List implements ListBulilder{
    public int size =0;
    public Node head ;
    public Node tail;

    public int Size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return Size()==0;
    }
    public void add(Object o ){
        if (isEmpty()){
            head = new Node(o,null);
            tail = head;
        }
        else{
            Node x = new Node(o,null);
            tail.next = x;
            tail = x;
        }
        size++;


    }
}
