from collections import defaultdict, deque

class Solution: 
    def canFinish(numCourses, prerequisites):
        indegrees = [0] * numCourses
        graph = defaultdict(list)

        for a, b in prerequisites:
            graph[b].append(a)
            indegrees[a] += 1

        queue = deque([i for i in range(numCourses) if indegrees[i] == 0])
        
        completed_courses = 0

        while queue:
            c = queue.popleft()
            completed_courses += 1

            for cc in graph[c]:
                indegrees[cc] -= 1
                if indegrees[cc] == 0:
                    queue.append(cc)

        return completed_courses == numCourses