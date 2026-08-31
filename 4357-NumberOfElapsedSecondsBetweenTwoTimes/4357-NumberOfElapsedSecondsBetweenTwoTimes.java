// Last updated: 8/31/2026, 9:55:11 AM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return getsec(endTime)-getsec(startTime);
    }
    private int getsec(String time){
        String[] parts=time.split(":");
        int h=Integer.parseInt(parts[0]);
        int m=Integer.parseInt(parts[1]);
        int s=Integer.parseInt(parts[2]);
        return (h*3600)+(m*60)+(s);
    }
}