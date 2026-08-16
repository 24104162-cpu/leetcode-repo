# Last updated: 8/16/2026, 8:11:59 AM
1class Solution(object):
2    def minPenalty(self, period, lights, arrivalTime):
3       max_light=max(lights)
4       max_waiting_time = 0;
5        
6       for t in arrivalTime:
7            r = t % period
8            if r >= max_light:
9                max_waiting_time = max(max_waiting_time,period-r)
10
11       return max_waiting_time
12        