from typing import List

class Solution:
    def findTheCity(
        self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:

        def dijkstra(u: int) -> int:
            distances = [float('inf')] * n
            distances[u] = 0
            visited = [False] * n
            for _ in range(n):
                k = -1
                for j in range(n): 
                    if not visited[j] and (k == -1 or distances[k] > distances[j]): k = j
                visited[k] = True
                for j in range(n):
                    if distances[k] + g[k][j] < distances[j]: distances[j] = distances[k] + g[k][j]
            return sum(d <= distanceThreshold for d in distances)

        g = [[float('inf')] * n for _ in range(n)]
        for a, b, c in edges: g[a][b] = g[b][a] = c
        ans, cnt = n, float('inf')

        for i in range(n - 1, -1, -1):
            if (t := dijkstra(i)) < cnt: cnt, ans = t, i
        return ans