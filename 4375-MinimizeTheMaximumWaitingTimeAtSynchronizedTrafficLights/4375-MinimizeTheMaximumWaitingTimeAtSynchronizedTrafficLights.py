# Last updated: 8/31/2026, 9:54:47 AM
class Solution(object):
    def minPenalty(self, period, lights, arrivalTime):
       max_light=max(lights)
       max_waiting_time = 0;
        
       for t in arrivalTime:
            r = t % period
            if r >= max_light:
                max_waiting_time = max(max_waiting_time,period-r)

       return max_waiting_time
        