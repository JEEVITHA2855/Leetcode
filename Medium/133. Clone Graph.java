class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;

        Map<Node,Node> x = new HashMap<>();
        return dfs(node,x);
    }
    
    private Node dfs(Node cur,Map<Node,Node> x) {
        if(x.containsKey(cur)) return x.get(cur);

        Node copy=new Node(cur.val);
        x.put(cur,copy);

        for(Node nbr:cur.neighbors) {
            copy.neighbors.add(dfs(nbr,x));
        }

        return copy;
    }
}
