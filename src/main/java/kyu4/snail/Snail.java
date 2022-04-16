package kyu4.snail;

/*
Snail Sort

https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
 */

import java.util.ArrayList;
import java.util.List;

public class Snail {
    public static int[] snail(int[][] array) {


        if (array.length == 0 || array[0].length == 0) {
            int[] result = {};
            return result;
        }

        List<Integer> result = new ArrayList<>();  // change data type to List. Easier to work with
        int n = array.length;
        if (n == 0) return new int[0]; // dealing with edge cases
        int[][] visited = new int[n][n]; // create a visited matrix to mark visited elements
        int[] dx = {0, 1, 0, -1};   // setting the directions for the snail using x and y coordinates
        int[] dy = {1, 0, -1, 0};
        int x = 0, y = 0;  // initialize the starting point
        int d = 0; // initialize the direction
        for (int i = 0; i < n * n; i++) { // loop through the array
            result.add(array[x][y]);  // add the element to the result
            visited[x][y] = 1; // mark the element as visited
            int nx = x + dx[d];  // calculate the next x coordinate
            int ny = y + dy[d]; // calculate the next y coordinate
            if (nx < 0 || nx >= n || ny < 0 ||
                    ny >= n || visited[nx][ny] == 1) { // check if the next element is out of bounds or has been visited
                d = (d + 1) % 4; // change the direction
                nx = x + dx[d]; // calculate the next x coordinate update and do the same for y
                ny = y + dy[d];
            }
            x = nx;  // update the x & y coordinates
            y = ny;
        }
        return result.stream().mapToInt(i -> i).toArray();  // convert the List to an array
    }

    public static int[] snailHighestScore(int[][] array) {
        if (array[0].length == 0) return new int[0];
        int n = array.length;
        int[] answer = new int[n*n];
        int index=0;
        for (int i = 0; i<n/2; i++){
            for (int j = i; j < n-i; j++) answer[index++] = array[i][j];
            for (int j = i+1; j < n-i; j++) answer[index++] = array[j][n-i-1];
            for (int j = i+1; j < n-i; j++) answer[index++] = array[n-i-1][n-j-1];
            for (int j = i+1; j < n-i-1; j++) answer[index++] = array[n-j-1][i];
        }
        if (n%2 != 0) answer[index++] = array[n/2][n/2];
        return answer;
    }
}



