from typing import List

class Solution: 

    def coinChange(self, coins: List[int], amount: int):
        table = [-1] * (amount + 1)
        table[0] = 0
        return self.helper(coins, amount, table)
    
    def helper(self, coins:List[int], amount: int, table: List[int]):        
        if not (table[amount] == -1): return table[amount]
        count = 10000

        for i in range(len(coins)):
            if amount - coins[i] >= 0:
                curr = self.helper(coins, amount - coins[i], table)
                if (not curr == 10000) and curr + 1 < count: count = curr + 1

        table[amount] = count
        return table[amount]

sol = Solution()
coins = [1, 2, 5]
amount = 11
print(sol.coinChange(coins, amount))

    