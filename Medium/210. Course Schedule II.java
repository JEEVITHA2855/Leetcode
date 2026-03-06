import java.util.*;

class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<numCourses;i++)
            graph.add(new ArrayList<>());

        for(int[] p:prerequisites){
            int u=p[0];
            int v=p[1];
            graph.get(v).add(u);
        }

        boolean[] visited=new boolean[numCourses];
        boolean[] pathVisited=new boolean[numCourses];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(dfs(i,graph,visited,pathVisited,stack))
                return new int[0];
            }
        }
        int[] result=new int[numCourses];
        int i=0;

        while(!stack.isEmpty())
            result[i++]=stack.pop();
        return result;
    }

    private boolean dfs(int node,ArrayList<ArrayList<Integer>> graph,
                        boolean[] visited,boolean[] pathVisited,Stack<Integer> stack){
        visited[node]=true;
        pathVisited[node]=true;

        for(int i:graph.get(node)){

            if(!visited[i]){
            if(dfs(i,graph,visited,pathVisited,stack))
                return true;
            }
            else if(pathVisited[i])
                return true;
        }
        pathVisited[node]=false;
        stack.push(node);
        return false;
    }
}
