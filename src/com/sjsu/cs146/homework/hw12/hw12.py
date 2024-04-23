from typing import *

class Solution:
    def minCostToSupplyWater(
        self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        
        def find(x: int) -> int:
            if p[x] != x: p[x] = find(p[x])
            return p[x]

        for i, w in enumerate(wells, 1): pipes.append([0, i, w])
        
        pipes.sort(key=lambda x: x[2])
        
        p = list(range(n + 1))
        
        ans = 0
        for a, b, c in pipes:
            parenta, parentb = find(a), find(b)
            
            if parenta != parentb:
                p[parenta] = parentb
                n -= 1
                ans += c
                if n == 0: return ans