from typing import List
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        manifest = set()
        array = []
        nonDup = []
    
        for num in nums:
            manifest.add(num)
            array.append(num)
        
        for num in manifest:
            array.remove(num)
            map = {}
            for i in range (0, len(nums) - 1):
                if not nums[i] in map.keys():
                    map.update({nums[i] : i})
                    target = -(num + nums[i])
                
                if target in map.keys() and map.get(target) != i:
                    trip = [num, array[i], target]
                    trip.sort()
                    nonDup.append(trip)
            array.append(num)
        return nonDup

soln = Solution()
print(soln.threeSum([-1,0,1,2,-1,-4]))