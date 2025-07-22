class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> x = new ArrayList<>();
        for (int i=0;i<n;i++){
            x.add(new ArrayList<>());
        }
        for (int[] e:edges) {
            x.get(e[0]).add(e[1]);
            x.get(e[1]).add(e[0]);
        }

        boolean v[]=new boolean[n];
        Queue <Integer> y=new LinkedList<>();
        y.add(source);
        v[source]=true;
        while(!y.isEmpty()){
            int z=y.poll();
            if(z==destination){
                return true;
            }
            for (int i:x.get(z)) {
                if(!v[i]){
                    y.add(i);
                    v[i]=true;
                }
            }
        }
            return false;
        

    }
}
