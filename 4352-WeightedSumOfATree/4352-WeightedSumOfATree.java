// Last updated: 8/31/2026, 9:55:33 AM
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
       int n=parent.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int root=-1;
        for(int i=0;i<n;i++){
            if(parent[i]==-1){
                root=i;
            }else{
                adj.get(parent[i]).add(i);
            }
        }
        int[] depth=new int[n];
        int md=findDepths(root,1,adj,depth);

        long ts=0;
        for(int i=0;i<n;i++){
            long w=md-depth[i]+1;
            ts+=(long) nums[i]*w;
        }
        return ts;
    }
    private int findDepths(int u,int d,List<List<Integer>> adj,int[] depth){
        depth[u]=d;
        int cm=d;
        for(int v:adj.get(u)){
            cm=Math.max(cm,findDepths(v,d+1,adj,depth));
        }
        return cm;
    }
}