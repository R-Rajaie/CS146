from typing import List
class soln:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:  
        length =  len(intervals)
        cntr = 0

        starts = []
        ends = []

        for i in intervals:
            starts.append(i[0])
            ends.append(i[1])

        starts.sort()
        ends.sort()

        k = 0
        for j in range(0, length):
            if starts[j] < ends[k]: cntr += 1
            else: k += 1
    
        return cntr

solution = soln()
print(solution.minMeetingRooms([[1,2],[0,1],[2,3]]))