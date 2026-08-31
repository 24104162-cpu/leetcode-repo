// Last updated: 8/31/2026, 9:54:25 AM
class Solution {
    public int countSpecialIntegers(int[] nums) {
       Map<Integer,Integer>fs=new HashMap<>();
        Map<Integer,Integer>ls=new HashMap<>();
        Map<Integer,Integer>c=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(!fs.containsKey(num)){
                fs.put(num,i);
            }
            ls.put(num,i);
            c.put(num,c.getOrDefault(num,0)+1);
        }
        int specialCount=0;
        for(int num:c.keySet()){
            int span=ls.get(num)-fs.get(num)+1;
            if(c.get(num)==span){
                specialCount++;
            }
        }
        return specialCount;
    }
}