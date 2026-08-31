// Last updated: 8/31/2026, 9:56:35 AM
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
     List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
           
        }
        int[][]dist=new int[n][k+1];
        for(int[]row:dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        dist[0][1]=0;
        pq.offer(new int[]{0,0,1});

        while(!pq.isEmpty()){
            int[]curr=pq.poll();
            int d=curr[0],u=curr[1],cc=curr[2];
            if(u==n-1)return d;
            if(d>dist[u][cc])continue;

            for(int[]nxt:adj.get(u)){
                int v=nxt[0],nextCc=(labels.charAt(v)==labels.charAt(u))?cc+1:1;
                if(nextCc<=k && d+nxt[1]<dist[v][nextCc]){
                    dist[v][nextCc]=d+nxt[1];
                    pq.offer(new int[]{dist[v][nextCc],v,nextCc});
                }
            }
        }
         return -1;   
        
    }
}