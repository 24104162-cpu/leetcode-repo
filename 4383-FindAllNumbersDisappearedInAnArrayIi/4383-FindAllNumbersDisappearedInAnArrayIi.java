// Last updated: 8/31/2026, 9:54:41 AM
class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>>result=new ArrayList<>();
        TreeSet<Integer>sortedSet=new TreeSet<>();
        for(int num:nums){
            sortedSet.add(num);
        }
        int curr=lower;
        for(int num:sortedSet){
            if(num<lower) continue;
            if(num>upper)break;
            if(num>curr){
                result.add(Arrays.asList(curr,num-1));
            }
            curr=num+1;
        }
        if(curr<=upper){
            result.add(Arrays.asList(curr,upper));
        }
        return result;
    }
}