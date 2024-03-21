package com.sjsu.cs146.homework.hw11;

import java.util.*;
import java.awt.Point;

public class hw11 {
    public static void main(String[] args) {
        int[][] img ={
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };
        floodFill(img, 1, 1, 2);
        for (int[] array:img) {
            for (int i:array) System.out.print(i);
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
       return helper(image, image.length, image[0].length, sr, sc, image[sr][sc], color);
    }
    public static int[][] helper(int[][] image, int m, int n, int sr, int sc, int num, int color){
        Vector<Point> queue = new Vector<>();
        queue.add(new Point(sr, sc));
        image[sr][sc] = color;

        while(!(queue.isEmpty())){
            Point current = queue.get(queue.size() - 1);
            queue.remove(queue.size() - 1);

            int x = current.x;
            int y = current.y;

            if(isIn(image, m, n, x + 1, y, num, color)){
                image[x+1][y] = color;
                queue.add(new Point(x + 1, y));
            }
            if(isIn(image, m, n, x - 1, y, num, color)){
                image[x-1][y] = color;
                queue.add(new Point(x - 1, y));
            }
            if(isIn(image, m, n, x, y + 1, num, color)){
                image[x][y+1] = color;
                queue.add(new Point(x, y + 1));
            }
            if(isIn(image, m, n, x, y - 1, num, color)){
                image[x][y-1] = color;
                queue.add(new Point(x, y - 1));
            }
        }

        return image;
    }
    public static boolean isIn(int[][] image, int m, int n, int sr, int sc, int num, int color){
        return !(sr < 0 || sr >= m || sc < 0 || sc >= n || image[sr][sc] != num || image[sr][sc] == color);
    }
}
