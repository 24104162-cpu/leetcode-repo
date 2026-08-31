// Last updated: 8/31/2026, 9:56:11 AM
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
      TreeSet<Integer>timestamps=new TreeSet<>();
        for(int[] point:series1){
            timestamps.add(point[0]);
        }
        for(int[] point: series2){
            timestamps.add(point[0]);
        }
        List<Integer>sortedTimes=new ArrayList<>(timestamps);
        List<List<Integer>>result=new ArrayList<>();
        int i=series1.length-1;
        int j=series2.length-1;
        int v1=0;
        int v2=0;
        for(int k=sortedTimes.size()-1;k>=0;k--){
            int t=sortedTimes.get(k);
            while(i>=0 && series1[i][0]>=t){
                v1=series1[i][1];
                i--;
            }
            while(j>=0 && series2[j][0]>=t){
                v2=series2[j][1];
                j--;
            }
            result.add(Arrays.asList(t,v1+v2));
        }
        Collections.reverse(result);
        return result;
    }
}