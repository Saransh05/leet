class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean visited[] = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();                          //DFS approach
        for(int i=0; i<n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return dfs(adj, visited, source, destination);
    }

    private boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited,  int curr, int dest) {
        if(curr == dest)
            return true;

        if(visited[curr])
            return false;
        
        visited[curr] = true;
        for(int i=0; i<adj.get(curr).size(); i++) {
            if(dfs(adj, visited, adj.get(curr).get(i), dest))
                return true;
        }
        return false;
    }
}