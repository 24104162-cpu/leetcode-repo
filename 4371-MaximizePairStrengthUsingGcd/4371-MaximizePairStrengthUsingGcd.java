// Last updated: 8/31/2026, 9:54:50 AM
class Solution {
    public long maxPairStrength(int[] nums) {
       int n=nums.length;
        long maxs=0;
        Arrays.sort(nums);
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                long a=nums[i];
                long longB=nums[j];
                if(a*longB<=maxs){
                    break;
                }
                long g=gcd(a,longB);
                long s=(a*longB)/(g*g);
                if(s>maxs){
                    maxs=s;
                }
            }
        }
            return maxs;
        }
        private long gcd(long a,long b){
            while(b!=0){
                long temp=b;
                b=a%b;
                a=temp;
            }
            return a;
        }
        }