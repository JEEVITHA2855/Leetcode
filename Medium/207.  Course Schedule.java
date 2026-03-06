class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            int u=p[0];
            int v=p[1];
            graph.get(u).add(v);
        }
        boolean[] visited=new boolean[numCourses];
        boolean[] pathVisited=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if (dfs(i,graph,visited,pathVisited)) {
                    return false;
                }
            }
        }
        return true;  
    }
    public boolean dfs(int node,ArrayList<ArrayList<Integer>> graph,
                        boolean[] visited,
                        boolean[] pathVisited){
        visited[node]=true;
        pathVisited[node]=true;
        
        for (int i:graph.get(node)){
            if(!visited[i]){
                if(dfs(i,graph,visited,pathVisited)) {
                    return true;
                }
            }
              else if (pathVisited[i]){
                return true; 
            }
        }pathVisited[node]=false; 
        return false;
    
}
}
