// Last updated: 8/31/2026, 9:54:44 AM
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int tx=target[0];
        int ty=target[1];
        int b=-1;
        int mind=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++){
            int dx=drones[i][0];
            int dy=drones[i][1];
            int maxr=drones[i][2];

            int d=Math.abs(dx-tx)+Math.abs(dy-ty);
            if(d<=maxr){
                if(d<mind){
                    mind=d;
                    b=i;
                }
            }
        }
        return b;
    }
    
}