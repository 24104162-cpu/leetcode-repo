// Last updated: 8/23/2026, 8:20:22 AM
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3        List<List<Integer>>result=new ArrayList<>();
4        TreeSet<Integer>sortedSet=new TreeSet<>();
5        for(int num:nums){
6            sortedSet.add(num);
7        }
8        int curr=lower;
9        for(int num:sortedSet){
10            if(num<lower) continue;
11            if(num>upper)break;
12            if(num>curr){
13                result.add(Arrays.asList(curr,num-1));
14            }
15            curr=num+1;
16        }
17        if(curr<=upper){
18            result.add(Arrays.asList(curr,upper));
19        }
20        return result;
21    }
22}