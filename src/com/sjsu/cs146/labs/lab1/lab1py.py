# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# You can return the answer in any order.

nums = [1, 2, 3, 4, 5]
target = 0
list = {}
print(nums)

for i in range(0,10):
    target = i
    print(str(target) + ": ")

    for j in range(0, len(nums)):
        list.update({nums[j]: j})
        if ((target - nums[j]) in list) and (target - nums[j] != nums[j]):
            print("indexes " + str(list.get(nums[j])) + " and " + str(list.get(target - nums[j])))
            break
    