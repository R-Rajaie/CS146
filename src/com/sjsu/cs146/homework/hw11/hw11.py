class Solution():
    def isIn(image, m, n, sr, sc, num, color):
        return not (sr < 0 or sr >= m or sc < 0 or sc >= n or image[sr][sc] != num or image[sr][sc] == color)
    
    def floodFill(self, image, sr, sc, color):
        return Solution.helper(image, len(image), len(image[0]), sr, sc, image[sr][sc], color)
        
    def helper(image, m, n, sr, sc, num, color):
        queue = []
        queue.append([sr, sc])
        image[sr][sc] = color

        while queue:
            current = queue.pop()

            x = current[0]
            y = current[1]

            if Solution.isIn(image, m, n, x + 1, y, num, color):
                image[x + 1][y] = color
                queue.append([x + 1, y])

            if Solution.isIn(image, m, n, x - 1, y, num, color):
                image[x - 1][y] = color
                queue.append([x - 1, y])

            if Solution.isIn(image, m, n, x, y + 1, num, color):
                image[x][y + 1] = color
                queue.append([x, y + 1])

            if Solution.isIn(image, m, n, x + 1, y, num, color):
                image[x][y - 1] = color
                queue.append([x, y - 1])

        return image