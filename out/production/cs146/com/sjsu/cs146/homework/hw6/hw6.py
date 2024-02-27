from typing import List
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        manifest = set()
        nonDup = []
    
        for num in nums:
            manifest.add(num)
        
        for num in manifest:
            nums.remove(num)
            map = {}
            for i in range (0, len(nums) - 1):
                if not nums[i] in map.keys():
                    map.update({nums[i] : i})
                    target = -(num + nums[i])
                
                if target in map.keys():
                    trip = [num, nums[i], target]
                    trip.sort()
                    nonDup.append(trip)
            nums.append(num)
        tuples = {tuple(inner) for inner in nonDup}
        return [list(inner) for inner in tuples]

soln = Solution()
print(soln.threeSum([-1,0,1,2,-1,-4,2]))