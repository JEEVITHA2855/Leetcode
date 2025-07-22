class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return List.of(0);
        List<List<Integer>> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(new ArrayList<>());
        }
        int[] a = new int[n];
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            x.get(u).add(v);
            x.get(v).add(u);
            a[u]++;
            a[v]++;
        }
        Queue<Integer> y=new LinkedList<>();
        for(int i=0;i<n;i++) {
            if(a[i]==1) {
                y.add(i);
            }
        }
        while(n>2){
            int m=y.size();
            n-=m;
            for(int i=0;i<m;i++) {
                int z=y.poll();
                for(int neighbor:x.get(z)) {
                    a[neighbor]--;
                    if (a[neighbor]==1) {
                        y.add(neighbor);
                    }
                }
            }
        }
        return new ArrayList<>(y);
    }
}
