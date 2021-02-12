public class Graph {
    public int V;
    public List list [] ;

    public Graph(int v){
        V = v;
        list = new List[v];
        for(int i = 0; i< list.length; i++){
            list[i] = new List();
        }

    }
    public void addEdge(int v , int e){
        list[v].add(e);
    }
    public void DFS(int va ){
        Stack stack = new Stack();
        boolean visited [] = new boolean[V];
        stack.push(va);
        visited[va] = true;

        while (!stack.isEmpty()){

            Node x = list[va].head;

            for(Node n = x; n!=null; n=n.next){
                if(!visited[(int)n.elem]){
                    stack.push((int)n.elem);
                    visited[(int)n.elem] = true;
                }

            }

        }


    }

}
